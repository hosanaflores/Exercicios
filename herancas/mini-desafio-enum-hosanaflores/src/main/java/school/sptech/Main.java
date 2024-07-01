package school.sptech;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o dia da semana\n" +
            "1 - Domingo\n " +
            "2 - Segunda-Feira\n "+
            "3 - Terça-Feira\n " +
            "4 - Quarta-Feira\n "+
            "5 - Quinta-Feira\n " +
            "6 - Sexta-Feira\n "+
            "7 - Sábado\n");
        Integer diaDigitado = leitor.nextInt();

        DiaDaSemana diaEscolhido = null;
        for(DiaDaSemana diaDaVez : DiaDaSemana.values()){
          if(diaDaVez.getNumero().equals(diaDigitado)){
            diaEscolhido = diaDaVez;
              System.out.println("O número %d corresponde a %s".formatted(diaDigitado, diaEscolhido.getDiaSemana()));
          }
        }

        if(diaDigitado < 0 || diaDigitado > 7){
            System.out.println("Dia inválido! Informe um dia entre 1 a 7, por favor :)");
        }

  }
}