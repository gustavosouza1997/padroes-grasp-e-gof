package padrao_baixo_acoplamento.adaptado;

import java.util.ArrayList;
import java.util.List;

// Classe que gerencia os livros
public class LivroController {
    private List<Livro> livros;

    public LivroController() {
        this.livros = new ArrayList<>();
    }

    // Método que adiciona um livro à biblioteca
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    // Método que encontra um livro pelo título
    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
