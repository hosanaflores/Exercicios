<?php

function validarCPF(){

    $n1 =$_POST['n1'];
    $n2 =$_POST['n2'];
    $n3 =$_POST['n3'];
    $n4 =$_POST['n4'];
    $n5 =$_POST['n5'];
    $n6 =$_POST['n6'];
    $n7 =$_POST['n7'];
    $n8 =$_POST['n8'];
    $n9 =$_POST['n9'];
    $n10 =$_POST['n10'];
    $n11 =$_POST['n11'];

    $somaCPF = ($n1+$n2+$n3+$n4+$n5+$n6+$n7+$n8+$n9+$n10+$n11);

    if($somaCPF == 10){
    $somaCPF=true;
    echo'CPF válido!';

    }elseif($somaCPF == 11){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 12){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 21){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 22){
        $somaCPF = true;
        echo'CPF Válido';

    }elseif($somaCPF == 23){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 32){
        $somaCPF = true;
        echo'CPF válido';

    }elseif($somaCPF == 33){
        $somaCPF = true;
        echo'CPF válido!';
        
    }elseif($somaCPF == 34){
        $somaCPF = true;
        echo'CPF válido';
        
    }elseif($somaCPF == 43){
        $somaCPF = true;
        echo'CPF válido!';
        
    }elseif($somaCPF == 44){
        $somaCPF = true;
        echo'CPF válido!';
        
    }elseif($somaCPF == 45){
        $somaCPF = true;
        echo'CPF válido!';
        
    }elseif($somaCPF == 54){
        $somaCPF = true;
        echo'CPF válido!';
        
    }elseif($somaCPF == 55){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 56){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 65){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 66){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 67){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 76){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 77){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 78){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 87){
        $somaCPF = true;
        echo'CPF válido!';

    }elseif($somaCPF == 88){
        $somaCPF = true;
        echo'CPF válido!';
        
    }else{
        $somaCPF = false;
        echo'CPF inválido!';
    }
}

    $resultadoCPF = validarCPF();
    return $resultadoCPF;



?>
