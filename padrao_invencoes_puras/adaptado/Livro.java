package padrao_invencoes_puras.adaptado;

// Classe que representa um livro 
public class Livro { 
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

    @Override 
    public String toString() { 
        return "Livro: " + titulo + ", Autor: " + autor;  
    }
} 