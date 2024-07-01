-- 3) Criar um trigger que, quando for feita uma venda de um determinado
--produto, seja feito um Insert na tbSaidaProduto

use bdEstoqueTriggers

CREATE TRIGGER tgVendaProduto ON tbSaidaProduto AFTER INSERT 
AS
	DECLARE @idProduto INT, @quantidadeSaidaProduto INT
	SET @idProduto = (SELECT idProduto FROM INSERTED)
	SET @quantidadeSaidaProduto = (SELECT quantidadeSaidaProduto FROM INSERTED)
	SET @idProduto = (SELECT idProduto FROM tbSaidaProduto WHERE idSaidaProduto = @idProduto)
	UPDATE tbProduto
		SET quantidadeProduto = quantidadeProduto - @quantidadeSaidaProduto
			WHERE idProduto = @idProduto