package school.sptech;

public class TesteBilheteUnico {

  public static void main(String[] args) {

          BilheteUnico bilheteUnico01 = new BilheteUnico();
           System.out.println(bilheteUnico01.getSaldo());
           System.out.println(bilheteUnico01.getBloqueado());
           System.out.println(bilheteUnico01.getEstudante());
           System.out.println(bilheteUnico01.getAno());
           System.out.println(bilheteUnico01.getTitular());
  }
}