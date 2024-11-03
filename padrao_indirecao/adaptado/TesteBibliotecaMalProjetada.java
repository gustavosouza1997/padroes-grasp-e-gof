package padrao_indirecao.adaptado;

// Classe de teste 
public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) { 
        PersistenciaMidias persistenciaMidias = new PersistenciaMidias();
        Biblioteca biblioteca = new Biblioteca(persistenciaMidias); 
    
        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R.  Tolkien"); 
        Midia revista1 = new Revista("National Geographic", 202); 

        biblioteca.adicionarMidia(livro1); 
        biblioteca.adicionarMidia(revista1); 

        System.out.println("\nMídias na biblioteca:");  
        biblioteca.exibirMidias(); 
    } 
}