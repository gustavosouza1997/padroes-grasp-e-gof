package padrao_invencoes_puras.adaptado;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviarNotificacao(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}