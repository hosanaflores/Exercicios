package school.sptech;

public class Serie extends Midia{

    private Integer episodios;
    private Integer temporadas;
    private Integer duracaoEpisodio;

    public Serie(Integer episodios, Integer temporadas, Integer duracaoEpisodio) {
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public Serie() {
    }

    @Override
    public Integer calcularDuracaoTotal() {
       return episodios * duracaoEpisodio;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Integer episodios) {
        this.episodios = episodios;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(Integer duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }
}
