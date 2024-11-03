package padrao_strategy.original;

import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R.Tolkien");

        Revista revista = new Revista("National Geographic", 202);

        biblioteca.registrarEmprestimo(livro, "João", LocalDate.now().minusDays(5));

        biblioteca.registrarEmprestimo(revista, "Maria", LocalDate.now().minusDays(10));
        
        System.out.println("\nCalculando multas:");
        biblioteca.calcularMultas();
}
}

/*
 *  Situação Problema - Código Mal Projetado (Sem o Padrão Estratégia)
 *  No exemplo da Biblioteca, imagine que a lógica de cálculo de multas varia de acordo
 *  com o tipo de mídia (por exemplo, livros e revistas). Atualmente, a classe Biblioteca
 *  usa uma implementação fixa para calcular multas, com uma estrutura condicional (como
 *  if-else) para tratar as variações. Isso resulta em um código com baixo Baixo
 *  Acoplamento e Alta Coesão, além de ser difícil de manter e estender à medida que
 *  novos tipos de mídia são adicionados, com diferentes regras de cálculo de multa.
 *  
 *  Problemas no Código Mal Projetado
 *  1. Baixa Coesão: A Biblioteca está sobrecarregada com a lógica de cálculo de
 *  multas, que deve variar de acordo com o tipo de mídia. Essa lógica não deveria
 *  estar na classe Biblioteca, pois ela tem outras responsabilidades.
 *  2. Dificuldade de Extensão: Se novos tipos de mídias forem adicionados com
 *  diferentes regras de multas (como DVDs ou audiobooks), o método
 *  calcularMultas precisará ser alterado, violando o princípio Aberto-Fechado
 *  (OCP).
 *  3. Uso excessivo de if-else: O uso de condicionais para verificar o tipo de mídia
 *  e calcular as multas torna o código mais difícil de manter e aumenta o
 *  acoplamento entre a Biblioteca e os tipos de mídias.
 *  
 *  Solução
 *  Como o padrão Estratégia pode ajudar a resolver esta situação?
 */