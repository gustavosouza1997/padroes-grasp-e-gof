package padrao_composto.adaptado;

// Classe que representa uma revista 
public class Revista implements Midia { 
    private String titulo; 
    private int edicao; 

    public Revista(String titulo, int edicao) { 
        this.titulo = titulo; 
        this.edicao = edicao; 
    } 

    public String getTitulo() { 
        return titulo; 
    }

    // Substituído o método toString por exibir para manter a consistencia entre as classes que implementam a interface Midia
    public void exibir() { 
        System.out.println("Revista: " + titulo + ", Edição: " + edicao);
    } 
}