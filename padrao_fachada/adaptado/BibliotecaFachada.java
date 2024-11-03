package padrao_fachada.adaptado;

// Fachada para a biblioteca que encapsula os métodos de gerenciamento de livros, revistas, empréstimos e multas
public class BibliotecaFachada {
    private GerenciadorDeLivros gerenciadorDeLivros;
    private GerenciadorDeRevistas gerenciadorDeRevistas;
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos;
    private CalculadoraDeMultas calculadoraDeMultas;

    public BibliotecaFachada() {
       this.gerenciadorDeLivros = new  GerenciadorDeLivros(); 
       this.gerenciadorDeRevistas = new  GerenciadorDeRevistas(); 
       this.gerenciadorDeEmprestimos = new  GerenciadorDeEmprestimos(); 
       this.calculadoraDeMultas = new  CalculadoraDeMultas(); 
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        gerenciadorDeLivros.adicionarLivro(livro);
    }

    // Método para adicionar uma revista
    public void adicionarRevista(Revista revista) {
        gerenciadorDeRevistas.adicionarRevista(revista);
    }

    // Método para registrar um empréstimo
    public void registrarEmprestimo(Emprestimo emprestimo) {
        gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo);
    }

    // Método para calcular multa de um empréstimo específico
    public double calcularMulta(Emprestimo emprestimo) {
        return calculadoraDeMultas.calcularMulta(emprestimo);
    }
}
