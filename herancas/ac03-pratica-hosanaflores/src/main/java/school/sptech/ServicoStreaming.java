package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ServicoStreaming {
    private String nome;
    private List<Midia> midias;

    public ServicoStreaming(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public ServicoStreaming() {
    }

    public void adicionar(Midia midia){
        midias.add(midia);
    }

    public Integer duracaoTotalPlataforma(){
        //Midia midia = null;
        Integer duracaoPlataforma = 0;
        for(Midia midiaDaVez : midias){
           duracaoPlataforma += midiaDaVez.calcularDuracaoTotal();
        }
        return  duracaoPlataforma;
    }

    public List<Midia> listarPorNotaMaior(Double nota){
        List<Midia> midiaNota = new ArrayList<>();
        for(Midia midiaDaVez : midias){
            if(midiaDaVez.getNota() > nota){
                midiaNota.add(midiaDaVez);
            }
        }
        return midiaNota;
    }

    public List<Midia> listarPorGenero(Genero genero){
        List<Midia> midiaGenero = new ArrayList<>();
        for(Midia midiaDaVez : midias){
            if(midiaDaVez.getGenero().equals(genero)){
                midiaGenero.add(midiaDaVez);
            }
        }
        return midiaGenero;
    }

    public List<Filme> listarFilmesPorGenero(Genero genero){
        List<Filme> filmesGenero = new ArrayList<>();
        for(Midia midiaDaVez : midias){
            if(midiaDaVez instanceof Filme){
                Filme filme = (Filme) midiaDaVez;
                if (filme.getGenero().equals(genero)) {
                    filmesGenero.add(filme);
                }
            }
        }

        return filmesGenero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
