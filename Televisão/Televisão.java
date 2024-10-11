
package televisão;

import java.util.Scanner;


public class Televisão {

    private int volume;
    private int canal;

    public Televisão(int volume, int canal) {

        this.volume = volume;
        this.canal = canal;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;

        } else {
            System.out.println("O volume deve estar entre 0 e 100.");
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0) {

            this.canal = canal;

        } else {
            System.out.println("O canal deve ser um número positivo.");
        }
    }

    public void aumentarVolume() {
        Scanner teclado = new Scanner(System.in);

        String resposta;

        System.out.println("Deseja aumentar volume?");
        resposta = teclado.nextLine();

        if (resposta.equals("sim")) {
            volume++;
            System.out.println("Novo volume: " + volume);

        } else if (resposta.equals("não")) {
            System.out.println("O volume e: " + volume);
        }

    }

    public void diminuirVolume() {
        Scanner teclado = new Scanner(System.in);
        String resposta;

        System.out.println("Deseja diminur volume?");
        resposta = teclado.nextLine();

        if (resposta.equals("sim")) {
            volume--;
            System.out.println("Novo volume: " + volume);

        } else if (resposta.equals("não")) {
            System.out.println("O volume e: " + volume);
        }
    }

    public void mudarCanal(int novoCanal) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String resposta;
        int num;

        System.out.println("Deseja mudar o canal?");
        resposta = teclado.nextLine();

        if (resposta.equals("sim")) {

            System.out.println("O canal e: " + canal);
            System.out.println("Qual voce deseja assistir?");
            num = teclado2.nextInt();

            
            canal = num;

            System.out.println("O canal agora e: " + canal);

        } else if (resposta.equals("não")) {
            System.out.println("O canal e: " + canal);
        }
    }
}
