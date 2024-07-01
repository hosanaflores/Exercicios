public class Main {
    public static void main(String[] args) {

        Pet pet01 = new Pet("Bob");
        Pet pet02 = new Pet("link");

        PetShop petShop01 = new PetShop("PetShop Boys", 0.0);
        PetShop petShop02 = new PetShop("PetShop Girls");


        System.out.println("""
                Nome pet: %s
                Total gasto: %.2f
                Idas ao Pet Shop: %d
                """.formatted(pet01.getNome(),
                pet01.getTotalGastos(),
                pet01.getIdasPetShop()));

        petShop01.darBanho(pet01, 40.0);
        petShop02.darBanho(pet01);
       // petShop01.darBanho(pet01);
      //  petShop01.darBanho(pet01);

        System.out.println("""
                Nome pet: %s
                Total gasto: %.2f
                Idas ao Pet Shop: %d
                """.formatted(pet01.getNome(),
                pet01.getTotalGastos(),
                pet01.getIdasPetShop()));

    }
}
