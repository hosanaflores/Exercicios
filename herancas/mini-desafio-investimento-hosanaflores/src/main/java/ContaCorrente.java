public class ContaCorrente extends ContaBancaria{

    private Double limiteCredito;

    public ContaCorrente(String numeroDaConta, String agencia, String nomeTitular, Double limiteCredito) {
        super(numeroDaConta, agencia, nomeTitular);
        this.limiteCredito = limiteCredito;
    }

    public ContaCorrente() {
        this.limiteCredito = 1000.0;
    }

    public void aumentarLimite(Double limiteDesejado){
        if(super.getSaldoAtual() > limiteDesejado){
            this.limiteCredito = limiteDesejado;
            System.out.println("Novo limite: " +this.limiteCredito);
        }else{
            System.out.println("Não foi aprovado!");
        }
    }
}
