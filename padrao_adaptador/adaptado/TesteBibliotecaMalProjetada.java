package padrao_adaptador.adaptado;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
       // Usa o adaptador em vez de se acoplar diretamente ao ServicoPagamentoExterno
       ServicoPagamento servicoPagamento = new AdaptadorServicoPagamento();
       Biblioteca biblioteca = new Biblioteca(servicoPagamento);

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R.Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));
        
        System.out.println("\nProcessando pagamentos de multas:");

        biblioteca.processarPagamentosDeMultas();
    }
}