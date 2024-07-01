use bdEscolaIdiomas

--1) Apresentar os nomes dos alunos ao lado do nome dos cursos que eles fazem;

SELECT DISTINCT nomeAluno, nomeCurso, tbCurso.codCurso 
	FROM tbAluno INNER JOIN tbMatricula ON tbAluno.codAluno = tbMatricula.codAluno
		INNER JOIN tbTurma ON tbMatricula.codTurma = tbTurma.codTurma
			INNER JOIN tbCurso ON tbTurma.codCurso = tbCurso.codCurso

	
--2) Apresentar a quantidade de alunos matriculados por nome do curso;

SELECT COUNT(tbAluno.codAluno) 'Quantidade de alunos matriculados por curso', nomeCurso
	FROM tbAluno INNER JOIN tbMatricula
		ON tbAluno.codAluno = tbMatricula.codAluno
			INNER JOIN tbTurma ON tbMatricula.codTurma = tbTurma.codTurma
				INNER JOIN tbCurso ON tbTurma.codCurso = tbCurso.codCurso
					GROUP BY tbCurso.nomeCurso
	

--3) Apresentar a quantidade de alunos matriculados por nome da turma;

SELECT COUNT(tbMatricula.codTurma) 'Quantidade de alunos matriculados por Turma', nomeTurma
	FROM tbMatricula INNER JOIN tbTurma
		ON tbMatricula.codTurma = tbTurma.codTurma
			GROUP BY tbTurma.nomeTurma

--4) Apresentar a quantidade de alunos que fizeram matricula em março de 2016; 

SELECT COUNT(tbAluno.codAluno) 'Quantidade de alunos que se matricularam em março de 2016',dataMatricula
	FROM tbAluno INNER JOIN tbMatricula
		ON tbAluno.codAluno = tbMatricula.codMatricula
			Where dataMatricula >= '01/03/2016' and dataMatricula  <= '31/03/2016'
				GROUP BY tbMatricula.dataMatricula

--5) Apresentar o nome dos alunos em ordem alfabética ao lado do nome das turmas em que estão matriculados

SELECT nomeAluno, nomeTurma
	FROM tbAluno INNER JOIN tbMatricula
		ON tbAluno.codAluno = tbMatricula.codAluno
			INNER JOIN tbTurma
				ON tbMatricula.codTurma = tbTurma.codTurma
					ORDER BY nomeAluno asc 

--6) Apresentar o nome dos cursos e os horários em que eles são oferecidos

SELECT nomeCurso, horarioTurma
	FROM tbCurso INNER JOIN tbTurma
		ON tbCurso.codCurso = tbTurma.codCurso

--7) Apresentar a quantidade de alunos nascidos por estado

SELECT COUNT(tbAluno.codAluno) 'Alunos nascidos por estados', naturalidadeAluno
	FROM tbAluno INNER JOIN tbMatricula
		ON tbAluno.codAluno = tbMatricula.codAluno
			GROUP BY tbAluno.naturalidadeAluno

--8) Apresentar o nome dos alunos ao lado da data de matrícula no formato dd/mm/aaaa

SELECT nomeAluno, convert(varchar, dataMatricula, 103)'dataMatricula'
	FROM tbAluno INNER JOIN tbMatricula ON tbAluno.codAluno = tbMatricula.codAluno
		INNER JOIN tbTurma ON tbMatricula.codTurma = tbTurma.codTurma
			INNER JOIN tbCurso ON tbTurma.codCurso = tbCurso.codCurso
			
--9) Apresentar os alunos cujo nome comece com A e que estejam matriculados no curso de inglês

SELECT DISTINCT nomeAluno, nomeCurso
	FROM tbAluno INNER JOIN tbMatricula ON tbAluno.codAluno = tbMatricula.codAluno
		INNER JOIN tbTurma ON tbMatricula.codTurma = tbTurma.codTurma
			INNER JOIN tbCurso ON tbTurma.codCurso = tbCurso.codCurso
				WHERE nomeAluno LIKE 'A%'
				AND nomeCurso LIKE 'IN%'

--10-) Apresentar a quantidade de matriculas feitas no ano de 2016

SELECT COUNT(tbAluno.codAluno)'Quantidade de alunos que se matricularam em 2016', dataMatricula
	FROM tbAluno INNER JOIN tbMatricula
		ON tbAluno.codAluno = tbMatricula.codMatricula
			WHERE dataMatricula >= '01/01/2016' and dataMatricula <='31/12/2016'
				GROUP BY tbMatricula.dataMatricula

