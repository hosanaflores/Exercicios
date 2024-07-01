 USE bdBancoEtec

 INSERT INTO tbCorrentista(nomeCorrentista, dataNascCorrentista, cpfCorrentista, rgCorrentista)
 VALUES('Rogerio Ceni', '1973-01-22', '123.456.789-00', '12.545.122-01'),
 ('Raí Víeira de Oliveira', '1965-05-15', '232.322.321-99', '18.332.232-10'),
 ('Armelindo Donizetti', '1965-10-10', '222.333.232-00', '12.433.233-00')


 INSERT INTO tbContaCorrente(numeroAgenciaCC, numeroCC, digitoCC, senhaNumericaCC, senhaAlfaNumericaCC, saldoCC, dataAberturaCC, codCorrentista)
 VALUES ('1021', '123.122', '11', '111111', '6B3L3M', '100000.00', '2017-10-10', 1),
 ('1022', '212.121', '12', '12211', '2x1SP', '90000.00', '2014-12-12', 2),
 ('1021', '123.121', '11', '123456', '01MITO', '1200000.00','2017-05-10', 1),
 ('1021', '324.544', '10', '839222', 'ZETT01', '23489.90', '2015-05-10', 3)

 INSERT INTO tbContaPoupanca(numeroAgenciaCP, numeroCP, digitoCP, saldoCP, dataAberturaCP, codCorrentista)
 VALUES ('1021', '434433', '4', '2000000.00', '2017-06-10', 1),
 ('1022', '3222222', '5', '4000000.00', '2017-05-15', 2),
 ('1021', '232222', '6', '220000.00', '2017-04-10', 3)