use bdEscolaIdiomas

--a) Criar uma consulta que retorne o nome e o preço dos cursos que custem abaixo do valor médio
SELECT nomeCurso, valorCurso  FROM tbCurso
			WHERE valorCurso < (SELECT AVG(valorCurso) FROM tbCurso)


--b) Criar uma consulta que retorne o nome e o rg do aluno mais novo
SELECT nomeAluno, rgAluno FROM tbAluno
	WHERE dataNascAluno = (SELECT MAX(dataNascAluno) FROM tbAluno)


--c) Criar uma consulta que retorne o nome do aluno mais velho
SELECT nomeAluno FROM tbAluno
	WHERE dataNascAluno = (SELECT MIN(dataNascAluno) FROM tbAluno)


--d) Criar uma consulta que retorne o nome e o valor do curso mais caro
SELECT nomeCurso, valorCurso FROM tbCurso
	WHERE valorCurso = (SELECT MAX(valorCurso) FROM tbCurso)


--e) Criar uma consulta que retorne o nome do aluno e o nome do curso, do aluno que fez a última matrícula

	SELECT nomeAluno, nomeCurso FROM tbCurso
		INNER JOIN tbTurma 
			ON tbCurso.codCurso = tbTurma.codCurso 
				INNER JOIN tbMatricula 
					ON tbTurma.codTurma = tbMatricula.codTurma
						INNER JOIN tbAluno 
							ON tbMatricula.codAluno = tbAluno.codAluno
								WHERE dataMatricula = (SELECT MAX(dataMatricula) FROM tbMatricula) AND
									nomeCurso IN (SELECT nomeCurso FROM tbCurso) 

									
--f) Criar uma consulta que retorne o nome do primeiro aluno a ser matriculado na escola de Idiomas
SELECT nomeAluno FROM tbCurso
		INNER JOIN tbTurma 
			ON tbCurso.codCurso = tbTurma.codCurso 
				INNER JOIN tbMatricula 
					ON tbTurma.codTurma = tbMatricula.codTurma
						INNER JOIN tbAluno 
							ON tbMatricula.codAluno = tbAluno.codAluno
								WHERE dataMatricula = (SELECT MIN(dataMatricula) FROM tbMatricula) AND
									nomeCurso IN (SELECT nomeCurso FROM tbCurso) 

--g) Criar uma consulta que retorne o nome, rg e data de nascimento de todos os alunos que estejam matriculados no curso de inglês

SELECT  nomeAluno, rgAluno, dataNascAluno, nomeCurso FROM tbCurso
		INNER JOIN tbTurma 
			ON tbCurso.codCurso = tbTurma.codCurso 
				INNER JOIN tbMatricula 
					ON tbTurma.codTurma = tbMatricula.codTurma
						INNER JOIN tbAluno 
							ON tbMatricula.codAluno = tbAluno.codAluno
								WHERE nomeCurso IN (SELECT nomeCurso = 'Inglês' FROM tbCurso)
								 


