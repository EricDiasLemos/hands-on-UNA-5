package lanchonete;

import java.util.HashMap;

public class GerenciadorPedidos {

    HashMap<Integer, Pedido> pedidos = new HashMap<>();

    void cadastrar(int numero, String nomeCliente, String item, double valor) {
        if (pedidos.containsKey(numero)) {
            System.out.println("Ja existe um pedido com esse numero.");
            return;
        }
        pedidos.put(numero, new Pedido(numero, nomeCliente, item, valor));
        System.out.println("Pedido cadastrado com sucesso!");
    }

    void listar() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        System.out.println("=== Lista de Pedidos ===");
        for (Pedido p : pedidos.values()) {
            p.exibir();
        }
    }

    void atualizarStatus(int numero, int opcao) {
        Pedido p = pedidos.get(numero);
        if (p == null) {
            System.out.println("Pedido nao encontrado.");
            return;
        }
        switch (opcao) {
            case 1: p.status = "PENDENTE"; break;
            case 2: p.status = "PREPARANDO"; break;
            case 3: p.status = "FINALIZADO"; break;
            default: System.out.println("Opcao invalida."); return;
        }
        System.out.println("Status atualizado para: " + p.status);
    }

    void buscar(int numero) {
        Pedido p = pedidos.get(numero);
        if (p == null) {
            System.out.println("Pedido nao encontrado.");
            return;
        }
        p.exibir();
    }

    void totalPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        double total = 0;
        for (Pedido p : pedidos.values()) {
            total += p.valor;
        }
        System.out.println("Valor total dos pedidos: R$ " + total);
    }
}
