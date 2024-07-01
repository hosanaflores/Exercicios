create database bdEstoque

go


use bdEstoque

create table tbFabricante(
idFabricante int primary key identity(1,1)
,nomeFabricante varchar(100) not null
)

create table tbFornecedor(
idFornecedor int primary key identity(1,1)
,nomeFornecedor varchar(100) not null
,contatoFornecedor varchar(100) not null
)

create table tbCliente(
idCliente int primary key identity(1,1)
,nomeCliente varchar(100) not null
,cpfCliente char(11) not null
,emailCliente varchar(100) not null
,sexoCliente varchar (4) not null
,dataNascimentoCliente date not null
)

create table tbProduto(
idProduto int primary key identity (1,1)
,descricaoProduto VARCHAR(300) not null
,valorProduto money not null
,quantidadeProduto int not null 
,idFabricante int foreign key references tbFabricante(idFabricante)
,idFornecedor int foreign key references tbFornecedor (idFornecedor)
)

create table tbVenda(
idVenda int primary key identity(1,1)
,dataVenda date not null
,valorTotalVenda money not null
,idCliente int foreign key references tbCliente(idCliente)
)

create table tbItensVenda(
idItensVenda int primary key identity(1,1)
,idVenda int foreign key references tbVenda(idVenda)
,idProduto int foreign key references tbProduto(idProduto)
,quantidadeItens int not null 
,subTotalItensVendas money not null
)