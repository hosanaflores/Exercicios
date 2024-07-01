package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;
    Double freteDoProduto = 0.0;
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
}