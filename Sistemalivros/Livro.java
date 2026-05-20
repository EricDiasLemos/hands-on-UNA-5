package Sistemalivros;

public class Livro {
    int codigo;
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void exibir() {
        String status = disponivel ? "Disponivel" : "Indisponivel";
        System.out.println(codigo + " - " + titulo + " | " + autor + " | " + status);
    }
}
