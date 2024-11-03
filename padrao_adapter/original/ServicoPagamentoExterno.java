package padrao_adapter.original;

// Interface externa de serviço de pagamento 
class ServicoPagamentoExterno {
    public void pagarFatura(String identificador, double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado para o identificador: " + identificador);
    }
}