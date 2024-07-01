package school.sptech;

public class Onibus {

    private Integer qtdPassageiros;
    private Double valorPassagem;


    public void cobrarPassagem(BilheteUnico bilheteUnico){

        if (bilheteUnico.getEstudante().equals(false) && bilheteUnico.getBloqueado().equals(false) && bilheteUnico.getSaldo() >= valorPassagem ){
           bilheteUnico.setSaldo(bilheteUnico.getSaldo() - (valorPassagem));
            qtdPassageiros++;

        }else{
            System.out.println("bilhete único bloqueado");
        }
            if(bilheteUnico.getEstudante().equals(true) && bilheteUnico.getBloqueado().equals(false) && bilheteUnico.getSaldo() >= (valorPassagem / 2)){
                bilheteUnico.setSaldo(bilheteUnico.getSaldo() - (valorPassagem / 2));
                qtdPassageiros++;
            }

    }

    public void cobrarPassagem(Double dinheiro){
        if(dinheiro < valorPassagem){
            System.out.println("Dinheiro insuficiente para realizar operação");

        }else{
            qtdPassageiros++;
        }
    }

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public Double getValorPassagem() {
        return valorPassagem;
    }
}
