package padrao_polimorfismo.adaptado;

// Classe que representa uma Revista implementando a interface Midia
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

    public int getEdicao() { 
        return edicao; 
    } 

    @Override 
    public String toString() { 
        return "Revista: " + titulo + ", Edição: " + edicao;  
    } 
}