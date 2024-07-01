USE bdBancoEtec

--a) Criar uma view vwSaldoTotal obtendo o nome do correntista, o saldo da Conta corrente, o Saldo da Poupan�a e a soma dos dois saldos --OK

CREATE VIEW vwSaldoTotal AS 
	SELECT nomeCorrentista, saldoCC, saldoCP, SUM(saldoCC + saldoCP) 'Soma' FROM tbCorrentista
		INNER JOIN tbContaCorrente ON tbContaCorrente.codCorrentista = tbCorrentista.codCorrentista
			INNER JOIN  tbContaPoupanca ON tbContaCorrente.codCorrentista = tbContaPoupanca.codCorrentista
				GROUP BY nomeCorrentista, saldoCC, saldoCP
			
			SELECT * FROM vwSaldoTotal
				
--b)Utilizando a view vwSaldoTotal anterior, ordenar os correntistas por ordem alfab�tica --OK

ALTER VIEW vwSaldoTotal AS
	SELECT nomeCorrentista FROM tbCorrentista 
	 
	SELECT * FROM vwSaldoTotal
	ORDER BY nomeCorrentista ASC

--c)Criar uma view vwProjecaoSaldoPoupanca informando o nome do correntista e o saldo da poupan�a atualizado ap�s acr�scimo de 0.5% no pr�ximo m�s --N�o sei se ta certo

CREATE VIEW vwProjecaoSaldoPoupanca AS
	SELECT nomeCorrentista, saldoCP FROM tbCorrentista
	INNER JOIN tbContaPoupanca ON tbContaPoupanca.codCorrentista = tbCorrentista.codCorrentista
	
	UPDATE tbContaPoupanca
	SET saldoCP = saldoCP + (saldoCP * 0.5)/100
	SELECT * FROM vwProjecaoSaldoPoupanca

--d)Criar uma view vwExibeCorrentista que exiba todos os dados da conta corrente ao lado do nome do correntista (exceto a senha num�rica e alfanum�rica),
--com a data de abertura da conta corrente no formato dd/mm/aaaa e o saldo da poupan�a

CREATE VIEW vwExibeCorrentista AS
	SELECT numeroAgenciaCC, numeroCC, digitoCC, saldoCC, convert(varchar, dataAberturaCC, 103) 'dataAberturaCC', saldoCP 'SaldoPoupanca', nomeCorrentista 'Correntista' FROM tbContaCorrente
		INNER JOIN tbCorrentista ON tbCorrentista.codCorrentista = tbContaCorrente.codCorrentista
			INNER JOIN tbContaPoupanca ON tbContaPoupanca.codCorrentista = tbCorrentista.codCorrentista
			
			SELECT * FROM vwExibeCorrentista

	

--e)Criar uma view vwCorrentistaConta que exiba o nome dos correntistas, o numero da conta corrente e o saldo na conta corrente,apenas daqueles que possuam mais de R$500000,00 na conta corrente.Utilizar essa view para exibir os dados ordenados por saldo da conta(do maior saldo para o menor saldo)
CREATE VIEW vwCorrentistaConta AS
	SELECT nomeCorrentista, numeroCC, saldoCC FROM tbContaCorrente
		INNER JOIN tbCorrentista ON tbCorrentista.codCorrentista = tbContaCorrente.codCorrentista
			 WHERE saldoCC > 500000.00
			  
				SELECT * FROM vwCorrentistaConta
				ORDER BY saldoCC DESC

--f)Criar uma view vwContaePoupanca que exiba o nome e cpf do correntista ao lado do saldo de conta corrente e do saldo de poupan�a
CREATE VIEW vwContaePoupanca AS
	SELECT  nomeCorrentista 'Nome', cpfCorrentista 'CPF', saldoCC 'SaldoCorrente', saldoCP 'SaldoPoupanca' FROM tbCorrentista
		INNER JOIN tbContaCorrente ON tbContaCorrente.codCorrentista = tbCorrentista.codCorrentista
		INNER JOIN tbContaPoupanca ON tbContaPoupanca.codCorrentista = tbCorrentista.codCorrentista
		
	SELECT * FROM vwContaePoupanca

--g)Criar uma view vwClienteProdutos que exiba o nome do correntista ao lado da quantidade de contas corrente que ele possui
	CREATE VIEW vwClienteProdutos AS	SELECT nomeCorrentista, COUNT(codContaCorrente) 'Quantidade Conta Corrente' FROM tbCorrentista		INNER JOIN tbContaCorrente ON tbContaCorrente.codCorrentista = tbCorrentista.codCorrentista		GROUP BY nomeCorrentista	SELECT * FROM vwClienteProdutos