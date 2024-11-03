package padrao_fabrica.adaptado;

import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca que utiliza a fábrica para criação das mídias
public class Biblioteca {
    private List<Object> midias;
    private MidiaFactory midiaFactory;

    public Biblioteca() {
        this.midias = new ArrayList<>();
        this.midiaFactory = new MidiaFactory();
    }

    // Método para adicionar mídia (Livro ou Revista) usando a fábrica
    public void adicionarMidia(String tipo, String titulo, String autorOuEdicao) {
        Object midia = midiaFactory.criarMidia(tipo, titulo, autorOuEdicao);
        
        if (midia != null) {
            midias.add(midia);
        }
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Object midia : midias) {
            System.out.println(midia.toString());
        }
    }
}