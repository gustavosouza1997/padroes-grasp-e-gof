package padrao_invencoes_puras.adaptado;

import java.time.LocalDate; 
import java.util.ArrayList; 
import java.util.List;

// Classe Biblioteca com acoplamento direto à lógica de notificação 
public class Biblioteca { 
    private List<Emprestimo> emprestimos; 
    // Objeto responsável pelas notificações
    private Notificador notificador;
    
    // Modificado o construtor para receber um objeto Notificador
    public Biblioteca(Notificador notificador) { 
        this.emprestimos = new ArrayList<>(); 
        this.notificador = notificador;
    } 

    // Registra um empréstimo 
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario,  String emailDoUsuario, LocalDate dataDeDevolucao) { 
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario,  emailDoUsuario, dataDeDevolucao); 
        emprestimos.add(emprestimo); 

    System.out.println("Empréstimo registrado: Livro \"" +  livro.getTitulo() + "\" para " + nomeDoUsuario); 
    }

    // Calcula multas e usa o Notificador para notificar usuários com multas
    public void notificarUsuariosComAtraso() {
        for (Emprestimo emprestimo : emprestimos) { 
            if (!emprestimo.isDevolvido()) { 
                long diasAtraso = emprestimo.calcularDiasAtraso();  
                
                if (diasAtraso > 0) { 
                    // Envia notificação de multa, no caso será um email pois biblioteca foi criada usando o notificador de email
                    String mensagem = "Você tem uma multa de R$ " + (diasAtraso * 2.0) + " pelo livro \"" + emprestimo.getLivro().getTitulo() + "\".";
                    notificador.enviarNotificacao(emprestimo.getEmailDoUsuario(), "Multa", mensagem);
                } 
            } 
        } 
    } 
}