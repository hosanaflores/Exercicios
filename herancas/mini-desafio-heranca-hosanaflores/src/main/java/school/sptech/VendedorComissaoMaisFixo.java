package school.sptech;

public class VendedorComissaoMaisFixo extends VendedorComissao {
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(){

    }
    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    public VendedorComissaoMaisFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double calcularSalario(){
        return super.getVendas() * super.getTaxa() + salarioFixo;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
