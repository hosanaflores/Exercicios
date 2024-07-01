<?php

$nome = $_POST['txtNome'];
$idade = $_POST['txtIdade'];
$genero = $_POST['txtGenero'];
$anoN = $_POST['txtNasce'];
$anoA = $_POST['txtAtual'];
$calculando;

$calculando = $anoA-$anoN;


echo("Olá, ".$nome."!<br>"." Sua idade é de ".$idade." anos e você é do genêro ".$genero."<br>");
echo("Calculei sua idade...e você tem ".$calculando." anos! ou fará ".$calculando." anos esse ano!");




?>