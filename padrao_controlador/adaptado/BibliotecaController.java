package padrao_controlador.adaptado;

import java.time.LocalDate;

// Classe Controlador para gerenciar a lógica de controle da biblioteca
public class BibliotecaController {
    private Biblioteca biblioteca;

    public BibliotecaController() {
        this.biblioteca = new Biblioteca();
    }

    // Método para registrar um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        biblioteca.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        System.out.println("Empréstimo registrado para " + nomeDoUsuario + " com o livro " + livro.getTitulo());
    }

    // Método para devolver um livro
    public void devolverLivro(Livro livro) {
        biblioteca.devolverLivro(livro);
    }

    // Método para exibir multas
    public void exibirMultas() {
        System.out.println("\nMultas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() +
                        ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    // Método para consultar livros em atraso
    public void consultarLivrosEmAtraso() {
        System.out.println("\nConsultando livros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.estaAtrasado()) {
                System.out.println(emprestimo);
            }
        }
    }
}