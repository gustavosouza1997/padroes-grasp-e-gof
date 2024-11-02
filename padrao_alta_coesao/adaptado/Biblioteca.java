package padrao_alta_coesao.adaptado;

import java.time.LocalDate;

// Classe com baixa coesão - Biblioteca faz várias tarefas não  relacionadas 
public class Biblioteca { 
    private LivroController livroController;
    private EmprestimoController emprestimoController;
    
    public Biblioteca() { 
        this.livroController = new LivroController(); 
        this.emprestimoController = new EmprestimoController();
    } 

    // Modificado para chamar o método adicionarLivro de LivroController
    public void adicionarLivro(String titulo) { 
        livroController.adicionarLivro(titulo);
    } 

    // Modificado para chamar o método registrarEmprestimo de EmprestimoController e passar o livro encontrado pelo livroController 
    public void registrarEmprestimo(String tituloDoLivro, String  nomeDoUsuario, LocalDate dataDeDevolucao) { 
        emprestimoController.registrarEmprestimo(livroController.encontrarLivro(tituloDoLivro), nomeDoUsuario, dataDeDevolucao);
    } 

    // Modificado para chamar o método devolverLivro de EmprestimoController e passar o livro encontrado pelo livroController 
    public void devolverLivro(String tituloDoLivro) {  
        emprestimoController.devolverLivro(livroController.encontrarLivro(tituloDoLivro));
    }
     
    // Modificado para chamar o método calcularMultas de EmprestimoController
    public void calcularMultas() { 
        emprestimoController.calcularMultas();
    }
} 