package padrao_observador.adaptado;

// Classe que implementa a interface Observador e notifica usuários por e-mail sempre que for notificada
public class NotificadorEmail implements Observador {
    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.println("Enviando e-mail para " + emprestimo.getUsuario().getEmail() + " - Lembrete: devolução do livro \"" + emprestimo.getLivro().getTitulo() + "\" em breve.");
    }
}