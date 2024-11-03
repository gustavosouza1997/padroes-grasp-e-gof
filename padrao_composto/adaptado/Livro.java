package padrao_composto.adaptado;

// Classe que representa um livro 
public class Livro implements Midia {
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    // Substituído o método toString por exibir para manter a consistencia entre as classes que implementam a interface Midia
    public void exibir() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }
}