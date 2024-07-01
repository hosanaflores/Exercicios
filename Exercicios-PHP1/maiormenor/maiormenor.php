<?php


$a = $_POST['txtNum1']; $b = $_POST['txtNum2']; $c = $_POST['txtNum3']; $menor; $maior;

/* Encontrando o menor número*/


if ($a < $b  && $a < $c ) {

    $menor = $a;

}

    else if ($a < $b  && $a < $c ) {

        $menor = $c;
    }

        else if( $b < $c ) {

         $menor = $b;

        }

         else {

            $menor = $c;
         }


     /* Encontrando o maior número*/

     if ( $a > $b && $a > $c){

        $maior = $a;

     }
           
        else if  ( $a < $b && $a < $c) {

            $maior = $c;

        }

            else if  ($b > $c) {

                $maior = $b;

            }

            else  {
                $maior = $c;

            }

            echo("O  maior é: " .$maior. " <br>O menor é: " .$menor);

?>