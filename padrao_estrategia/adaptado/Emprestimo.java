package padrao_estrategia.adaptado;

import java.time.LocalDate;

// Classe que representa um empréstimo 
public class Emprestimo {
    private Object midia;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    // Estratégia de cálculo de multa
    private EstrategiaMulta estrategiaMulta;
    private boolean devolvido;

    // Construtor atualizado para receber a estratégia de multa
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

    // Movido o cálculo da multa para a classe Empréstimo
    // Pois o objeto empréstimo tem todas as informações necessárias para calcular a multa
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