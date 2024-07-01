[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/RyxlBDBU)
**Atenção! Leia o enunciado pelo menos uma vez antes de programar.** 🚨

**Escolheremos um ou mais alunos para compartilhar a resolução :)**

**Como desafio, pense em como aplicar POO neste exercício.** 🚩

**Dica: recomendamos resolver o exercício sem POO e depois aplicar os conceitos e adicionar novos itens caso julgue necessário.**

---

Paulo começou a investir seu dinheiro e criou uma rotina de investimento. Além disso, Paulo começou a programar Java recentemente e tem dúvidas de como poderia exercitar sua lógica de programação. Você está a passos a frente do Paulo quando o assunto é programação Java e decide criar um projeto simples, com apenas o básico de programação para ajuda-lo a exercitar sua lógica e sua nova empreitada no mundo de investimentos.

O programa deve conter variáveis, entrada e saída de dados, condicionais e laços de repetições.

O programa deve conter um menu com 4 opções, exemplo:

![Menu](https://github.com/linguagem-de-programacao-ads/desafio-investimento-paulo/assets/43658914/1e33e425-420b-4e36-8e5d-52e1f0d33b80)


Esse menu deverá ser exibido enquanto o usuário não digitar o número 0, ou seja, ao final de cada operação dos itens 1, 2 ou 3, o usuário sempre será redirecionado para esse menu inicial.

1. **Opção Depositar:**
    - Ao selecionar essa opção, o programa deve solicitar ao usuário um valor a ser depositado;
    - O programa deverá validar o valor digitado para evitar problemas, sendo assim, só poderá receber números positivos;
    - Caso o usuário digite um número válido, o programa deverá armazenar o valor na conta e exibir a mensagem "Depósito realizado" seguido do saldo atual, caso contrário, somente exibirá "Valor inválido";
    - Independente do cenário, ao final o usuário deverá voltar para o menu principal.

![Depositar](https://github.com/linguagem-de-programacao-ads/desafio-investimento-paulo/assets/43658914/2bcc78e5-9712-4fd8-bc33-3f8d69c53279)


2. **Opção Sacar:**
    - Ao selecionar essa opção, o programa deve solicitar ao usuário um valor a ser retirado;
    - O programa deverá validar o valor digitado para evitar problemas, sendo assim, só poderá receber números positivos;
    - O usuário só poderá sacar se tiver saldo suficiente, ou seja, deverá ser validado se há saldo disponível;
    - Caso o valor informado seja um valor válido, o programa deverá exibir a mensagem "Saque realizado" seguido do saldo atual, caso contrário, somente exibirá "Valor inválido";
    - Independente do cenário, ao final o usuário deverá voltar para o menu principal.

![Sacar](https://github.com/linguagem-de-programacao-ads/desafio-investimento-paulo/assets/43658914/feed5abb-d2c1-48fa-9789-c040cfb7712c)


3. **Opção Simular rendimentos:**
    - Ao selecionar essa opção, programa deve exibir o valor do saldo mês a mês, considerando que o rendimento é de 10% a cada mês.
    - Por se tratar de uma projeção (simulação), o saldo atual não deve ser alterado;
    - Caso a conta esteja zerada, exiba "Saldo Zerado, opção inválida."

![Simular Rendimentos](https://github.com/linguagem-de-programacao-ads/desafio-investimento-paulo/assets/43658914/60a35ef6-a0e1-4f33-b74e-35e8fbc6731b)

