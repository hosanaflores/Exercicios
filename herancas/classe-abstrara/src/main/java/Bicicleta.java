public class Bicicleta extends Veiculo {
    private Double calibragemPneu;

    public Bicicleta(String nomeCliente, String marca, Double valor, Integer anoFabricacao, Double calibragemPneu) {
        super(nomeCliente, marca, valor, anoFabricacao);
        this.calibragemPneu = calibragemPneu;
    }

    //Sobrecarga argumentos diferentes
    @Override
    public void exibirRelatorioRevisao() { //sobrescrita

        System.out.println("Relatório da bike de: "+super.nomeCliente);
        if(calibragemPneu < 0.4){
            System.out.println("Calibragem incorreta, ajuste aqui!");
        }else{
            System.out.println("Calibragem ok!");
        }
    }

    public Double getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Double calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "calibragemPneu=" + calibragemPneu +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
