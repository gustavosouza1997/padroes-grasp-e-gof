package padrao_adapter.adaptado;

// Interface de serviço de pagamento
public interface ServicoPagamento {
    void pagarFatura(String identificador, double valor);
}