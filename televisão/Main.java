/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisão;

/**
 *
 * @author Isa
 */
public class Main {

    public static void main(String[] args) {

        Televisão tv = new Televisão(15, 7);

        System.out.println("Volume inicial: " + tv.getVolume());
        System.out.println("Canal inicial: " + tv.getCanal());
        
        
        tv.aumentarVolume();
        
        
        tv.diminuirVolume();
        
        
        tv.mudarCanal(0);
        
        

    }
}
