package padrao_composto.adaptado;

import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com padrão composto, sem código duplicado para  coleções 
public class Biblioteca { 
    // Removida as listas de livros, revistas e coleções e substituídas por uma lista de Midias
    private List<Midia> midias; 

    public Biblioteca() { 
        this.midias = new ArrayList<>();
    } 

    // Removido os códigos duplicados para adicionar livros, revistas e coleções
    // E substituído por um único método que adiciona qualquer tipo de mídia
    public void adicionarMidia(Midia midia) {  
        midias.add(midia); 
    } 

    // Exibe todas as mídias da biblioteca, independente de serem mídias individuais ou coleções
    public void exibirBiblioteca() { 
        for (Midia midia : midias) {
            midia.exibir();
        }
    } 
}