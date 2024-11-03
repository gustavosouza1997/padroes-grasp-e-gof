package padrao_baixo_acoplamento.adaptado;

import java.time.LocalDate;

// Classe Biblioteca com alto acoplamento 
public class Biblioteca { 
    private LivroController livroController;
    private EmprestimoController emprestimoController;

    public Biblioteca() { 
        this.livroController = new LivroController();
        this.emprestimoController = new EmprestimoController();
    } 

    // Adiciona um livro utilizando o controller
    public void adicionarLivro(String titulo) { 
        livroController.adicionarLivro(titulo);
    } 

    // Busca o livro pelo titulo utilizando o controller de livros
    // E registra o emprestimo utilizando o controller de emprestimos
    public void registrarEmprestimo(String tituloDoLivro, String  nomeDoUsuario, LocalDate dataDeDevolucao) { 
        Livro livro = livroController.encontrarLivro(tituloDoLivro);
        if (livro != null) {
            emprestimoController.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    // Encontra o livro utilizando o controller de livros
    // E devolve um livro utilizando o controller de emprestimos
    public void devolverLivro(String tituloDoLivro) {  
        emprestimoController.devolverLivro(livroController.encontrarLivro(tituloDoLivro));
    } 

    // Calcula multas diretamente 
    public void calcularMultas() { 
        emprestimoController.calcularMultas();
    } 
}