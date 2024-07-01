package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String titular;
    private String agencia;
    private String numero;
    private List<OperacaoBancaria> operacoes;

    public ContaCorrente(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.operacoes = new ArrayList<>();
    }

    public ContaCorrente(){
        this.operacoes = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void adicionarOperacao(String categoria, String descricao, Double valor){
       if(categoria == null || categoria.isBlank() || descricao == null || descricao.isBlank() || valor == null || valor == 0.0){
           System.out.println();
       }else{
           OperacaoBancaria operacaoBancaria = new OperacaoBancaria(categoria, descricao, valor);
           operacoes.add(operacaoBancaria);
       }

    }

    public List<OperacaoBancaria> buscarOperacoesPorCategoria(String categoria){
        List<OperacaoBancaria> existeCategoria = new ArrayList<>();
       for(OperacaoBancaria operacao : operacoes){
           if(operacao.getCategoria().equalsIgnoreCase(categoria)){
                    existeCategoria.add(operacao);
           }
       }
        return existeCategoria;
    }

    public List<OperacaoBancaria> buscarOperacoesPorValor(Double valor){
        List<OperacaoBancaria> existeValor = new ArrayList<>();
        for(OperacaoBancaria operacao : operacoes) {
            if(operacao.getValor().equals(valor))
                existeValor.add(operacao);
        }
        return existeValor;
    }

    public List<OperacaoBancaria> buscarOperacoesSaida(){
        List<OperacaoBancaria> existeNegativo = new ArrayList<>();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() < 0) {
                existeNegativo.add(operacao);
            }
        }
        return existeNegativo;
    }

    public List<OperacaoBancaria> buscarOperacoesEntrada(){
      List<OperacaoBancaria> existePositivo = new ArrayList<>();
      for(OperacaoBancaria operacao : operacoes){
          if(operacao.getValor() >= 0){
              existePositivo.add(operacao);
          }
      }
      return existePositivo;
    }

    public List<OperacaoBancaria> buscarOperacoesPorDescricao(String descricao){
        List<OperacaoBancaria> existeDescricao = new ArrayList<>();
        for(OperacaoBancaria operacao : operacoes){
            if(descricao != null && operacao.getDescricao().toLowerCase().contains(descricao.toLowerCase())){
                existeDescricao.add(operacao);
            }
        }
        return existeDescricao;
    }

    public Double buscarMaiorValor() {
        if(operacoes.isEmpty()){
            return 0.0;
        }
        Double maior = operacoes.get(0).getValor();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() > maior) {
                maior = operacao.getValor();
            }
        }
        return maior;
    }


    public Double buscarMenorValor(){
        if(operacoes.isEmpty()){
            return 0.0;
        }
        Double menor = operacoes.get(0).getValor();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() < menor) {
                menor = operacao.getValor();
            }
        }
        return menor;
    }

    public Double obterSaldo(){
        Double saldoFinal = 0.0;
        for (OperacaoBancaria operacao : operacoes) {
            saldoFinal += operacao.getValor();

        }
        return saldoFinal;
    }


}
