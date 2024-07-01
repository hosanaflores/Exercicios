public class Loja {

    private String nomeLoja;
    private Integer qtdVendas;
    private Integer qtdMetaVendas;
    private Double valorTotalVendas;

    public Loja(String nomeLoja, Integer qtdMetaVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = 0.0;
    }

    public Loja(){

    }

    public void realizarVenda(Double valorVenda) {
            realizarVenda(valorVenda, 0.0);
    }

    public void realizarVenda(Double valorVenda, Double valorDesconto) {
        this.valorTotalVendas += valorVenda - valorDesconto;
        qtdVendas++;

    }

    public Boolean verificarMeta(){
    Boolean metaBatida;
        if (qtdVendas >= qtdMetaVendas){
            metaBatida = true;
        }else{
            metaBatida = false;
        }
        return metaBatida;
    }

    // GETTERS and SETTERS
    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }


    @Override
    public String toString() {
        String metaBatida;
       if (verificarMeta()){
           metaBatida = "Parabéns, sua meta foi batida";
       }else{
           metaBatida = "Infelizmente você não bateu a meta!";
       }
        return """
                Loja: %s
                Quantidade Vendas: %d
                Quantidade Metas: %d
                Valor Total Vendas: %.2f
                Meta: %s""".formatted(
                        nomeLoja,
                        qtdVendas,
                        qtdMetaVendas,
                        valorTotalVendas,
                        metaBatida
        );

    }
}
