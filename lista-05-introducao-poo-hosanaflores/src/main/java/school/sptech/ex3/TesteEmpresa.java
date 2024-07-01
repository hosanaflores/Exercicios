package school.sptech.ex3;

public class TesteEmpresa {

  public static void main(String[] args) {

    Funcionario funcionario01 = new Funcionario();

    funcionario01.nome = "Hosana";
    funcionario01.cargo = "Desenvolvedora backend";
    funcionario01.salario = 1800.00;

    funcionario01.reajustarSalario(10);
    System.out.println(funcionario01.calcularValorHora());
    System.out.println(funcionario01.calcularHoraExtra(10, 10));
    
  }
}
