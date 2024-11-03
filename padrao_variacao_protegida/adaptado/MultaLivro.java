package padrao_variacao_protegida.adaptado;

import java.time.LocalDate;

// Classe que representa um método alternativo de cálculo de multa
// Cobrando 3 reais por dia
public class MultaLivro implements AdaptadorMulta {
    @Override
    public double calcularMulta(LocalDate dataDevolucao) {
       long diasAtraso = LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay(); 
        return diasAtraso > 0 ? diasAtraso * 3.0 : 0.0; 
    }
}
