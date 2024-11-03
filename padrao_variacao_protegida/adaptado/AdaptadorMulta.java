package padrao_variacao_protegida.adaptado;

import java.time.LocalDate;

// Interface que obriga a implementação do método calcularMulta
// Qualquer classe que implementar esse método poderá criar sua própria forma de calcular multa
public interface AdaptadorMulta {
    double calcularMulta(LocalDate dataDevolucao);
}
