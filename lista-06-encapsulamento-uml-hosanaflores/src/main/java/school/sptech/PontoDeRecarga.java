package school.sptech;

public class PontoDeRecarga {

    private Integer qtdConsultasRealizadas;
    private Integer qtdRecargasRealizadas;


    public Double consultarSaldo(BilheteUnico bilheteUnico){
        if(bilheteUnico.getBloqueado().equals(true)){
            System.out.println("bilhete único bloqueado");
            return 0.0;
        }else{
            qtdConsultasRealizadas++;
            return bilheteUnico.getSaldo();
        }
    }

    public void recarregar(BilheteUnico bilheteUnico, Double valor){
        if(valor >= 5.0 && bilheteUnico.getBloqueado().equals(false)) {
            bilheteUnico.setSaldo(bilheteUnico.getSaldo()+valor);
            qtdRecargasRealizadas++;
        } else{
            System.out.println("Valor mínimo de recarga não atingido");
            System.out.println("bilhete único bloqueado");
          }
    }

    public void bloquear(BilheteUnico bilheteUnico){
       bilheteUnico.setBloqueado(true);
    }

    public Integer getQtdConsultasRealizadas() {
        return qtdConsultasRealizadas;
    }

    public Integer getQtdRecargasRealizadas() {
        return qtdRecargasRealizadas;
    }
}
