public enum Plano {
    //Padrão: NOME_TESTE
    BRONZE("Bronze", 100.99),
    PARATA("Prata", 150.99),
    OURO("Ouro", 200.99);

    private String titulo;
    private Double valor;

    Plano(String titulo, Double valor) {
        this.titulo = titulo;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getValor() {
        return valor;
    }
}
