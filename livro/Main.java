/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
