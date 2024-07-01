import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos; // assim fica nula

    // O sinal em branquinho vai determinar se tem uma lista. A multiplicidade define isso.

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>(); // devo inicializar a lista aqui
    }

    public List<Contato> buscarContatoPeloNome(String nome){ // quando quiser fazer coisas referentes a itens da lista
        for (int i = 0; i < contatos.size() ; i++) {
            Contato contatoDaVez = contatos.get(i); // essa linha é de lá do outro for
            if(contatoDaVez.getNome().equals(nome)){
                System.out.println(contatoDaVez);
            }
        }

      //  Contato contatoEncontrado = null;
        //for (Contato contatoDaVez : contatos){ // Quando quiser fazer coisas referente a objetos da lista
         //   if(contatoDaVez.getNome().equals(nome)){
            //    contatoEncontrado = contatoDaVez;
          //  }
       // }
        //return contatoEncontrado;
   // }

          List<Contato> contatosEncontrado = new ArrayList<>();
        for (Contato contatoDaVez : contatos){ // Quando quiser fazer coisas referente a objetos da lista
           if(contatoDaVez.getNome().contains(nome)){
            contatosEncontrado.add(contatoDaVez);
          }
            }
            return contatosEncontrado;
        }

        //também posso construir um construtor vazio
    //public Grupo(){
       // this.contatos = new ArrayList<>();
    //}

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return """
                nome: %s
                contatos: %s""".formatted(nome, contatos);
    }
}
