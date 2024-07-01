USE bdLivrariaBrasileira

--a) O total de livros que come�am com a letra P

SELECT COUNT (nomeLivro) AS 'Total de livros que come�am com a letra P' FROM tbLivro 

		 WHERE nomeLivro LIKE 'P%';

				SELECT * FROM tbLivro

--b) O maior n�mero de p�ginas entre todos os livros

SELECT MAX (numPaginas)  AS 'O maior n�mero de p�ginas entre todos os livros' FROM tbLivro
	
	SELECT * FROM tbLivro

--c) O menor n�mero de p�ginas entre todos os livros

SELECT MIN (numPaginas)  AS 'O menor n�mero de p�ginas entre todos os livros' FROM tbLivro
	
	SELECT * FROM tbLivro

--d) A m�dia de p�ginas entre todos os livros

SELECT AVG (numPaginas) AS 'A m�dia de p�ginas entre todos os livros' FROM tbLivro

--e) A soma do n�mero de p�ginas dos livros de editora c�digo 01

SELECT SUM (numPaginas) AS 'A soma do n�mero de p�ginas dos livros de editora c�digo 01' FROM tbLivro

	WHERE codEditora = 1
		SELECT * FROM tbEditora
		SELECT * FROM tbLivro

--f) A soma dos n�meros de p�ginas dos livros que come�am com a letra A
SELECT SUM (numPaginas) AS ' A soma dos n�meros de p�ginas dos livros que come�am com a letra A' FROM tbLivro
 
	WHERE nomeLivro LIKE 'A%'

--g) A m�dia dos n�meros de p�ginas dos livros que sejam do autor c�digo 03

SELECT AVG (numPaginas) AS 'A m�dia dos n�meros de p�ginas dos livros que seja do autor c�digo 3' FROM tbLivro

	WHERE codAutor = 3

--h) A quantidade de livros da editora de c�digo 04
SELECT COUNT (nomeLivro) 'A quantidade de livros da editoria de c�digo 4' FROM tbLivro
	WHERE codEditora = 4
		SELECT * FROM tbLivro

--i) A m�dia do n�mero de p�ginas dos livros que tenham a palavra �estrela� em seu nome
SELECT AVG (numPaginas) AS 'A m�dia do n�mero de p�ginas dos livros que tenham a palavra "estrela" em seu nome' FROM tbLivro
	WHERE  nomeLivro LIKE '%estrela%'

--j) A quantidade de livros que tenham a palavra �poema� em seu nome
SELECT COUNT (nomeLivro) AS 'A quantidade de livros que tenham a palavra "poema" em seu nome' FROM tbLivro
	WHERE nomeLivro LIKE '%poema%'

--k) A quantidade de livros agrupado pelo nome do g�nero
SELECT COUNT (tbLivro.codLivro) AS 'A quantidade de livros agrupado pelo nome do g�nero', nomeGenero

		FROM tbLivro INNER JOIN tbGenero
		ON tbLivro.codGenero = tbGenero.codGenero
		GROUP BY tbGenero.nomeGenero

--l) A soma das p�ginas agrupada pelo nome do autor

SELECT SUM (tbLivro.numPaginas) AS 'A soma de livros agrupados pelo nome do g�nero', nomeAutor
	 
	 FROM tbLivro INNER JOIN tbAutor
	 ON tbLivro.codAutor = tbAutor.codAutor
	 GROUP BY  tbAutor.nomeAutor
	
	SELECT * FROM tbLivro
	SELECT * FROM tbAutor

--m) A m�dia de p�ginas agrupada pelo nome do autor em ordem alfab�tica (de A a Z)

SELECT AVG (tbLivro.numPaginas) AS 'A m�dia de p�ginas agrupadas pelo nome do autor em ordem alfab�tica (de A a Z)', nomeAutor
	
	FROM tbLivro INNER JOIN tbAutor
	ON tbLivro.codAutor = tbAutor.codAutor
	GROUP BY  tbAutor.nomeAutor 
	ORDER BY nomeAutor ASC
	 
--n) A quantidade de livros agrupada pelo nome da editora em ordem alfab�tica inversa (de Z a A)

SELECT COUNT (tbLivro.codLivro) AS 'A quantidade de livros agrupada pelo nome da editora em ordem alfab�tica inversa(de Z a A)', nomeEditora
		FROM tbLivro INNER JOIN tbEditora --era INNER
		ON tbLivro.codEditora = tbEditora.codEditora
		GROUP BY tbEditora.nomeEditora
		ORDER BY nomeEditora DESC

		SELECT * FROM tbLivro
		SELECT * FROM tbEditora

--o) A soma de p�ginas dos livros agrupados pelo nome do autor que sejam de autores cujo nome comece com a letra �C�

SELECT SUM (tbLivro.numPaginas) AS 'A soma de p�ginas dos livros agrupados pelo nome do autor que sejam de autores cujo nome comece com a letra �C�', nomeAutor
		FROM tbLivro INNER JOIN tbAutor --INNER JOIN
		ON tbLivro.codAutor = tbAutor.codAutor
		WHERE nomeAutor LIKE 'C%'
		GROUP BY tbAutor.nomeAutor
		
		SELECT * FROM tbAutor
		SELECT * FROM tbLivro


--p) A quantidade de livros agrupados pelo nome do autor, cujo nome do autor seja �Machado de Assis� ou �Cora Coralina� ou �Graciliano Ramos� ou �Clarice Lispector�

SELECT COUNT (tbLivro.codLivro) AS '�Machado de Assis� ou �Cora Coralina� ou �Graciliano Ramos� ou �Clarice Lispector�', nomeAutor
	FROM tbLivro FULL JOIN tbAutor --era INNER JOIN
	ON tbLivro.codAutor = tbAutor.codAutor
	WHERE nomeAutor LIKE 'Cora Coralina' OR nomeAutor LIKE 'Clarice Lispector'
	GROUP BY tbAutor.nomeAutor

	SELECT * FROM tbAutor

--q) A soma das p�ginas dos livros agrupadas pelo nome da editora cujo n�mero de p�ginas esteja entre 200 e 500 (inclusive)

SELECT SUM (tbLivro.numPaginas) AS 'Resultado', nomeEditora
	FROM tbLivro INNER JOIN tbEditora 
	ON tbLivro.codEditora = tbEditora.codEditora
	WHERE numPaginas BETWEEN 200 and 500
	GROUP BY nomeEditora

--r) O nome dos livros ao lado do nome das editoras e do nome dos autores

SELECT nomeLivro, nomeEditora, nomeAutor
	FROM tbLivro INNER JOIN tbEditora 
	ON tbLivro.codEditora = tbEditora.codEditora
	INNER JOIN tbAutor
	ON tbLivro.codAutor = tbAutor.codAutor


--s) O nome dos livros ao lado do nome do autor somente daqueles cujo nome da editora for �Cia das Letras�

UPDATE tbEditora
SET nomeEditora = ('Cia das Letras')
WHERE nomeEditora = 'Companhia das Letras'

SELECT nomeLivro, nomeAutor, nomeEditora
	FROM tbLivro INNER JOIN tbAutor
		ON tbLivro.codAutor = tbAutor.codAutor INNER JOIN tbEditora
		ON tbEditora.codEditora = tbEditora.codEditora
		WHERE nomeEditora IN ('Cia das Letras')

		SELECT * FROM tbEditora

--t) O nome dos livros ao lado dos nomes dos autores, somente dos livros que n�o forem do autor ��rico Ver�ssimo�

SELECT tbLivro.nomeLivro, tbAutor.nomeAutor
	FROM tbLivro INNER JOIN tbAutor 
		ON tbLivro.codAutor = tbAutor.codAutor
		WHERE nomeAutor NOT IN ('�rico Ver�ssimo')

--u) Os nomes dos autores ao lado dos nomes dos livros, inclusive daqueles que n�o tem livros cadastrados
SELECT tbAutor.nomeAutor, tbLivro.nomeLivro
	FROM tbAutor FULL JOIN tbLivro 
	ON tbAutor.codAutor = tbLivro.codAutor

--v) Os nomes dos autores ao lado dos nomes dos livros, inclusive daqueles que n�o tem autores cadastrados
SELECT tbAutor.nomeAutor, tbLivro.nomeLivro
	FROM tbAutor FULL OUTER JOIN tbLivro
	ON tbAutor.codAutor = tbLivro.codAutor

--w) O nome dos autores ao lado dos nomes dos livros, indiferente do autor ter ou n�o livro publicado, e indiferente do livro pertencer a algum autor
SELECT tbAutor.nomeAutor, tbLivro.nomeLivro
	FROM tbAutor FULL OUTER JOIN tbLivro
	ON tbAutor.codAutor = tbLivro.codAutor

--x) A editora �tica ir� publicar todos os t�tulos dessa livraria. Criar um select que associe os nomes de todos os livros ao lado do nome da editora �tica.
SELECT tbLivro.nomeLivro, tbEditora.nomeEditora
    FROM tbEditora CROSS JOIN  tbLivro
        WHERE nomeEditora IN ('Atica')

--y) Somente os nomes dos autores que n�o tem livros cadastrados
 SELECT tbAutor.nomeAutor, tbLivro.nomeLivro 
    FROM tbAutor LEFT OUTER JOIN tbLivro 
        ON tbAutor.codAutor = tbLivro.codAutor
            WHERE nomeLivro IS NULL
	

--z) Os nomes dos g�neros que n�o possuem nenhum livro cadastrado

SELECT tbGenero.nomeGenero, tbLivro.nomeLivro
 FROM tbGenero FULL JOIN tbLivro
 ON tbGenero.codGenero = tbLivro.codGenero
  WHERE nomeLivro IS NULL
