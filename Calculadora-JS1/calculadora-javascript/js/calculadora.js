function calcular(operacao) {
  event.preventDefault();
  var valor1 = document.getElementById("valor1").value;
  var valor2 = document.getElementById("valor2").value;

  if (valor1 && valor2) {
    if (operacao === 'soma') {
      var resultado = parseInt(valor1) + parseInt(valor2);
      document.getElementsByClassName("resultado")[0].textContent = "O resultado da soma é: " + resultado;

    } else if (operacao === 'subtrair') {
      var resultado = parseInt(valor1) - parseInt(valor2);
      document.getElementsByClassName("resultado")[0].textContent = "O resultado da subtração é: " + resultado;

    } else if (operacao === 'multiplicacao') {
      var resultado = parseInt(valor1) * parseInt(valor2);
      document.getElementsByClassName("resultado")[0].textContent = "O resultado da multiplicação é: " + resultado;
      
    } else if (operacao === 'divisao') {
      var resultado = parseInt(valor1) / parseInt(valor2);
      document.getElementsByClassName("resultado")[0].textContent = "O resultado da divisão é: " + resultado;
    }
    // Adicione essa linha aqui
    document.getElementsByClassName("insira")[0].textContent = "";
    
  } else {
    document.getElementsByClassName("insira")[0].textContent = "Por favor, insira os valores para realizar a operação";
  }

  //Para mensagens de resultado e insira sumir depois que o usuário limpar o input
  document.getElementById("valor1").addEventListener("change", function() {
    if (this.value === "") {
    document.getElementsByClassName("resultado")[0].textContent = "";
    document.getElementsByClassName("insira")[0].textContent = "";
    }
    });
    
    document.getElementById("valor2").addEventListener("change", function() {
    if (this.value === "") {
    document.getElementsByClassName("resultado")[0].textContent = "";
    document.getElementsByClassName("insira")[0].textContent = "";
    }
    });
}


