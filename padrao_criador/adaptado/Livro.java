package padrao_criador.adaptado;

// Classe que representa um livro 
public class Livro { 
    private String titulo; 
    // Atributo para indicar se o livro está emprestado ou não
    private boolean emprestado;

    public Livro(String titulo) { 
        this.titulo = titulo; 
        this.emprestado = false;
    } 
    
    public String getTitulo() { 
        return titulo; 
    } 

    // Método que retorna se um livro está emprestado ou não
    public boolean isEmprestado() { 
        return emprestado; 
    }

    // Método que cria uma instância de empréstimo para o livro
    public Emprestimo registrarEmprestimo(String nomeDoUsuario) { 
        if (emprestado) { 
            System.out.println("Livro " + titulo + " já emprestado!");
            return null; 
        }

        emprestado = true;
        return new Emprestimo(this, nomeDoUsuario);
    }

    // Método que cria uma instância de devolução para o livro
    public void devolver() { 
        if (!emprestado) { 
            System.out.println("Livro " + titulo + " não está emprestado!");
        }

        emprestado = false;
    }
} 