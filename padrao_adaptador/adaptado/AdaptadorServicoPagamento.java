package padrao_adaptador.adaptado;

// Implementação do adaptador que adapta o ServicoPagamentoExterno para a interface ServicoPagamento
public class AdaptadorServicoPagamento implements ServicoPagamento {
    private ServicoPagamentoExterno servicoPagamentoExterno;

    public AdaptadorServicoPagamento() {
        this.servicoPagamentoExterno = new ServicoPagamentoExterno();
    }

    @Override
    public void pagarFatura(String nomeDoUsuario, double valor) {
        // Chamada para o serviço externo
        servicoPagamentoExterno.pagarFatura(nomeDoUsuario, valor);
    }
}
