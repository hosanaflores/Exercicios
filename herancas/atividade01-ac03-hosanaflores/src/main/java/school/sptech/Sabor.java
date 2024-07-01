package school.sptech;

public enum Sabor {

    CALABRESA(35.0),
    MUSSARELA(30.0),
    FRANGO(35.0),
    CARNE(40.0),
    PALMITO(40.0),
    CHOCOLATE(50.0);

    private final Double preco;

    Sabor(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

}
