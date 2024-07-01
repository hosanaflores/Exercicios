import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DataTeste {

    public static void main(String[] args) {
        LocalDate data  = LocalDate.now();
        LocalDateTime dataComHorario = LocalDateTime.now();

      DateTimeFormatter formatadorDeData =  DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("pt-BR"));

      DateTimeFormatter formatadorDeDataHora =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:ms", Locale.forLanguageTag("pt-BR"));

        System.out.println(data);
        System.out.println(formatadorDeData.format(data));
        System.out.println(formatadorDeDataHora.format(dataComHorario));
        System.out.println(dataComHorario);


        System.out.println(data.minusYears(1)); // para retirar 1 ano
        System.out.println(data.minusDays(1));
        System.out.println(data.minusMonths(1));
        System.out.println(data.minusWeeks(1));

        System.out.println(data.plusYears(2)); // para acrescentar

        System.out.println(dataComHorario.minusHours(1)); // etc

        LocalDate dataManipulada = LocalDate.of(2001, 03, 21);

        if(dataManipulada.isBefore(data)){
            System.out.println("A data é antes");
        }else if(dataManipulada.isAfter(data)){
            System.out.println("A data é depois");
        }else{
            System.out.println("A data é igual");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Qual sua data de nascimento ?");
        LocalDate dataNascimento = LocalDate.parse(in.nextLine(), formatadorDeData);

        System.out.println("Sua data de nascimento é %s".formatted(dataNascimento.toString()));
    }
}
