package padrao_fachada.adaptado;

import java.time.LocalDate;

// Sistema de biblioteca que utiliza a fachada para gerenciar livros, revistas, empréstimos e multas
public class SistemaDeBiblioteca { 
    public static void main(String[] args) { 
        BibliotecaFachada biblioteca = new BibliotecaFachada();

        // Adicionando livros e revistas 
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R.  Tolkien"); 
        biblioteca.adicionarLivro(livro1); 

        Revista revista1 = new Revista("National Geographic", 202);  
        biblioteca.adicionarRevista(revista1); 

        // Registrando um empréstimo 
        Emprestimo emprestimo1 = new Emprestimo(livro1, "João",  LocalDate.now().minusDays(5)); 
        biblioteca.registrarEmprestimo(emprestimo1); 

        // Calculando a multa 
        double multa = biblioteca.calcularMulta(emprestimo1);  
        System.out.println("Multa para João: R$ " + multa);  } 
}