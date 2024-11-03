package padrao_composite.original;

public class TesteBibliotecaMalProjetada { 
    public static void main(String[] args) { 
        Biblioteca biblioteca = new Biblioteca(); 
        
        // Adicionando mídias individuais 
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R.  Tolkien"); 

        Revista revista1 = new Revista("National Geographic", 202);  biblioteca.adicionarLivro(livro1); 
    
        biblioteca.adicionarRevista(revista1); 
        
        // Criando uma coleção de mídias    
        ColecaoDeMidias colecao = new ColecaoDeMidias("Coleção  Fantasia"); 

        colecao.adicionarLivro(new Livro("Harry Potter", "J.K.  Rowling")); 
        colecao.adicionarRevista(new Revista("Comic Book", 1));  biblioteca.adicionarColecao(colecao); 
    
        // Exibindo a biblioteca 
        System.out.println("\nBiblioteca:"); 
        
        biblioteca.exibirBiblioteca(); 
    } 
} 
   

/*
 *  Situação Problema - Código Mal Projetado (Sem o Padrão Composto)
 *  No exemplo da Biblioteca, imagine que estamos gerenciando não apenas livros e  revistas, 
 *  mas também coleções de livros e revistas. Cada coleção contém vários itens, e  a Biblioteca
 *  precisa gerenciar tanto as mídias individuais quanto as coleções. Sem o  uso do padrão Composto,
 *  a Biblioteca precisará ter código duplicado para lidar com  mídias individuais e coleções de mídias,
 *  resultando em baixo acoplamento e baixa  coesão. 
 * 
 *  Problemas no Código Mal Projetado
 *  1. Duplicação de Código: A Biblioteca tem lógica duplicada para lidar com  mídias individuais 
 *  (Livro e Revista) e coleções de mídias (ColecaoDeMidias).  O código para exibir mídias individuais 
 *  e coleções é similar, resultando em  baixa coesão.
 * 
 *  2. Dificuldade de Extensão: Se novos tipos de mídias ou coleções forem  adicionados, o código da 
 *  Biblioteca precisará ser modificado, violando o  princípio Aberto-Fechado (OCP) — o código deveria
 *  ser aberto para extensão,  mas fechado para modificação.
 * 
 *  3. Baixa Flexibilidade: O sistema não trata as coleções e mídias individuais de  maneira uniforme. 
 *  Isso torna o código menos flexível e mais difícil de manter. 
 * 
 *  Solução
 *  Como o padrão Composto pode ajudar a resolver esta situação?
 */