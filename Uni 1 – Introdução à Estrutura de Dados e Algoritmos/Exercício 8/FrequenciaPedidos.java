import java.util.*;

public class FrequenciaPedidos {
    public static void main(String[] args) {
        ArrayList<Integer> pedidos = new ArrayList<>();

        System.out.println("Digite os códigos dos pedidos (0 para finalizar):");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int pedido = scanner.nextInt();
                if (pedido == 0) break;
                pedidos.add(pedido);
            }
        }

        Map<Integer, Integer> contagem = new HashMap<>();
        for (int p : pedidos) {
            contagem.put(p, contagem.getOrDefault(p, 0) + 1);
        }

        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi registrado.");
            return;
        }

        int maxPedido = pedidos.get(0);
        for (int p : contagem.keySet()) {
            if (contagem.get(p) > contagem.get(maxPedido)) {
                maxPedido = p;
            }
        }

        System.out.println("O item mais pedido é: " + maxPedido);
    }
}
