CREATE DATABASE bdBancoEtec

GO

USE bdBancoEtec

CREATE TABLE tbCorrentista (
codCorrentista int primary key identity (1,1)
,nomeCorrentista varchar (50) not null
,dataNascCorrentista date  not null
,cpfCorrentista char (14) not null
,rgCorrentista char (14) not null
)

CREATE TABLE tbContaPoupanca(
codContaPoupanca int primary key identity (1,1)
,numeroAgenciaCP numeric not null
,numeroCP numeric not null
,digitoCP numeric not null
,saldoCP money not null
,dataAberturaCP date not null
,codCorrentista int foreign key references tbCorrentista(codCorrentista)
)

CREATE TABLE tbContaCorrente(
codContaCorrente int primary key identity (1,1)
,numeroAgenciaCC numeric not null
,numeroCC numeric not null
,digitoCC numeric not null
,senhaNumericaCC numeric not null
,senhaAlfaNumericaCC varchar (15) not null
,saldoCC numeric not null
,dataAberturaCC date not null
,codCorrentista int foreign key references tbCorrentista(codCorrentista)
)
