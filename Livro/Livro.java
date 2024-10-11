
package livro;


public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano, boolean disponivel) {

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //  public void emprestar() {
    //      this.disponivel = false;
    
    //  }
    //  public void devolver() {
    //     this.disponivel = true;
    // }
    public void disponivel() {
        if (this.disponivel== true) {
            System.out.println("O livro esta disponivel.");
            
        }else   
            System.out.println("O livro nao esta disponivel.");

    }

}
