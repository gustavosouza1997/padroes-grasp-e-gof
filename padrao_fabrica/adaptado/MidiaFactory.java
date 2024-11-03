package padrao_fabrica.adaptado;

// Fábrica que cria as mídias
class MidiaFactory {
    public Object criarMidia(String tipo, String titulo, String autorOuEdicao) {
        if (tipo.equals("Livro")) {
            System.out.println("Livro adicionado: " + titulo);
            return new Livro(titulo, autorOuEdicao); // Criação manual de Livro

        } else if (tipo.equals("Revista")) {
            System.out.println("Revista adicionada: " + titulo);
            return new Revista(titulo, Integer.parseInt(autorOuEdicao)); // Criação manual de Revista

        } else {
            System.out.println("Erro: Tipo de mídia não reconhecido.");
            return null;
        }
    }
}