public class Carro extends  Veiculo{
    private Double nivelOleo;
    private Boolean possuiEstepe;

    public Carro(String nomeCliente, String marca, Double valor, Integer anoFabricacao, Double nivelOleo, Boolean possuiEstepe) {
        super(nomeCliente, marca, valor, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public void exibirRelatorioRevisao() {
        System.out.println("Relatório do Carro de: "+nomeCliente);
        if (nivelOleo < 1.5) {
            System.out.println("Nível do óleo baixo! Troque com a gente");
        }else{
            System.out.println("Nível do óleo ok");
        }

        if(possuiEstepe){
            System.out.println("Estepe ok!");
        }else{
            System.out.println("Sem estepe, compre com a gente :) ");
        }
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nivelOleo=" + nivelOleo +
                ", possuiEstepe=" + possuiEstepe +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
