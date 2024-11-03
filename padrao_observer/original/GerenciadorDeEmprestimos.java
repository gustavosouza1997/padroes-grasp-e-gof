package padrao_observer.original;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeEmprestimos { 
    private List<Emprestimo> emprestimos; 

    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>(); 
    } 

    public void registrarEmprestimo(Emprestimo emprestimo) {  
        emprestimos.add(emprestimo); 
        System.out.println("Empréstimo registrado para: " +  emprestimo.getUsuario().getNome()); 
    }
     
    // Notificação manual de usuários sobre a devolução  
    public void verificarEEnviarNotificacoes() { 
        for (Emprestimo emprestimo : emprestimos) { 
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() > 0) { 
                System.out.println("Enviando notificação para: " +  emprestimo.getUsuario().getNome() + " - Lembrete: devolução do livro \"" +  emprestimo.getLivro().getTitulo() + "\" em breve."); 
            } 
        } 
    } 
}  