CREATE DATABASE bdEscola

GO

USE bdEscola


CREATE TABLE tbAluno(
idAluno int primary key identity (1,1)
,nomeAluno varchar (100) not null
,cpfAluno char (11) not null
)

CREATE TABLE tbOcorrenciaAluno(
idOcorrencia int primary key identity (1,1)
,dataOcorrencia date not null
,descricaoOcorrencia varchar (100) not null
,idAluno int foreign key references tbAluno(idAluno)
)
