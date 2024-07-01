--2) Criar um trigger que, quando for inserida uma nova entrada de produtos
--na tbEntradaProduto , a quantidade desse produto seja atualizada e
--aumentada na tabela tbProduto

use bdEstoqueTriggers

CREATE TRIGGER tgNovaEntrada ON tbEntradaProduto AFTER INSERT 
AS
	DECLARE @idProduto INT, @quantidadeEntradaProduto INT
	SET @idProduto = (SELECT idProduto FROM INSERTED)
	SET @quantidadeEntradaProduto = (SELECT quantidadeEntradaProduto FROM INSERTED)
	SET @idProduto = (SELECT idProduto FROM tbEntradaProduto WHERE idEntrada = @idProduto)
	UPDATE tbProduto
		SET quantidadeProduto = quantidadeProduto + @quantidadeEntradaProduto
			WHERE idProduto = @idProduto


