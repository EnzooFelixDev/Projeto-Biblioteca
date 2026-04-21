public class Biblioteca {
    private String nome;
    Livro[] livros;

    public Biblioteca(String nome) {
        this.nome = nome;
    }



    public Biblioteca(String nome, Livro[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
