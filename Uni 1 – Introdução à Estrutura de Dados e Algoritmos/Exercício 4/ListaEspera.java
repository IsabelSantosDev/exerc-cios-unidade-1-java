import java.util.ArrayList;
import java.util.Scanner;

public class ListaEspera {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String comando;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Digite 'adicionar' ou 'remover' (ou 'sair' para encerrar): ");
                comando = scanner.nextLine();

                if(comando.equalsIgnoreCase("adicionar")){
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    lista.add(nome);
                } else if(comando.equalsIgnoreCase("remover")){
                    System.out.print("Nome do cliente a remover: ");
                    String nome = scanner.nextLine();
                    lista.remove(nome);
                }

                System.out.println("Lista atual: " + lista);
            } while(!comando.equalsIgnoreCase("sair"));
        }
    }
}
