public class TesteContato {
    public static void main(String[] args) {

        Contato contato01 = new Contato("Manoel", "123");
        Contato contato02 = new Contato("Giuliana", "345");
        Contato contato03 = new Contato("Hosana", "678");
        Contato contato04 = new Contato("Fernanda", "678");
        Contato contato05 = new Contato("Gustavo", "678");

        Grupo grupoDoZap = new Grupo("Grupo da família");

        Grupo trampo = new Grupo("Grupo do trabalho");

       // System.out.println(contato01.toString());
        grupoDoZap.adicionarContato(contato01);
        grupoDoZap.adicionarContato(contato02);
        grupoDoZap.adicionarContato(contato04);

        System.out.println("Grupo 01");
        System.out.println(grupoDoZap);

        trampo.adicionarContato(contato02);
        trampo.adicionarContato(contato03);

        System.out.println("Grupo 2");
        System.out.println(trampo);

        System.out.println("Buscando contato manoel:");
        grupoDoZap.buscarContatoPeloNome("Manoel");

        System.out.println(grupoDoZap.buscarContatoPeloNome("Gu"));
    }
}
