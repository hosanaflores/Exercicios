package ex03;

import ex03.Funcionario;

public class TesteEmpresa {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario("Hosana", "Desenvolvedora backend", 1800.00);

        funcionario01.reajustarSalario(10);
        funcionario01.calcularValorHora();
        funcionario01.calcularHoraExtra(10, 10);

        System.out.println(funcionario01.getNome());
        System.out.println(funcionario01.getCargo());
        System.out.println(funcionario01.getSalario());

    }
}
