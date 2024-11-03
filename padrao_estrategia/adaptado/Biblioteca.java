package padrao_estrategia.adaptado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com lógica fixa para calcular multas
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }
    
    // Registra um empréstimo usando a estratégia apropriada
    public void registrarEmprestimo(Object midia, String nomeDoUsuario, LocalDate dataDeDevolucao, EstrategiaMulta estrategiaMulta) {
        Emprestimo emprestimo = new Emprestimo(midia, nomeDoUsuario, dataDeDevolucao, estrategiaMulta);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

    // Calcula multas sem if-else
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();

                if (multa > 0) {
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
                }
            }
        }
    }
}