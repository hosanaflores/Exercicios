public class ContaBancaria {
    protected String nomeTitular;
    protected Double saldo;
    protected Integer qtdOperacoes;

    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.qtdOperacoes = 0;
    }

    public void sacar(Double valorSaque){
        if(valorSaque > 0 && valorSaque <= saldo){
            saldo -= valorSaque;
            qtdOperacoes++;
            System.out.println("Saque efetuado!");
        }else{
            System.out.println("Valor inválido!");
        }

    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getQtdOperacoes() {
        return qtdOperacoes;
    }

    public void setQtdOperacoes(Integer qtdOperacoes) {
        this.qtdOperacoes = qtdOperacoes;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Saldo: %.2f
                Quantidade Operações: %d
                Limite Cheque: %.2f
                """.formatted(nomeTitular, saldo, qtdOperacoes);
    }
}
