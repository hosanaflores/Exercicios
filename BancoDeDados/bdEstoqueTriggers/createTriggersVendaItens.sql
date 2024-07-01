-- 1) Criar uma trigger que, ao ser feita uma venda ( Insert na tabela
--tbItensVenda ), todos os produtos vendidos tenham sua quantidade
--atualizada na tabela tbProduto . Exemplo, se foi feita uma venda de 5
--unidades do produto código 01, na tabela tbProduto a quantidade desse
--produto será a quantidade atual 5;

use bdEstoqueTriggers

CREATE TRIGGER tgVendaItens ON tbItensVenda AFTER INSERT 
AS
    DECLARE @idProduto INT, @quantidadeItens INT, @idItensVenda INT
    SET @idProduto = (SELECT idProduto FROM INSERTED)
    SET @quantidadeItens = (SELECT quantidadeItens FROM INSERTED)
    SET @idItensVenda = (SELECT idItensVenda FROM INSERTED)
    SET @idProduto = (SELECT idProduto FROM tbItensVenda WHERE idItensVenda = @idProduto)
    UPDATE tbProduto
        SET quantidadeProduto = quantidadeProduto - @quantidadeItens
            WHERE idProduto = @idProduto 
                UPDATE tbItensVenda
                    SET quantidadeItens = quantidadeItens - @quantidadeItens
                         WHERE idItensVenda = @idItensVenda