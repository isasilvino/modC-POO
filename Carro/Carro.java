
package carro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, boolean ligado) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado; //se for iniciado como false - utilizar metodos ligar() e desligar().

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    //public void ligar(){
    //  this.ligado = true;
    //System.out.println("O carro esta ligando vrum vrum!");

    //}
    //public void desligar(){
    //  this.ligado = false;
    //System.out.println("O carro esta desligado.");
    //}
    public void andar() {

        if (this.ligado == true) {
            System.out.println("O carro esta andando.");

        } else {
            System.out.println("O carro precisa ser ligado.");
        }
    }
}
