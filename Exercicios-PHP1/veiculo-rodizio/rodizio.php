<?php

    $carro = $_POST['txtCarro'];

    switch($carro) {

        case 1: case 2:
            echo("Segunda-feira");
            break;

                case 3:  case 4:
                    echo("Terça-feira");
                    break;

                        case 5: case 6:
                            echo("Quarta-feira");
                            break;

                                case 7: case 8:
                                    echo("Quinta-feira");
                                    break;

                                        case 9: case 0:
                                            echo("Sexta-feira");
                                            break;

                                                default;
                                                echo("Inválido");            

    }

?>