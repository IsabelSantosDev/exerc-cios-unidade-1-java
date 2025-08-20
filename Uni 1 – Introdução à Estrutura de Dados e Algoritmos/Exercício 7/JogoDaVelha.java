import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        inicializarTabuleiro(tabuleiro);

        char jogador = 'X';
        boolean jogoAtivo = true;
        int jogadas = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (jogoAtivo) {
                exibirTabuleiro(tabuleiro);

                int linha, coluna;

                // Leitura válida de posição
                while (true) {
                    System.out.println("Jogador " + jogador + ", digite linha e coluna (0-2):");
                    System.out.print("Linha: ");
                    linha = scanner.nextInt();
                    System.out.print("Coluna: ");
                    coluna = scanner.nextInt();

                    if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                        if (tabuleiro[linha][coluna] == ' ') {
                            tabuleiro[linha][coluna] = jogador;
                            jogadas++;
                            break;
                        } else {
                            System.out.println("Posição ocupada. Tente novamente.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Linhas e colunas de 0 a 2.");
                    }
                }

                // Verificar vitória
                if (verificarVitoria(tabuleiro, jogador)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Parabéns! Jogador " + jogador + " venceu!");
                    jogoAtivo = false;
                } else if (jogadas == 9) { // Empate
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Empate! O tabuleiro está cheio.");
                    jogoAtivo = false;
                } else {
                    // Alternar jogador
                    jogador = (jogador == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    // Inicializa o tabuleiro com espaços vazios
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Verifica vitória do jogador
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        // Diagonais
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }
}
