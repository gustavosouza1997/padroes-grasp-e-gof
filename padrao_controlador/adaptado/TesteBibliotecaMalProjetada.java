package padrao_controlador.adaptado;

import java.time.LocalDate; 

// Classe de teste corrigida que interage apenas com o controlador
public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) {
        BibliotecaController bibliotecaController = new BibliotecaController();

        // Registrar empréstimos
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        bibliotecaController.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        bibliotecaController.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        // Exibir multas
        bibliotecaController.exibirMultas();

        // Devolver um livro
        System.out.println("\nDevolvendo livro 1984...");
        bibliotecaController.devolverLivro(livro2);

        // Exibir multas após devolução
        bibliotecaController.exibirMultas();

        // Consultar livros em atraso
        bibliotecaController.consultarLivrosEmAtraso();
    } 
} 