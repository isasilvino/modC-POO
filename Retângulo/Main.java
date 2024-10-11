
package retangulo;


public class Main {
    
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo (10, 15);
        
        System.out.println("Altura: "+ retangulo.getAltura());
        System.out.println("Largura: "+ retangulo.getLargura());
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
    }
    
}
