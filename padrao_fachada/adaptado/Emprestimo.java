package padrao_fachada.adaptado;

import java.time.LocalDate;

public class Emprestimo { 
    private Livro livro; 
    private String usuario; 
    private LocalDate dataDeDevolucao; 
    private boolean devolvido; 
    
    public Emprestimo(Livro livro, String usuario, LocalDate  dataDeDevolucao) { 
        this.livro = livro; 
        this.usuario = usuario; 
        this.dataDeDevolucao = dataDeDevolucao; 
        this.devolvido = false; 
    }
    
    public Livro getLivro() { 
        return livro; 
    } 

    public String getNomeDoUsuario() { 
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

    public long diasParaDevolucao() { 
        return LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay(); 
    } 
}    