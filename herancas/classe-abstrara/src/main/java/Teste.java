import java.sql.SQLOutput;

public class Teste {
    public static void main(String[] args) {
        // Não é possível instanciar objetos de classes abstratas.
        Carro carro01 = new Carro("Bob da Silva", "Fiat", 30000.0, 1999, 2.0, true);

        Bicicleta bike01 = new Bicicleta("Giuliana", "Caloi", 3000.0, 2020, 4.50);

        Moto moto01 = new Moto("Teste da Silva", "Legal", 7000.0, 2024, false);

        System.out.println("Relatório dos veículos: ");
        carro01.exibirRelatorioRevisao();
        bike01.exibirRelatorioRevisao();
        moto01.exibirRelatorioRevisao();

        System.out.println(bike01);
    }
}
