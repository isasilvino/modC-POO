/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

/**
 *
 * @author Aluno
 */
public class Circulo {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;

    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        double area;
        double PI = 3.1416;

        area = (raio * raio);

        System.out.println("Area: " + area);

    }

    public void calcularCircunferencia() {
        double c;
        double PI = 3.1416;

        c = (PI * 2) * raio;

        System.out.println("Circunferencia: " + c);

    }

}
