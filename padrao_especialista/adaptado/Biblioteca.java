package padrao_especialista.adaptado;

import java.time.LocalDate; 
import java.util.ArrayList; 
import java.util.List;

// Classe mal projetada que gerencia a biblioteca 
public class Biblioteca { 
    private List<Emprestimo> emprestimos;

    public Biblioteca() { 
        this.emprestimos = new ArrayList<>(); 
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario,  LocalDate dataEmprestimo, LocalDate dataDevolucao) { 
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario,  dataEmprestimo, dataDevolucao); 
        emprestimos.add(emprestimo); 
    }    

    public void exibirMultas() { 
        for (Emprestimo emprestimo : emprestimos) { 
            
            // Modificado para chamar o método calcularMulta da classe Emprestimo
            double multa = emprestimo.calcularMulta(emprestimo); 
            System.out.println("Usuário: " +  emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);  
        } 
    } 
}  