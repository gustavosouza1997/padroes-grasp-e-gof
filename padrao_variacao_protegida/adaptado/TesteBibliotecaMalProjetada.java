package padrao_variacao_protegida.adaptado;

import java.time.LocalDate; 

public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) { 
        Biblioteca biblioteca = new Biblioteca(); 

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R.  Tolkien"); 
        Livro livro2 = new Livro("1984", "George Orwell"); 
    
        // Ao criarmos um empréstimo passamos o tipo de multa como parâmetro
        biblioteca.registrarEmprestimo(livro1, "João",  LocalDate.now().minusDays(5), new MultaPadrao()); 
        biblioteca.registrarEmprestimo(livro2, "Maria",  LocalDate.now().minusDays(10), new MultaLivro()); 
    
        System.out.println("\nMultas registradas:"); 

        biblioteca.calcularMultas(); 

        System.out.println("\nDevolvendo livro 1984...");  
        biblioteca.devolverLivro("1984"); 

        System.out.println("\nMultas após devolução:");  
        biblioteca.calcularMultas(); 
    } 
}  