package padrao_adaptador.adaptado;

// Interface de serviço de pagamento
public interface ServicoPagamento {
    void pagarFatura(String identificador, double valor);
}