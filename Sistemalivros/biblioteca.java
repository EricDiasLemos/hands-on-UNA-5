package Sistemalivros;

import java.util.ArrayList;

public class biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();

    void cadastrar(int codigo, String titulo, String autor) {
        livros.add(new Livro(codigo, titulo, autor));
        System.out.println("Livro cadastrado com sucesso!");
    }

    void listar() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        System.out.println("=== Lista de Livros ===");
        for (Livro l : livros) {
            l.exibir();
        }
    }

    void emprestar(int codigo) {
        for (Livro l : livros) {
            if (l.codigo == codigo) {
                if (l.disponivel) {
                    l.disponivel = false;
                    System.out.println("Livro \"" + l.titulo + "\" emprestado com sucesso!");
                } else {
                    System.out.println("Livro indisponivel para emprestimo.");
                }
                return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }

    void devolver(int codigo) {
        for (Livro l : livros) {
            if (l.codigo == codigo) {
                if (!l.disponivel) {
                    l.disponivel = true;
                    System.out.println("Livro \"" + l.titulo + "\" devolvido com sucesso!");
                } else {
                    System.out.println("Livro ja esta disponivel.");
                }
                return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }
}
