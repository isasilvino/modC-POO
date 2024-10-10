/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Produto {

   private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void comprar() {
        Scanner teclado = new Scanner(System.in);
        int quantidade;

        System.out.println("Quantidade desejada: ");
        int quant = teclado.nextInt();
        
        quantidade =  estoque - quant;
        System.out.println("Nova quantidade em estoque: " + quantidade);

    }

}
