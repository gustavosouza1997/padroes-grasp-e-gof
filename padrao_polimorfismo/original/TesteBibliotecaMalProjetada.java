package padrao_polimorfismo.original;

// Classe de teste 
public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) { 
        Biblioteca biblioteca = new Biblioteca(); 

        biblioteca.adicionarLivro("O Senhor dos Anéis", "J.R.R.  Tolkien"); 
        biblioteca.adicionarRevista("National Geographic", 202);  
        biblioteca.adicionarLivro("1984", "George Orwell");

        System.out.println("\nMídias na biblioteca:");  
        biblioteca.exibirMidias(); 
    } 
}  