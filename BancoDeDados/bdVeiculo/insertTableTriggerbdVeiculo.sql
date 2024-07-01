USE bdVeiculo

INSERT INTO tbMotorista(nomeMotorista, cpfMotorista)
	VALUES
	('José da Silva', '12345678900')
	,('Maria dos Santos ', '98765432100')

INSERT INTO tbVeiculo(placaVeiculo, renavam, anoFabricacao, codMotorista)
	VALUES 
	('ABC1234', '123456789', 2018, 1)
	,('FRZ0022', '908763223', 2015, 2)

INSERT INTO tbMulta(dataMulta, numPontos, codVeiculo)
	VALUES
	(GETDATE(), 5, 1)

SELECT * FROM tbMotorista
SELECT * FROM tbMulta
SELECT * FROM tbVeiculo 
