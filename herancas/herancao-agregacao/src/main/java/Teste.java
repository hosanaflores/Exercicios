public class Teste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Bob da Silva");
        ContaCorrente contaCorrente01 = new ContaCorrente("Xampson", 400.0);
        ContaCorrente contaCorrente02 = new ContaCorrente("Xampson", -800.0);

        Banco banco01 = new Banco("sptech Bank");
        banco01.cadastrarConta(contaBancaria01);
        banco01.cadastrarConta(contaCorrente01);
        banco01.cadastrarConta(contaCorrente02);

        banco01.exibirMenorLimiteChequeEspecial();
    }
}
