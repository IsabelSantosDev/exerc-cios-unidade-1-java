import java.util.ArrayList;

class Pessoa {
    String nome;
    int idade;
    String endereco;

    Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
}

public class CadastroClientes {
    public static void main(String[] args) {
        ArrayList<Pessoa> clientes = new ArrayList<>();
        clientes.add(new Pessoa("Isabel Santos", 20, "Rua A, 123"));
        clientes.add(new Pessoa("João Silva", 25, "Rua B, 456"));

        for(Pessoa p : clientes){
            System.out.println(p.nome + " - " + p.idade + " anos - " + p.endereco);
        }
    }
}
