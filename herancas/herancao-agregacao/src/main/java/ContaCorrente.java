public class ContaCorrente extends ContaBancaria{
    private Double limiteChequeEspecial;
//construtor não é herdado, mas posso chamá-los(reaproveitado).
// diferença = default da acesso em outro pacote.

    public ContaCorrente(String nomeTitular, Double limiteChequeEspecial) {
        super(nomeTitular);
        //this.nomeTitular = nomeTitular;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    //sobrescrevendo o método
    // toString herdado do Object

    //sobrecarga versões diferentes do método.
    // sobreescrito = estava escrito, e escrevi po cima.
    @Override
    public void sacar(Double valorSaque) {
         Double valorPermitidoSaque = this.limiteChequeEspecial + super.saldo;
         if(valorSaque > 0 && valorSaque <= valorPermitidoSaque){
             saldo -= valorSaque;
             qtdOperacoes++;
             System.out.println("Saque efetuado!");
         }else{
             System.out.println("Valor inválido!");
         }
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return """
               %s
                Limite Cheque: %.2f""".formatted(super.toString(), limiteChequeEspecial);
    }
}
