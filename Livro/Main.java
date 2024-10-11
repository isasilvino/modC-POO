
package livro;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro("O diario de um banana", "Banana", 2021, false);

        System.out.println("Marca: " + livro.getTitulo());
        System.out.println("Modelo: " + livro.getAutor());
        System.out.println("Ano: "+livro.getAno());
        
        livro.disponivel();
        

    }
}
