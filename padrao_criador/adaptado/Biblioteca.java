package padrao_criador.adaptado;

import java.util.ArrayList; 
import java.util.List;

// Classe mal projetada que gerencia a biblioteca 
public class Biblioteca { 
    private List<Emprestimo> emprestimos; 
    
    public Biblioteca() { 
        this.emprestimos = new ArrayList<>(); 
    } 

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario) { 
        livro.registrarEmprestimo(nomeDoUsuario);
    }
     
    public void exibirEmprestimos() { 
        for (Emprestimo emprestimo : emprestimos) { 
            System.out.println(emprestimo); 
        } 
    } 
}