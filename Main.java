import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 223);
        Livro livro2 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 576);
        Livro livro4 = new Livro("Gabriel no País das Maravilhas", "Guilherme F.O. Dias", 347);
        LivroDidatico livro3 = new LivroDidatico("Introdução à Programação em Java", "John Doe", 360, "Programação");
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        
        ArrayList<Livro> listaLivros = biblioteca.getLivros();
        
        for (Livro livro : listaLivros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Número de páginas: " + livro.getNumPaginas());
            
            if (livro instanceof LivroDidatico) {
                LivroDidatico livroDidatico = (LivroDidatico) livro;
                System.out.println("Disciplina: " + livroDidatico.getDisciplina());
            }
            
            System.out.println();
        }
    }

}
