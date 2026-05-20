package lanchonete;

import java.util.Scanner;

public class lanchonete {

    static GerenciadorPedidos gerenciador = new GerenciadorPedidos();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== LANCHONETE ===");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo numero");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: cadastrar(); break;
                case 2: gerenciador.listar(); break;
                case 3: atualizarStatus(); break;
                case 4: buscar(); break;
                case 5: gerenciador.totalPedidos(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    static void cadastrar() {
        scanner.nextLine();
        System.out.print("Numero do pedido: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Item pedido: ");
        String item = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        gerenciador.cadastrar(numero, nomeCliente, item, valor);
    }

    static void atualizarStatus() {
        System.out.print("Numero do pedido: ");
        int numero = scanner.nextInt();
        System.out.println("Novo status:");
        System.out.println("1 - PENDENTE");
        System.out.println("2 - PREPARANDO");
        System.out.println("3 - FINALIZADO");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();
        gerenciador.atualizarStatus(numero, opcao);
    }

    static void buscar() {
        System.out.print("Numero do pedido: ");
        int numero = scanner.nextInt();
        gerenciador.buscar(numero);
    }
}
