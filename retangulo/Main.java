/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo (10, 15);
        
        System.out.println("Altura: "+ retangulo.getAltura());
        System.out.println("Largura: "+ retangulo.getLargura());
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
    }
    
}
