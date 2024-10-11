
package carro;


public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Fiat", "Uno", 2002, true);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        
        
        meuCarro.andar();

    }
}
