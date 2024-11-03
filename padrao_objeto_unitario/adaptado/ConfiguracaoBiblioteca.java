package padrao_objeto_unitario.adaptado;

public class ConfiguracaoBiblioteca {
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

    // Instância única de ConfiguracaoBiblioteca
    private static ConfiguracaoBiblioteca configuracaoBiblioteca;

    // Construtor privado para impedir a criação de instâncias de ConfiguracaoBiblioteca
    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

    // Método para obter a instância única de ConfiguracaoBiblioteca
    public static ConfiguracaoBiblioteca getInstancia(String horariosDeFuncionamento, double valorMultaDiaria) {
        if (configuracaoBiblioteca == null) {
            configuracaoBiblioteca = new ConfiguracaoBiblioteca(horariosDeFuncionamento, valorMultaDiaria);
        }
        return configuracaoBiblioteca;
    }

    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}