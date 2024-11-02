package padrao_polimorfismo.original;

import java.util.ArrayList; 
import java.util.List;

// Classe Biblioteca mal projetada, sem polimorfismo 
public class Biblioteca { 
    private List<Object> midias; // Lista de mídias misturadas (Livro  e Revista) 
    
    public Biblioteca() { 
        this.midias = new ArrayList<>(); 
    } 

    // Adiciona um livro à lista de mídias 
    public void adicionarLivro(String titulo, String autor) {  
        Livro livro = new Livro(titulo, autor); 
        midias.add(livro); 

        System.out.println("Livro adicionado: " + titulo);  
    } 

    // Adiciona uma revista à lista de mídias 
    public void adicionarRevista(String titulo, int edicao) {  
        Revista revista = new Revista(titulo, edicao);  midias.add(revista); 
    
        System.out.println("Revista adicionada: " + titulo);  
    }

    // Exibe informações de todas as mídias, mas precisa verificar o  tipo manualmente 
    public void exibirMidias() { 
        for (Object midia : midias) { 
            if (midia instanceof Livro) { 
                Livro livro = (Livro) midia; 

                System.out.println(livro); 
            } else if (midia instanceof Revista) { 
                Revista revista = (Revista) midia; 

                System.out.println(revista); 
            } 
        } 
    } 
} 