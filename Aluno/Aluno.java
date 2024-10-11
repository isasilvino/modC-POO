
package aluno;

import java.util.ArrayList;
import java.util.Scanner;


public class Aluno {

    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula) {

        this.nome = nome;
        this.matricula = matricula;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularMedia() {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double media;
        double nota;
        double soma = 0;

        System.out.println("Digite suas 3 notas");
        for (int i = 0; i < 3; i++) {
            nota = teclado.nextDouble();

            notas.add(nota);

        }
        System.out.println("");
        int x = 0;
        for (double a : notas) {
            x++;
            soma += a;

            System.out.println("Sua " + x + " nota e: " + a);

        }

        System.out.println("");
        System.out.println("Total: " + soma);
        media = soma / 3;
        System.out.println("");
        System.out.println("A sua media e: " + media);

    }

}
