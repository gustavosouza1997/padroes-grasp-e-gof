package padrao_observador.adaptado;

import java.util.ArrayList;
import java.util.List;

// Classe responsável por gerenciar os empréstimos e notificar os observadores
public class GerenciadorDeEmprestimos { 
    private List<Emprestimo> emprestimos;
    private List<Observador> observadores;

    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>(); 
        this.observadores = new ArrayList<>();
    }

    // Método para adicionar observadores
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Método para remover observadores
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    // Método para notificar todos os observadores
    private void notificarObservadores(Emprestimo emprestimo) {
        for (Observador observador : observadores) {
            observador.atualizar(emprestimo);
        }
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {  
        emprestimos.add(emprestimo); 
        System.out.println("Empréstimo registrado para: " +  emprestimo.getUsuario().getNome() + "Dev " + emprestimo.getDataDeDevolucao()); 
    }
     
    // Método para verificar se há empréstimos próximos do prazo e notificar
    public void verificarEEnviarNotificacoes() { 
        for (Emprestimo emprestimo : emprestimos) { 
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() > 0) { 
                notificarObservadores(emprestimo);
            } 
        } 
    } 
}  