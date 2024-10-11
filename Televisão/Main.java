
package televisão;

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
