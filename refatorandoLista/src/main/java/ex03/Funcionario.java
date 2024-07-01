package ex03;

public class Funcionario {

  private String nome;
  private String cargo;
  private  Double salario;


  public Funcionario(String nome, String cargo, Double salario){
      this.nome = nome;
      this.cargo = cargo;
      this.salario = salario;
  }

  public Funcionario(){

  }

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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
