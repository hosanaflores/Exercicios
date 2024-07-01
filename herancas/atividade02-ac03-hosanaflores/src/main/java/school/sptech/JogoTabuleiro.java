package school.sptech;

public class JogoTabuleiro extends Produto{

    private Integer qtdPecas;

    public JogoTabuleiro(Integer qtdPecas) {
        this.qtdPecas = qtdPecas;
    }

    public JogoTabuleiro() {
    }

    @Override
    public Double calcularPreco() {
        Double precoPorPeca = 0.0;
        Double porcentagem = 0.0;
        Double precoAdicional = 0.0;
        Double precoFinal = 0.0;

        // 100 reais * 20 / 100;
        if(getRaridade().equals(Raridade.MUITO_RARO)){
            precoPorPeca = qtdPecas * 0.50;
            porcentagem = Raridade.MUITO_RARO.getAdicionalPorcentagem();
            precoAdicional = precoPorPeca * porcentagem / 100.0;
            precoFinal = precoPorPeca + precoAdicional;

        }else if(getRaridade().equals(Raridade.RARO)){
            precoPorPeca = qtdPecas * 0.50;
            porcentagem = Raridade.RARO.getAdicionalPorcentagem();
            precoAdicional = precoPorPeca * porcentagem / 100.0;
            precoFinal = precoPorPeca + precoAdicional;

        }else if(getRaridade().equals(Raridade.COMUM)){
            precoPorPeca = qtdPecas * 0.50;
            porcentagem = Raridade.COMUM.getAdicionalPorcentagem();
            precoAdicional = precoPorPeca * porcentagem / 100.0;
            precoFinal = precoPorPeca + precoAdicional;

        }
        return precoFinal;
    }

    public Integer getQtdPecas() {
        return qtdPecas;
    }

    public void setQtdPecas(Integer qtdPecas) {
        this.qtdPecas = qtdPecas;
    }
}
