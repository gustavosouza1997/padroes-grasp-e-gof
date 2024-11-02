package padrao_alta_coesao.adaptado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe que gerencia os empréstimos
public class EmprestimoController {
    private List<Emprestimo> emprestimos;

    public EmprestimoController() {
        this.emprestimos = new ArrayList<>();
    }

    // Método que registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Método que devolve um livro
    public void devolverLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + livro.getTitulo() + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + livro.getTitulo() + "\" não encontrado ou já devolvido.");
    }

    // Função para calcular multas de todos os empréstimos  
    public void calcularMultas() { 
        for (Emprestimo emprestimo : emprestimos) { 
            if (!emprestimo.isDevolvido()) { 
                double multa = emprestimo.calcularMulta();  System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);  
            } 
        } 
    }

    // Método que retorna a lista de empréstimos
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
