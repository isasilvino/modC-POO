
package data;

import java.text.SimpleDateFormat;


public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String formatarData() {

        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
        

        
    }
    public void data(){
        
        System.out.println(formatarData());
    }

}
