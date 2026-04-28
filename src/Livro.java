public class Livro {
    private String titulo;
    private int id;
    Biblioteca biblioteca;
    TipoLivro tipoLivro;
    private static int contadorLivros = 0;

    public Livro(String titulo, int id, Biblioteca biblioteca, TipoLivro tipoLivro) {
        this.titulo = titulo;
        this.id = id;
        this.biblioteca = biblioteca;
        this.tipoLivro = tipoLivro;
        contadorLivros++;
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

    public static int getContadorLivros() {
        return contadorLivros;
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
