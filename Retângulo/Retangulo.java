
package retangulo;

import java.util.Scanner;


public class Retangulo {

    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {

        this.altura = altura;
        this.largura = largura;

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void calcularArea() {
        int area;

        area = largura * altura;
        System.out.println("Area do retangulo: " + area);

    }

    public void calcularPerimetro() {
        int perimetro;
        
        perimetro = altura * 4;
        
        System.out.println("Perimetro do retangulo: "+ perimetro);

        
        
    }

}
