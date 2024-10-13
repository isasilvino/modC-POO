/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porta;

/**
 *
 * @author Isa
 */
public class Porta {

    private boolean aberto;
    private String cor;

    public Porta(boolean aberto, String cor) {

        this.aberto = aberto; //se iniciar em false > utilizar métodos abrir() e fechar()
        this.cor = cor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void abrir() {
        if (!this.aberto) {
            System.out.println("A porta " + cor + " sera aberta.");
            this.aberto = true; // Atualiza o estado para aberto
        } else {
            System.out.println("A porta já esta aberta.");
        }
    }

    // Método para fechar a porta
    public void fechar() {
        if (this.aberto) {
            System.out.println("A porta " + cor + " sera fechada.");
            this.aberto = false; // Atualiza o estado para fechado
        } else {
            System.out.println("A porta já esta fechada.");
        }
    }
}
