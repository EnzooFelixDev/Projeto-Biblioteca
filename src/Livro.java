public class Livro {
    private String titulo;
    private int id;
    Biblioteca biblioteca;
    TipoLivro tipoLivro;

    public Livro(String titulo, int id, Biblioteca biblioteca, TipoLivro tipoLivro) {
        this.titulo = titulo;
        this.id = id;
        this.biblioteca = biblioteca;
        this.tipoLivro = tipoLivro;
    }

    public void imprime() {
        System.out.println("Titulo: " +this.titulo);
        System.out.println("Gênero: " +this.tipoLivro);
        System.out.println("Biblioteca: "+this.biblioteca.getNome());
        System.out.println("Id: " +this.id);
    }

    public Livro(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}
