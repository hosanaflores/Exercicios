public class OperacoesBancarias {

    private Double valorSaque;
    private Double valorDeposito;

    public OperacoesBancarias(Double valorSaque, Double valorDeposito) {
        this.valorSaque = valorSaque;
        this.valorDeposito = valorDeposito;

    }

    public OperacoesBancarias() {
        this.valorSaque = 0.0;
        this.valorDeposito = 0.0;
    }

    // métodos


    // getters e setters

    public Double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public Double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(Double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

}
