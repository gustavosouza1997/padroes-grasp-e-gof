package padrao_adaptador.original;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca diretamente acoplada ao serviço externo de  pagamento 
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private ServicoPagamentoExterno servicoPagamento; // Acoplamento  direto
    
    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
        this.servicoPagamento = new ServicoPagamentoExterno();
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
                // Interface incompatível com o sistema da biblioteca
                servicoPagamento.pagarFatura(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}