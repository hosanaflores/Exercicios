<?php

    function validaCPF($cpf){
   
        $cpf = preg_replace("/[^0-9]/","",$cpf);
        $digitoUm = 0;
        $digitoDois = 0;

        for($i=0, $x = 10; $i <= 8; $i++, $x--) { 
            $digitoUm += $cpf[$i] * $x;
        }

        for($i=0, $x = 11; $i <= 9; $i++, $x--) {
            if(str_repeat($i, 11) == $cpf) {
                return false;
            }
            $digitoDois += $cpf[$i] * $x; 
        }
        
        $calculoUm = (($digitoUm%11) < 2) ? 0 : 11-($digitoUm%11);
        $calculoDois = (($digitoDois%11) < 2) ? 0 : 11-($digitoDois%11);
        if($calculoUm <> $cpf[9] || $calculoDois <> $cpf[10]) {
            return false;
        }
        return true;
    }
    $cpf =$_POST["cpf"];
    if(validaCPF($cpf)) {
        echo 'CPF VÁLIDO!';
    }else{
        echo 'CPF INVÁLIDO, DIGITTE UM CPF VÁLIDO!';
    }
    
?>