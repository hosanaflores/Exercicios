<?php

//Desenvolva um programa para calcular a potência de um número 
//por uma base qualquer. O programa deverá realizar a leitura da 
//base e do expoente. 

$base = $_POST['txtNum1']; $expoente = $_POST['txtNum2']; $resultado=1; $i=1;

for($i=1; $i<=$expoente; $i++) {
    $resultado = $resultado*$base;

}
echo("A potência é: " .$resultado);


 

?>