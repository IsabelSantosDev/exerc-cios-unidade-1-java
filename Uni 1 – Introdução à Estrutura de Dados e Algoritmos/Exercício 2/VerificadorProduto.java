import java.util.Scanner;

public class VerificadorProduto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Digite o codigo do produto: ");
            int codigo = scanner.nextInt();

            if(codigo % 2 == 0){
                System.out.println("O código é par.");
            } else {
                System.out.println("O código é ímpar.");
            }
        }
    }
}
