<?php

    if (isset($_POST['enviar']) && !empty($_POST['cpf'])){
        require "validar.php";
        $V = new Validar();

        $cpf = $_POST['cpf'];

        if ($V->verifyCPF($cpf) == true){
            echo"CPF verdadeiro";
        }else{
            echo"CPF falso";
        }
    }
?>