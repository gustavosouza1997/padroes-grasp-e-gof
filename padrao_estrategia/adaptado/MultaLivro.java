package padrao_estrategia.adaptado;

// Estratégia de multa para livros
public class MultaLivro implements EstrategiaMulta {
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}