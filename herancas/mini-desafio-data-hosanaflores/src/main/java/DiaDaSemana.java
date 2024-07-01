import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LocalDate data = LocalDate.now();

        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("pt-BR"));

        System.out.println("Informe uma data: ");
        LocalDate dataInformada = LocalDate.parse(in.nextLine(), formatadorDeData);

        DateTimeFormatter formatadorDeDiaSemana = DateTimeFormatter.ofPattern("EEEE",Locale.forLanguageTag("pt-BR"));
        String diaDaSemana = dataInformada.format(formatadorDeDiaSemana);

        if(dataInformada.isEqual(data)){
            System.out.println("O dia "+dataInformada + " é hoje e é " +diaDaSemana);
        }else if(dataInformada.isAfter(data)){
            System.out.println("O dia " +dataInformada+ " será "+diaDaSemana);
        }else {
            System.out.println("O dia " +dataInformada+ " foi " +diaDaSemana);
        }
    }
}
