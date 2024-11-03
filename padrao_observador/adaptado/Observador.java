package padrao_observador.adaptado;

// Interface com o método que será chamado quando o estado do objeto observado mudar
public interface Observador {
    void atualizar(Emprestimo emprestimo);
}
