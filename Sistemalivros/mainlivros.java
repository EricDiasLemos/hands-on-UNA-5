package Sistemalivros;

import java.util.Scanner;

public class mainlivros {

    static biblioteca biblioteca = new biblioteca();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE LIVROS ===");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: cadastrar(); break;
                case 2: biblioteca.listar(); break;
                case 3: emprestar(); break;
                case 4: devolver(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    static void cadastrar() {
        scanner.nextLine();
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        biblioteca.cadastrar(codigo, titulo, autor);
    }

    static void emprestar() {
        System.out.print("Codigo do livro: ");
        int codigo = scanner.nextInt();
        biblioteca.emprestar(codigo);
    }

    static void devolver() {
        System.out.print("Codigo do livro: ");
        int codigo = scanner.nextInt();
        biblioteca.devolver(codigo);
    }
}
