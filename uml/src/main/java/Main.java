public class Main {
    public static void main(String[] args) {

        Atividade atividade01 = new Atividade("Dar banho no peixe", "William", 5);

       // atividade01.toString(); // ele devolve um valor em string

        System.out.println(atividade01); //antes tinha .toString() depois do atividade01

        atividade01.terminarAtividade(10);

        atividade01.exibirRelatorio();

        System.out.println(atividade01.toString()
        );

        //ToString momento atual do objeto

    }
}
