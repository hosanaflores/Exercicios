use bdEstoque

--1. Alterar o preço dos produtos fabricados pela Unilever aumentando os em 10% 

SELECT * FROM tbProduto


UPDATE tbProduto
SET valorProduto = valorProduto + (valorProduto * 10)/100 
WHERE idFabricante = 1 

--2.Diminuir os preços dos produtos fabricados pela P&G em 7%

UPDATE tbProduto
SET valorProduto = valorProduto - (valorProduto * 7)/100
WHERE idFabricante = 2

--3.Diminuir 30 itens na quantidade dos produtos que são fornecidos pelo Atacadão

UPDATE tbProduto
SET quantidadeProduto = quantidadeProduto - 30
WHERE idFornecedor = 1

--4. Alterar o nome da cliente Adriana Nogueira Silva para Adriana Nogueira Silva Campos

SELECT * FROM tbCliente

UPDATE tbCliente
SET nomeCliente = 'Adriana Nogueira Silva Campos'
WHERE idCliente = 5

-- 5. Conceder 5% de desconto no valor total das venda ocorridas em fevereiro de 2014

SELECT * FROM tbVenda

UPDATE tbVenda
SET valorTotalVenda = valorTotalVenda - (valorTotalVenda * 5)/100
WHERE dataVenda between '01/02/2014' and '28/02/2014'
	

-- 6. Apagar todos os itens de venda do produto “Salsicha Hot Dog Sadia"


SELECT * FROM tbItensVenda
SELECT * FROM tbProduto


DELETE FROM tbItensVenda
WHERE idProduto = 5



SELECT * FROM tbCliente

--7. Alterar o sexo f para fem

UPDATE tbCliente
SET sexoCliente = 'fem'
WHERE sexoCliente like 'f'


--8. Alterar o sexo m para masc
UPDATE tbCliente
SET sexoCliente = 'masc'
WHERE sexoCliente like 'm'
