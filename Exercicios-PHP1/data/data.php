<?php
    $defaultTimeZone='UTF-8';
    date_default_timezone_set('America/Sao_Paulo');
    

    $dia = date('d'); //Dia da semana//
    $mes = date('m'); //Mês//
    $ano = date("Y"); //Ano//

    $dataUm = date('d/m/Y'); //Guardando dia, mês e ano//
    $dataDois = date('d F Y'); //Guardando dia, o mês inteiro - ex = (Maio), e o ano// 
    $dataTres = date ('d M Y'); //Guardando dia, o mês curto - ex = (Jun), e o ano//
    $dataQuatro = date('l, d \of F \of Y'); //Guardando o dia da semana inteiro - ex = (Quarta), o dia em número, e o ano//
    $dataQuinta = date('d F Y');

    //APRESENTANDO OS RESULTADOS DA DATA//
    echo($dataUm."<br>"); 
    echo($dataDois."<br>");
    echo($dataTres."<br>");
    echo($dataQuatro."<br>");
    echo("São Paulo, ".$dataQuinta."<br>");
    
    //APRESENTANDO O HORÁRIO//
    $agora = getdate();
    echo($dataUm." ".$agora['hours'].":".$agora['minutes']);
?>