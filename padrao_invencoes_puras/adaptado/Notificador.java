package padrao_invencoes_puras.adaptado;

// Interface Notificador que define o envio de notificações
public interface Notificador {
    void enviarNotificacao(String destinatario, String assunto, String mensagem);
}
