package padrao_criador.original;

import java.util.ArrayList; 
import java.util.List;

// Classe mal projetada que gerencia a biblioteca 
public class Biblioteca { 
    private List<Emprestimo> emprestimos; 
    
    public Biblioteca() { 
        this.emprestimos = new ArrayList<>(); 
    } 

    // Método mal projetado que cria os empréstimos diretamente  public void registrarEmprestimo(Livro livro, String nomeDoUsuario)  { 
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario) { 
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario); 
        emprestimos.add(emprestimo); 
    }
     
    public void exibirEmprestimos() { 
        for (Emprestimo emprestimo : emprestimos) { 
            System.out.println(emprestimo); 
        } 
    } 
}