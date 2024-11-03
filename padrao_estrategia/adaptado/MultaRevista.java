package padrao_estrategia.adaptado;

// Estratégia de multa para revistas
public class MultaRevista implements EstrategiaMulta {
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0;
    }   
}