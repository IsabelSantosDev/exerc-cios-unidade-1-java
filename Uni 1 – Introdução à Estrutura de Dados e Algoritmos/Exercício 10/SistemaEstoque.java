import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;
    double preco;

    Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String toString(){
        return nome + " - Qtd: " + quantidade + " - R$ " + preco;
    }
}

public class SistemaEstoque {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        String comando;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Digite 'adicionar', 'remover', 'listar' ou 'sair': ");
                comando = scanner.nextLine();

                switch(comando.toLowerCase()){
                    case "adicionar":
                        System.out.print("Nome: "); 
                        String nome = scanner.nextLine();
                        System.out.print("Quantidade: "); 
                        int qtd = Integer.parseInt(scanner.nextLine());
                        System.out.print("Preço: "); 
                        double preco = Double.parseDouble(scanner.nextLine());
                        estoque.add(new Produto(nome, qtd, preco));
                        break;
                    case "remover":
                        System.out.print("Nome do produto a remover: "); 
                        String remover = scanner.nextLine();
                        estoque.removeIf(p -> p.nome.equalsIgnoreCase(remover));
                        break;
                    case "listar":
                        System.out.println("Produtos no estoque:");
                        for(Produto p : estoque){
                            System.out.println(p);
                        }
                        break;
                }
            } while(!comando.equalsIgnoreCase("sair"));
        } 
    }
}
