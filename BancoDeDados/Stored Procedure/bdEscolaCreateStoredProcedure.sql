--USE bdEscola

--1) Criar uma stored procedure que cadastre os alunos, verificando antes
--pelo cpf se o aluno já está cadastrado. Nesse caso, de duplicidade, não
--cadastrar o aluno e informar a situação via mensagem.

CREATE PROCEDURE spInsereAluno 
	@nome varchar(100) --valores idênticos ao create table
	,@cpf char (11) -- --valores idênticos ao create table

AS
	
	begin 
		IF EXISTS(SELECT idAluno FROM tbAluno WHERE cpfAluno like @cpf)
		begin 
			print('Impossível cadastrar. Aluno de CPF' +@cpf+ 'já está cadastrado!')
		end
		else
		begin
		INSERT INTO tbAluno(nomeAluno, cpfAluno)
			VALUES (@nome, @cpf)
			declare @codigo int
			set @codigo = (SELECT max(idAluno) from tbAluno)
		print ('Aluno '+@nome+' cadastrado com sucesso! com código ' +convert(varchar(6), @codigo) )
	end
 end

SELECT * FROM tbAluno

EXEC spInsereAluno 'Hosana Silvino', '117788-x'

EXEC spInsereAluno 'Fernanda Silvino', '228899-x'

EXEC spInsereAluno 'David Valdez', '003355-x'

EXEC spInsereAluno 'Aline', '003355-x'

EXEC spInsereAluno 'Solange', '335599-x'

EXEC spInsereAluno 'Tiago', '998855-x'


---------------------------------------------------------------------------------------------------------------------
--2) Criar uma stored procedure que receba o cpf do aluno e a descrição
--da ocorrência e faça um INSERT de uma nova ocorrência (somente se
--o aluno existir). A data da ocorrência deve ser a data do dia.

CREATE PROCEDURE spInsereTestee
	@cpf char (11)
	,@descricao varchar (100) 
	,@id int 
AS
	begin 
	declare @idOcorrencia int
		IF EXISTS(SELECT  @cpf FROM tbAluno  WHERE  cpfAluno LIKE @cpf)
		 begin 
			INSERT INTO tbOcorrenciaAluno(dataOcorrencia, descricaoOcorrencia, idAluno) 
			VALUES (getdate(), @descricao, @id) 
			SET  @idOcorrencia = (SELECT MAX (idOcorrencia) FROM tbOcorrenciaAluno)	
		print ('Ocorrência do aluno de CPF: ' +@cpf+ 'enviada com sucesso! Código: ' +convert(varchar(5), @idOcorrencia))
		end
		else
		begin
		print('Impossível cadastrar!')
	end
end

EXEC spInsereTestee  '117788-X', 'Não fez as tarefas', '1'

EXEC spInsereTestee  '117788-X', 'Não faz as provas', '1'

EXEC spInsereTestee  '228899-x', 'Faltou muito', '2'

SELECT * FROM tbOcorrenciaAluno 

--------------------------------------------------------------------------------------------
--3) Criar uma stored procedure que dado o cpf, retorne se o aluno possui
--ou não ocorrências via mensagem. Caso ele tenha ocorrencias, indicar
--a quantidade na mensagem.

CREATE PROCEDURE spMensagem
	@cpf char (11)

AS 
	begin
		declare @resultado int
		IF EXISTS(SELECT cpfAluno FROM tbAluno INNER JOIN tbOcorrenciaAluno ON tbOcorrenciaAluno.idAluno = tbAluno.idAluno  WHERE cpfAluno = @cpf)
			begin
				SET @resultado = ( SELECT COUNT (cpfAluno) FROM  tbAluno 
				INNER JOIN tbOcorrenciaAluno ON tbAluno.idAluno = tbOcorrenciaAluno.idAluno 
				WHERE cpfAluno = @cpf)
			   print('Quantidade de Ocorrências do aluno(a): ' +convert(varchar(5), @resultado))
			   end
			else
		begin
			print('Não possui ocorrências!')
			end
		end

EXEC spMensagem '117788-x'
EXEC spMensagem '998855-x'
EXEC spMensagem '00000'
