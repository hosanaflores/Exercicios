package school.sptech.ex3;

public class Funcionario {

    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer percentualReajuste){
        salario += (salario * percentualReajuste / 100);
    }

    Double calcularValorHora(){
        return salario / 220.0;
    }

    Double calcularHoraExtra(Integer horaExtra, Integer percentualAdicionalNoturno){

            Double salarioHoraConvencional = salario / 220.0;
            Double salarioHoraExtra = salarioHoraConvencional * horaExtra;
            Double adicionalNoturno = (salarioHoraExtra * percentualAdicionalNoturno) / 100;
            Double salarioHoraExtraComAddNot = salarioHoraExtra + adicionalNoturno;

            return salarioHoraExtraComAddNot;
    }
}
