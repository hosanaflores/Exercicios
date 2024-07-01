CREATE TRIGGER tgAtualizaPontos ON tbMulta AFTER INSERT 
AS
	DECLARE @codMotorista INT, @codVeiculo INT, @numPontos INT
	SET @codVeiculo = (SELECT codVeiculo FROM INSERTED) 
	SELECT @numPontos = numPontos FROM INSERTED
	SET @codMotorista = (SELECT codMotorista FROM tbVeiculo WHERE codVeiculo = @codVeiculo)

	UPDATE tbMotorista 
		SET pontuacaoAcumulada = pontuacaoAcumulada + @numPontos
			WHERE codMotorista = @codMotorista

