package padrao_observador.adaptado;

import java.time.LocalDate;

// Classe que representa um empréstimo 
public class Emprestimo { 
    private Livro livro; 
    private Usuario usuario; 
    private LocalDate dataDeDevolucao; 
    private boolean devolvido; 

    public Emprestimo(Livro livro, Usuario usuario, LocalDate  dataDeDevolucao) { 
        this.livro = livro; 
        this.usuario = usuario; 
        this.dataDeDevolucao = dataDeDevolucao; 
        this.devolvido = false; 
    } 

    public Livro getLivro() { 
        return livro; 
    }

    public Usuario getUsuario() { 
        return usuario; 
    } 

    public LocalDate getDataDeDevolucao() { 
        return dataDeDevolucao; 
    } 

    public boolean isDevolvido() { 
        return devolvido; 
    } 

    public void setDevolvido(boolean devolvido) {  
        this.devolvido = devolvido; 
    } 
    
    // Invertido a fórmula para calcular os dias restantes para devolução
    public long diasParaDevolucao() { 
        return dataDeDevolucao.toEpochDay() - LocalDate.now().toEpochDay(); 
    } 
}