/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo (15);
        
        System.out.println("Raio do circulo: "+ circulo.getRaio());
        
        circulo.calcularArea();
        circulo.calcularCircunferencia();
    }
    
}
