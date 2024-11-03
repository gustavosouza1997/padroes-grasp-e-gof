package padrao_composto.adaptado;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma coleção de livros ou revistas
public class ColecaoDeMidias implements Midia { 
    //Removido as listas de Livros e Revistas e substituído por uma lista de Midias
    private String nome; 
    private List<Midia> midias;

    public ColecaoDeMidias(String nome) { 
        this.nome = nome; 
        this.midias = new ArrayList<>();
    } 

    // Adiciona à coleção, independente do tipo de mídia
    public void adicionarMidia(Midia midia) { 
        midias.add(midia); 
    } 

    // Exibe todos os itens da coleção 
    public void exibir() { 
        System.out.println("Coleção: " + nome); 

        for (Midia midia : midias) {
            midia.exibir();
        }
    } 
} 