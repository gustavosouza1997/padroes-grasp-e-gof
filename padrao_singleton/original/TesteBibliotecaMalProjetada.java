package padrao_singleton.original;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Duas bibliotecas com diferentes configurações
        Biblioteca biblioteca1 = new Biblioteca("08:00 - 18:00", 2.0);
        Biblioteca biblioteca2 = new Biblioteca("09:00 - 17:00", 1.5);

        biblioteca1.adicionarLivro("O Senhor dos Anéis");
        biblioteca2.adicionarLivro("1984");
        
        System.out.println("\nConfigurações da Biblioteca 1:");
        biblioteca1.exibirConfiguracoes();

        System.out.println("\nConfigurações da Biblioteca 2:");
        biblioteca2.exibirConfiguracoes();
    }
}

/*
 *  Situação Problema - Código Mal Projetado (Sem o Padrão Objeto Unitário) 
 *  No contexto da Biblioteca, imagine que temos um sistema para controlar as
 *  configurações globais da biblioteca, como horários de funcionamento, regras de multas
 *  e políticas de empréstimos. Cada instância da classe Biblioteca cria uma instância de
 *  ConfiguracaoBiblioteca para gerenciar essas configurações. Isso leva a uma
 *  duplicação de configurações, já que todas as instâncias da biblioteca deveriam
 *  compartilhar as mesmas regras e configurações. O código permite a criação de várias
 *  instâncias de ConfiguracaoBiblioteca, o que pode resultar em inconsistências.
 * 
 *  Problemas no Código Mal Projetado
 *  1. Múltiplas instâncias de configurações: O código permite a criação de várias
 *  instâncias de ConfiguracaoBiblioteca, o que pode causar inconsistências,
 *  pois todas as bibliotecas deveriam seguir as mesmas regras e políticas globais
 *  (por exemplo, um único valor de multa diária e horários unificados).
 *  2. Duplicação de configurações: Como cada instância de Biblioteca cria sua
 *  própria instância de ConfiguracaoBiblioteca, há duplicação de código e
 *  dados que deveriam ser centralizados.
 *  3. Manutenção difícil: Se houver necessidade de modificar as configurações
 *  globais, será necessário garantir que todas as instâncias de
 *  ConfiguracaoBiblioteca sejam atualizadas, o que aumenta a complexidade.
 *  Solução
 *  Como o padrão Objeto Unitário pode ajudar a resolver esta situação?
 */