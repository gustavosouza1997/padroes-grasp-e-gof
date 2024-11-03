package padrao_observador.adaptado;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) { 
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos(); 
        
        // Criando um observador de e-mail
        NotificadorEmail notificadorEmail = new NotificadorEmail();

        // Adicionando o observador ao gerenciador
        gerenciador.adicionarObservador(notificadorEmail);

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R.  Tolkien"); 
        Usuario usuario = new Usuario("João", "joao@email.com");  
        Emprestimo emprestimo = new Emprestimo(livro, usuario,  LocalDate.now().plusDays(3)); 
    
        // Registrando o empréstimo 
        gerenciador.registrarEmprestimo(emprestimo); 

        // Verificar e enviar notificações (aciona notificação) 
        System.out.println("\nVerificando notificações:");  
        gerenciador.verificarEEnviarNotificacoes(); 
    } 
}