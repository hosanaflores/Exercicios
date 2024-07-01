use bdEscolaIdiomas

INSERT INTO tbAluno(nomeAluno, dataNascAluno, rgAluno, naturalidadeAluno)
VALUES ('Paulo Sanos', '2000-03-10', '82.282.122-0', 'SP'),
		('Maria da Gloria', '1999-10-03', '45.233.123-0', 'SP'),
		('Pedro Nogueira da Silva', '1998-04-04', '23.533.211-9', 'SP'),
		('Gilson Barros Silva', '1995-09-09', '34.211.11-x', 'PE'),
		('Mariana Barbosa Santos', '2001-10-10', '54.222.122-9', 'RJ'),
		('Alessandro Pereira', '2003-10-11', '24.402.454-9', 'ES'),
		('Aline Melo', '2001-10-08', '88.365.012-3', 'RJ')

INSERT INTO tbCurso(nomeCurso, cargahorariaCurso, valorCurso)
VALUES ('Inglês', '2000', 356.00 ),
		 ('Alemão', '3000', 478.00 ),
		  ('Espanhol', '4000', 500.00)

INSERT INTO tbTurma (nomeTurma, codCurso, horarioTurma )
VALUES ('1|A', 1, '1900-01-01 12:00:00'),
		('1|C', 3, '1900-01-01 18:00:00'),
		('1|B', 1, '1900-01-01 18:00:00'),
		('1|AA', 2, '1900-01-01 19:00:00')

INSERT INTO tbMatricula (dataMatricula, codAluno, codTurma)
VALUES ('2015-10-03', 6, 1),
		('2014-05-04', 7, 1),
		('2014-05-04', 2, 4),
		('2012-05-03', 3, 2),
		('2016-03-03', 1, 3),
		('2015-05-07', 4, 2),
		('2015-07-05', 5, 3)