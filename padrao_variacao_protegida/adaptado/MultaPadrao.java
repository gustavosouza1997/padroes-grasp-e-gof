package padrao_variacao_protegida.adaptado;

import java.time.LocalDate;

// Classe que representa um método de cálculo de multa padrão
public class MultaPadrao implements AdaptadorMulta {
    @Override
    public double calcularMulta(LocalDate dataDevolucao) {
       long diasAtraso = LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay(); 
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0; 
    }
}
