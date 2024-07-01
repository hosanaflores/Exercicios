package school.sptech;

public enum Raridade {

    COMUM(0.0),
    RARO(10.0),
    MUITO_RARO(20.0);

    private final Double adicionalPorcentagem;

    Raridade(Double adicionalPorcentagem) {
        this.adicionalPorcentagem = adicionalPorcentagem;
    }

    public Double getAdicionalPorcentagem() {
        return adicionalPorcentagem;
    }
}
