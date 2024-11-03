package padrao_indirecao.adaptado;

// Classe Biblioteca não é mais acoplada com a lista de midias
// Tampouco possui acesso direto a lista de midias
public class Biblioteca { 
    private PersistenciaMidias persistenciaMidias;
    
    public Biblioteca(PersistenciaMidias persistenciaMidias) { 
        this.persistenciaMidias = persistenciaMidias;
    } 

    public void adicionarMidia(Midia midia) {
        persistenciaMidias.adicionarMidia(midia);
    }

    public void exibirMidias() {
        persistenciaMidias.exibirMidias();
    }    
} 