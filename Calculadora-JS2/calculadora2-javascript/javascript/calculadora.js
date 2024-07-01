function insert(num){ //Aqui estou usando uma função pegando o id resultado e jogando o número que o usuário clica no meu <p id = "resultado"></p> lá do HTML
   var numero =  document.getElementById('resultado').innerHTML;
   document.getElementById('resultado').innerHTML = numero + num; //Guardando o que já tinha e inserindo novos números
}

function clean(){ //Função para apagar número, resultado, etc
    document.getElementById('resultado').innerHTML = "";
}

function back(){ //Função para voltar, apagar um por um 
    var resultado = document.getElementById('resultado').innerHTML;
    document.getElementById('resultado').innerHTML = resultado.substring(0, resultado.length - 1);
}

function calcular(){
    var resultado = document.getElementById('resultado').innerHTML;
    if(resultado) //Se tiver coisa dentro do campo paragráfo ele vai executar
    {
        document.getElementById('resultado').innerHTML = eval(resultado);
    }
    /*else
    {
        document.getElementById('resultado').innerHTML = "Nada..."
    }*/
}