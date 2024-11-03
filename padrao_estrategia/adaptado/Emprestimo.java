package padrao_estrategia.adaptado;

import java.time.LocalDate;

// Classe que representa um empréstimo 
public class Emprestimo {
    private Object midia;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private EstrategiaMulta estrategiaMulta;
    private boolean devolvido;

    public Emprestimo(Object midia, String nomeDoUsuario, LocalDate dataDeDevolucao, EstrategiaMulta estrategiaMulta) {
        this.midia = midia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.estrategiaMulta = estrategiaMulta;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public long calcularDiasAtraso() {
        return LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
    }

    public double calcularMulta() {
        long diasAtraso = calcularDiasAtraso();
        return estrategiaMulta.calcularMulta(diasAtraso);
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Object getMidia() {
        return midia;
    }
}