public class Pet {

    private String nome;
   private Double totalGastos;
   private Integer idasPetShop;

   private Boolean banhoTomado;

   public Pet(String nome){
       this.nome = nome;
       this.totalGastos = 0.0;
       this.idasPetShop = 0;
       this.banhoTomado = false;
   }

   public void tomarBanho(Double valorBanho){
       totalGastos += valorBanho; // totalGasto + valorBanho
       idasPetShop++;
       banhoTomado = true;
   }


    public String getNome() {

       return nome;
    }

    public void setNome(String nome) {

       this.nome = nome;
    }

    public Double getTotalGastos() {

       return totalGastos;
    }

    public void setTotalGastos(Double totalGastos) {

       this.totalGastos = totalGastos;
    }

    public Integer getIdasPetShop() {

       return idasPetShop;
    }

    public void setIdasPetShop(Integer idasPetShop) {

       this.idasPetShop = idasPetShop;
    }
}
