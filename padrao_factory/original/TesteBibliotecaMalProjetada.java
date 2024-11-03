package padrao_factory.original;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Criação de mídia diretamente dentro da biblioteca
        biblioteca.adicionarMidia("Livro", "O Senhor dos Anéis","J.R.R. Tolkien");
        biblioteca.adicionarMidia("Revista", "National Geographic","202");
    
        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}

/*
 *  Situação Problema - Código Mal Projetado (Sem o Padrão Fábrica)
 *  No exemplo da Biblioteca, imagine que temos diferentes tipos de mídias, como livros e
 *  revistas, e a criação dessas mídias está diretamente embutida na lógica da Biblioteca.
 *  O código está repetido, e a Biblioteca precisa criar manualmente cada tipo de mídia
 *  usando if-else ou switch. Isso viola o princípio de Alta Coesão e Baixo
 *  Acoplamento, pois a Biblioteca está sobrecarregada com a lógica de criação de
 *  objetos, tornando difícil a adição de novos tipos de mídias.
 *  
 *  Problemas no Código Mal Projetado
 *  1. Forte Acoplamento: A Biblioteca está diretamente acoplada às classes Livro
 *  e Revista, o que torna difícil adicionar novos tipos de mídias no futuro (por
 *  exemplo, DVDs ou Audiobooks).
 *  2. Baixa Coesão: A Biblioteca está sobrecarregada com a lógica de criação de
 *  mídias, o que deveria ser responsabilidade de uma fábrica dedicada a criar esses
 *  objetos.
 *  3. Dificuldade de Extensão: Adicionar um novo tipo de mídia exigiria modificar o
 *  método adicionarMidia, violando o princípio Aberto-Fechado (OCP) — o
 *  sistema deve estar aberto para extensão, mas fechado para modificação.
 * 
 *  Solução
 *  Como o padrão Fábrica pode ajudar a resolver esta situação?
 */