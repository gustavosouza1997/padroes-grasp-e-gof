package padrao_adaptador.adaptado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca que utiliza adaptadores para o serviço de pagamento
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private ServicoPagamento servicoPagamento; //  Dependência na interface, não no serviço específico
    
    public Biblioteca(ServicoPagamento servicoPagamento) {
        this.emprestimos = new ArrayList<>();
        this.servicoPagamento = servicoPagamento;
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Processa as multas e paga através do serviço de pagamento externo
    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                servicoPagamento.pagarFatura(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}