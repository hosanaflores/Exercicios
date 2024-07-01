public class ContaPoupanca extends ContaBancaria {

    private Double reservaMonetaria;

    public ContaPoupanca(String numeroDaConta, String agencia, String nomeTitular, Double reservaMonetaria) {
        super(numeroDaConta, agencia, nomeTitular);
        this.reservaMonetaria = reservaMonetaria;
    }

    public ContaPoupanca() {
        this.reservaMonetaria = 0.0;
    }

    //Métodos
    public void reservarDinheiro(Double quantiaDinheiro){
        reservaMonetaria += quantiaDinheiro;
    }

    //Getters e Setters
    public Double getReservaMonetaria() {
        return reservaMonetaria;
    }

    public void setReservaMonetaria(Double reservaMonetaria) {
        this.reservaMonetaria = reservaMonetaria;
    }
}
