import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Veiculo {

    protected  String nomeCliente;
    protected  String marca;
    protected Double valor;
    protected Integer anoFabricacao;

    public Veiculo(String nomeCliente, String marca, Double valor, Integer anoFabricacao) {
        this.nomeCliente = nomeCliente;
        this.marca = marca;
        this.valor = valor;
        this.anoFabricacao = anoFabricacao;
    }

    //Classe abstrata pode ter método abstrato
    public abstract void exibirRelatorioRevisao();
   // também métodos que não são abstratos



    public Integer tempoDoVeiculo(){
        return LocalDateTime.now().getYear() - anoFabricacao;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
