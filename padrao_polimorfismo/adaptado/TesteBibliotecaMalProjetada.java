package padrao_polimorfismo.adaptado;

// Classe de teste 
public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) { 
        Biblioteca biblioteca = new Biblioteca(); 

        // Substitua as chamadas para adicionarLivro e adicionarRevista por adicionarMidia
        // e passe um objeto do tipo Livro ou Revista como argumento
        biblioteca.adicionarMidia(new Livro("O Senhor dos Anéis", "J.R.R.  Tolkien"));
        biblioteca.adicionarMidia(new Revista("National Geographic", 202));
        biblioteca.adicionarMidia(new Livro("1984", "George Orwell"));

        System.out.println("\nMídias na biblioteca:");  
        biblioteca.exibirMidias(); 
    } 
}  