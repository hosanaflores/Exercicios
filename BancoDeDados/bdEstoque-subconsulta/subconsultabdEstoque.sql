use bdEstoque

--1. Criar uma consulta que retorne o código do produto, o nome do produto e o nome do fabricante somente daqueles produtos que custam igual ao valor mais alto -- OK
SELECT idProduto, descricaoProduto, valorProduto, nomeFabricante FROM tbProduto
 INNER JOIN tbFabricante
 ON tbProduto.idFabricante = tbFabricante.idFabricante
 WHERE valorProduto >= (SELECT MAX(valorProduto) FROM tbProduto) AND
 nomeFabricante IN (SELECT nomeFabricante FROM tbFabricante) 
 

--2. Criar uma consulta que retorne o nome do produto e o nome do fabricante e o valor somente dos produtos que custem acima do valor médio dos produtos em estoque -- OK

SELECT descricaoProduto, nomeFabricante, valorProduto FROM tbProduto
	INNER JOIN tbFabricante
		ON tbProduto.idFabricante = tbFabricante.idFabricante
			WHERE valorProduto > (SELECT AVG(valorProduto) FROM tbProduto) AND
			nomeFabricante IN (SELECT nomeFabricante FROM tbFabricante)
 

--3. Criar uma consulta que retorne o nome dos clientes que tiveram vendas com valor acima do valor médio das vendas -- OK
SELECT nomeCliente, valorTotalVenda FROM tbCliente
 INNER JOIN tbVenda
 ON tbVenda.idCliente = tbCliente.idCliente
 WHERE valorTotalVenda > (SELECT AVG(valorTotalVenda) FROM tbVenda) AND
 nomeCliente IN (SELECT nomeCliente FROM tbCliente) 



--4. Criar uma consulta que retorno o nome e o preço dos produtos mais caros
SELECT descricaoProduto, valorProduto FROM tbProduto
 WHERE valorProduto > (SELECT MIN(valorProduto) FROM tbProduto)

--5. Criar uma consulta que retorne o nome e o preço do produto mais barato -- OK
SELECT descricaoProduto, valorProduto FROM tbProduto
	WHERE valorProduto = (SELECT MIN(valorProduto) FROM tbProduto)

	

