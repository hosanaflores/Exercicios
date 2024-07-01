public class ContaBancaria {

    //Atributos
    private String nomeTitular;
    private Double saldo;
    private  String numeroConta; //Por que a conta pode ter caracter e não usarei para fazer conta

    // DEBAIXO DOS ATRIBUTOS VEM OS CONSTRUTORES

    // Construtor: inicializar um objeto
    // é publico por padrão
    // sempre o mesmo nome da classe
    // não possui retorno

    public ContaBancaria(String nomeTitular, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria (){ //construtor vazio

    }

    //Métodos:
     void sacar(Double valorSaque){
        if(valorSaque > 0 && valorSaque <= saldo ){
            saldo -= valorSaque;
            System.out.println("Saque realizado");
        }else{
            System.out.println("Não é possível sacar");
        }
    }

    // this para referenciar o atributo
    // Padrão get e set
    // set = altera o valor de um atributo
    // get = busca o valor de um atributo

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(){
        return  nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}

// Public acessado no projeto todooo inteiro
// Private, apenas na classe
// Default somente as classes no mesmo pacote