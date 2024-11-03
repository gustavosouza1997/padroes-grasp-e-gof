package padrao_objeto_unitario.original;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<String> livros;

    // Referência à configuração compartilhada
    private ConfiguracaoBiblioteca configuracaoBiblioteca;
    
    public Biblioteca() {
        this.livros = new ArrayList<>();

        // Acessa a única instância de ConfiguracaoBiblioteca
        this.configuracaoBiblioteca = ConfiguracaoBiblioteca.getInstancia("08:00 - 18:00", 2.0);
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    // Exibe as configurações da biblioteca
    public void exibirConfiguracoes() {
        System.out.println(configuracaoBiblioteca.toString());
    }
}