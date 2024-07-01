CREATE DATABASE bdLivrariaBrasileira

GO 

USE bdLivrariaBrasileira

CREATE TABLE tbAutor(
codAutor INT PRIMARY KEY IDENTITY(1,1)
,nomeAutor VARCHAR (60) NOT NULL
)

CREATE TABLE tbEditora(
codEditora INT PRIMARY KEY IDENTITY(1,1)
,nomeEditora VARCHAR (60) NOT NULL
)

CREATE TABLE tbGenero(
codGenero INT PRIMARY KEY IDENTITY(1,1)
,nomeGenero VARCHAR (60) NOT NULL
)

CREATE TABLE tbLivro(
codLivro INT PRIMARY KEY IDENTITY(1,1)
,nomeLivro VARCHAR (60) NOT NULL
,numPaginas INT NOT NULL
,codGenero INT FOREIGN KEY REFERENCES tbGenero (codGenero)
,codAutor INT FOREIGN KEY REFERENCES tbAutor (codAutor)
,codEditora INT FOREIGN KEY REFERENCES tbEditora (codEditora)
)