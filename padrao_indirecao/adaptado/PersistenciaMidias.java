package padrao_indirecao.adaptado;

import java.util.ArrayList;
import java.util.List;

public class PersistenciaMidias {
    private List<Midia> midias;

    public PersistenciaMidias() {
        this.midias = new ArrayList<>();
    }

    // Adiciona qualquer tipo de mídia 
    public void adicionarMidia(Midia midia) { 
        midias.add(midia); 
        System.out.println("Mídia adicionada: " + midia.getTitulo());  
    }
    
    // Exibe todas as mídias 
    public void exibirMidias() { 
        for (Midia midia : midias) { 
            midia.exibirDetalhes(); 
        } 
    } 
}