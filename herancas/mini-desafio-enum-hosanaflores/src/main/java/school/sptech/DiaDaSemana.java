package school.sptech;

public enum DiaDaSemana {
    DOMINGO("Domingo", 1),
    SEGUNDA("Segunda", 2),
    TERCA("Terça", 3),
    QUARTA("Quarta", 4),
    QUINTA("Quinta", 5),
    SEXTA("Sexta", 6),
    SABADO("Sábado", 7);


    private String diaSemana;
    private Integer numero;

    DiaDaSemana(String diaSemana, Integer numero) {
        this.diaSemana = diaSemana;
        this.numero = numero;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public Integer getNumero() {
        return numero;
    }
}

