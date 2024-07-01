package ex02;

public class Encomenda {
   private String tamanho;
   private String enderecoRemetente;
   private String enderecoDestinatario;
   private Double distancia;
   private Double valorProduto;
   private Double freteDoProduto;

   public Encomenda (String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorProduto){
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorProduto = valorProduto;
        this.freteDoProduto = 0.0;
   }

   public Encomenda (){

   }

    Double calcularFrete() {

        if (tamanho.equals("P") && distancia <= 50.0) {
            freteDoProduto += (valorProduto * 1.0 / 100.0) + 3.0;

        } else if (tamanho.equals("P") && distancia <= 200.0) {
            freteDoProduto += (valorProduto * 1.0 / 100.0) + 5.0;

        } else if(tamanho.equals("P") && distancia > 200.0) {
            freteDoProduto += (valorProduto * 1.0 / 100.0) + 7.0;

        } else if (tamanho.equals("M") && distancia <= 50.0) {
            freteDoProduto += (valorProduto * 3.0 / 100.0) + 3.0;

        } else if (tamanho.equals("M") && distancia <= 200.0) {
            freteDoProduto += (valorProduto * 3.0 / 100.0) + 5.0;

        } else if(tamanho.equals("M") && distancia > 200.0) {
            freteDoProduto += (valorProduto * 3.0 / 100.0) + 7.0;

        } else if (tamanho.equals("G") && distancia <= 50.0) {
            freteDoProduto += (valorProduto * 5.0 / 100.0) + 3.0;

        } else if (tamanho.equals("G") && distancia <= 200.0) {
            freteDoProduto += (valorProduto * 5.0 / 100.0) + 5.0;

        } else if(tamanho.equals("G") && distancia > 200.0) {
            freteDoProduto += (valorProduto * 5.0 / 100.0) + 7.0;
        }
        return freteDoProduto;
    }

    void aplicarCupomDeDesconto(Integer percentualDesconto) {
        valorProduto -= (valorProduto * percentualDesconto / 100);
    }

    Double valorTotalDaEncomenda() {

        if (tamanho.equals("P") && distancia <= 50.0) {
            valorProduto += (valorProduto * 1.0 / 100.0) + 3.0;

        } else if (tamanho.equals("P") && distancia <= 200.0) {
            valorProduto += (valorProduto * 1.0 / 100.0) + 5.0;

        } else if (tamanho.equals("P") && distancia > 200.0) {
            valorProduto += (valorProduto * 1.0 / 100.0) + 7.0;

        } else if (tamanho.equals("M") && distancia <= 50.0) {
            valorProduto += (valorProduto * 3.0 / 100.0) + 3.0;

        } else if (tamanho.equals("M") && distancia <= 200.0) {
            valorProduto += (valorProduto * 3.0 / 100.0) + 5.0;

        } else if (tamanho.equals("M") && distancia > 200.0) {
            valorProduto += (valorProduto * 3.0 / 100.0) + 7.0;

        } else if (tamanho.equals("G") && distancia <= 50.0) {
            valorProduto += (valorProduto * 5.0 / 100.0) + 3.0;

        } else if (tamanho.equals("G") && distancia <= 200.0) {
            valorProduto += (valorProduto * 5.0 / 100.0) + 5.0;

        } else if (tamanho.equals("G") && distancia > 200.0) {
            valorProduto += (valorProduto * 5.0 / 100.0) + 7.0;
        }

        return valorProduto;
    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Double getFreteDoProduto() {
        return freteDoProduto;
    }

    public void setFreteDoProduto(Double freteDoProduto) {
        this.freteDoProduto = freteDoProduto;
    }
}
