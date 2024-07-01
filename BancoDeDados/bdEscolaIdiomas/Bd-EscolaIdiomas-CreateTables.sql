CREATE DATABASE  bdEscolaIdiomas

GO

USE bdEscolaIdiomas

CREATE TABLE tbAluno(
codAluno int primary key identity (1,1)
,nomeAluno varchar (100) not null
,dataNascAluno datetime not null
,rgAluno char (14) not null --12 na verdade
,naturalidadeAluno varchar (50) not null
)

CREATE TABLE tbCurso(
codCurso int primary key identity(1,1)
,nomeCurso varchar (50) not null
,cargahorariaCurso int not null
,valorCurso money
)

CREATE TABLE tbTurma (
codTurma int primary key identity (1,1)
,nomeTurma varchar (50) not null
,codCurso int foreign key references tbCurso(codCurso)
,horarioTurma datetime not null
)

CREATE TABLE tbMatricula (
codMatricula int primary key identity(1,1)
,dataMatricula datetime not null
,codAluno int foreign key references tbAluno(codAluno)
,codTurma int foreign key references tbTurma(codTurma)
)