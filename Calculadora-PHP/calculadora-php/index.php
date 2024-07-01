<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!--MEU CSS-->
    <link rel="stylesheet" href="./css/form-calculadora.css">

    <!--Título-->
    <title>Calculadora</title>
</head>

<body>

<h1>Calculadora - Hosana Silvino</h1>

<div class="contorno">
    <form method="post">
        <label for="valor1" class="valor1">Valor 1:</label><br>
        <input type="text" id="valor1" name="valor1" class="input"><br>
        <label for="valor2" class="valor1">Valor 2:</label><br>
        <input type="text" id="valor2" name="valor2" class="input"><br><br>
        <input type="submit" name="soma" value="Somar" class="botao">
        <input type="submit" name="subtracao" value="Subtrair" class="botao">
        <input type="submit" name="multiplicacao" value="Multiplicar" class="botao">
        <input type="submit" name="divisao" value="Dividir" class="botao">
    </form> 
</div>

</body>
</html>

<?php

if (isset($_POST['soma'])) {
    $valor1 = $_POST['valor1'];
    $valor2 = $_POST['valor2'];

    if (!empty($valor1) && !empty($valor2)) { //verificar se as variáveis $valor1 e $valor2 são vazias antes de realizar as operações matemáticas.
      $resultado = $valor1 + $valor2;
      echo "<div class=\"resultado\">O resultado da soma é: $resultado</div>";
    } else {
      echo "<div class=\"insira\">Por favor, insira os valores para realizar a operação</div>";
    }

} elseif (isset($_POST['subtracao'])) {
  $valor1 = $_POST['valor1'];
  $valor2 = $_POST['valor2'];
 
  if (!empty($valor1) && !empty($valor2)) {
    $resultado = $valor1 - $valor2;
    echo "<div class=\"resultado\">O resultado da subtração é: $resultado</div>";
    } else {
  echo "<div class=\"insira\">Por favor, insira os valores para realizar a operação</div>";
    }

} elseif (isset($_POST['multiplicacao'])) {
  $valor1 = $_POST['valor1'];
  $valor2 = $_POST['valor2'];
  
  if (!empty($valor1) && !empty($valor2)) {
    $resultado = $valor1 * $valor2;
    echo "<div class=\"resultado\">O resultado da multiplicação é: $resultado</div>";
    } else {
      echo "<div class=\"insira\">Por favor, insira os valores para realizar a operação</div>";
    }

} elseif (isset($_POST['divisao'])) {
  $valor1 = $_POST['valor1'];
  $valor2 = $_POST['valor2'];
  
  if (!empty($valor1) && !empty($valor2)) {
    $resultado = $valor1 / $valor2;
    echo "<div class=\"resultado\">O resultado da divisão é: $resultado</div>";
    } else {
      echo "<div class=\"insira\">Por favor, insira os valores para realizar a operação</div>";
    }

}
?>