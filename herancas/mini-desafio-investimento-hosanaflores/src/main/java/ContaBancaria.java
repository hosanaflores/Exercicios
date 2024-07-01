public class ContaBancaria {
    private String numeroDaConta;
    private String agencia;
    private String nomeTitular;
    private Double saldoAtual;
    private Double saldoRendimentos;

    public ContaBancaria(String numeroDaConta, String agencia, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;

    }

    public ContaBancaria() {
        this.saldoAtual = 0.0;
        this.saldoRendimentos = 0.0;
    }

    //Métodos
    public void Depositar(Double deposito){
        if(deposito > 0){
            this.saldoAtual += deposito;
            System.out.println("Depósito realizado! Saldo atual: " +saldoAtual);
        }else{
            System.out.println("valor inválido");
        }
    }

    public void Sacar (Double saque){
        if(saque > 0 && saldoAtual >= saque){
            this.saldoAtual -= saque;
            System.out.println("Saque realizado!\n Seu saldo atual é de : " +saldoAtual);
        }else{
            System.out.println("valor inválido");
        }

    }

    public void Render (){
        double valor;
        this.saldoRendimentos = this.saldoAtual;
        if(saldoAtual != 0){
            for (int i = 0; i < 12; i++) {
                valor = this.saldoRendimentos * 10  / 100;
                saldoRendimentos+=valor;
                System.out.println(saldoRendimentos);
            }
        }else{
            System.out.println("Saldo Zerado, opção inválida.");
        }
    }

    //GETTERS E SETTERS
    public Double getSaldoRendimentos() {
        return saldoRendimentos;
    }

    public void setSaldoRendimentos(Double saldoRendimentos) {
        this.saldoRendimentos = saldoRendimentos;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
