public class Cliente {
    private String nome;
    private Double altura;
    private Double peso;
    private Plano plano;

    public Cliente(String nome, Double altura, Double peso, Plano plano) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Altura: %.2f
                Peso: %.1f
                Plano: %s
                """.formatted(nome, altura, peso, plano);
    }


}
