package padrao_variacao_protegida.adaptado;

import java.time.LocalDate; 
import java.util.ArrayList; 
import java.util.List;

// Classe Biblioteca diretamente acoplada à lógica de cálculo de multa 
public class Biblioteca { 
    private List<Emprestimo> emprestimos; 

    public Biblioteca() { 
        this.emprestimos = new ArrayList<>(); 
    } 

    // Adiciona um empréstimo 
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario,  LocalDate dataDeDevolucao, AdaptadorMulta adaptadorMulta) { 
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario,  dataDeDevolucao, adaptadorMulta); 
        emprestimos.add(emprestimo); 
        
        System.out.println("Empréstimo registrado: Livro \"" +  livro.getTitulo() + "\" para " + nomeDoUsuario); 
    } 

    // Exibe as multas para todos os empréstimos 
    public void calcularMultas() { 
        for (Emprestimo emprestimo : emprestimos) { 
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta(); // Lógica  de multa fixa 
            
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);  
            } 
        } 
    } 

    // Devolve um livro 
    public void devolverLivro(String tituloDoLivro) {  
        for (Emprestimo emprestimo : emprestimos) { 
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) &&  !emprestimo.isDevolvido()) { 
                emprestimo.setDevolvido(true); 
    
                System.out.println("Livro \"" + tituloDoLivro + "\"  devolvido com sucesso."); 
    
                return; 
            } 
        }

        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não  encontrado ou já devolvido."); 
    } 
} 