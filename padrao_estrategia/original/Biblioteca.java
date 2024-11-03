package padrao_estrategia.original;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com lógica fixa para calcular multas
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }
    
    // Registra um empréstimo
    public void registrarEmprestimo(Object midia, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(midia, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

    // Calcula multas com lógica fixa usando if-else
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                double multa = 0.0;
    
               // Lógica condicional fixa para calcular multas
                if (emprestimo.getMidia() instanceof Livro) {
                    multa = diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
                    // Multa para livros
                } else if (emprestimo.getMidia() instanceof Revista) {
                    multa = diasAtraso > 0 ? diasAtraso * 1.0 : 0.0;
                    // Multa para revistas
                }

                if (multa > 0) {
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
                }
            }
        }
    }
}