package padrao_polimorfismo.adaptado;

import java.util.ArrayList; 
import java.util.List;

// Classe Biblioteca corrigida com polimorfismo 
public class Biblioteca { 
    private List<Object> midias; // Lista de mídias misturadas (Livro  e Revista) 
    
    public Biblioteca() { 
        this.midias = new ArrayList<>(); 
    } 

    // Removido os métodos adicionarLivro e adicionarRevista
    // Implementado método adicionarMidia que permite adicionar qualquer tipo de mídia a lista
    public void adicionarMidia(Midia midia) {  
        midias.add(midia);
    } 

    // Exibe informações de todas as mídias, devido a interface não é necessário saber o tipo da mídia
    public void exibirMidias() { 
        for (Object midia : midias) { 
            midia.toString();
        } 
    } 
} 