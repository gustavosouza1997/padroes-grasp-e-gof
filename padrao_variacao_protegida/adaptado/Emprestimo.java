package padrao_variacao_protegida.adaptado;

import java.time.LocalDate; 

// Classe que representa um empréstimo de livro 
public class Emprestimo { 
    private Livro livro; 
    private String nomeDoUsuario; 
    private LocalDate dataDeDevolucao; 
    private boolean devolvido; 
    private AdaptadorMulta adaptadorMulta;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate  dataDeDevolucao, AdaptadorMulta adaptadorMulta) { 
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario; 
        this.dataDeDevolucao = dataDeDevolucao; 
        this.devolvido = false; 
        this.adaptadorMulta = adaptadorMulta;
    } 

    public boolean isDevolvido() { 
        return devolvido; 
    } 

    public void setDevolvido(boolean devolvido) { 
        this.devolvido = devolvido; 
    } 

    public LocalDate getDataDeDevolucao() { 
        return dataDeDevolucao; 
    } 

    public String getNomeDoUsuario() { 
        return nomeDoUsuario; 
    } 

    public Livro getLivro() { 
        return livro; 
    } 

    // Modificado o método de calcular multas para uma interface
    // Assim, toda chamada do tipo calcularMulta é feita através do adaptador
    public double calcularMulta() { 
        return adaptadorMulta.calcularMulta(dataDeDevolucao);
    } 

    @Override 
    public String toString() { 
        return "Livro: " + livro.getTitulo() + ", Usuário: " +  nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;  
    } 
} 