public class PetShop {

    private String nome;
    private Double faturamentoTotal;

    public PetShop (String nome, Double faturamentoTotal){
        this.nome = nome;
        this.faturamentoTotal = faturamentoTotal;
    }

    public PetShop (String nome){ // Outro pet shop
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }


    //Banho
    public void darBanho(Pet animal){ // recebendo objeto pet (Pet pet)
       // Double valorBanho = 90.0;
       // faturamentoTotal += valorBanho;
        //Double totalGastoPet = animal.getTotalGasto() + valorBanho
        //animal.setTotalGasto(totalGastoPet);
       // animal.setTotalGastos(animal.getTotalGastos()+valorBanho); // esta sendo realizado uma soma, do total gasto + o banho

        //Integer idasPetTotal = animal.getIdasPetShop() + 1;
        //animal.setIdasPetShop(idasPetTotal);

        //animal.setIdasPetShop(animal.getIdasPetShop() +1);

        darBanho(animal, 0.0); // reutilizei o método

    }

    public void darBanho(Pet animal, Double desconto){
        Double valorBanho = 90.0 - desconto;
        faturamentoTotal += valorBanho;
        animal.tomarBanho(valorBanho);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }
}
