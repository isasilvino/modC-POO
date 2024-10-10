/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;


import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        ContaBancaria cliente = new ContaBancaria (201, 1500, "Luiza");
        
        System.out.println("Numero da conta: "+ cliente.getNumConta());
        System.out.println("Saldo: "+ cliente.getSaldo());
        System.out.println("Titular: "+ cliente.getTitular());
        
        
        
        System.out.println("Qual o valor a ser depositado? ");
        double valor = teclado.nextDouble();
        
        cliente.depositar(valor);
        
        System.out.println("Cliente fez deposito de: R$"+ valor);
        
        System.out.println("Novo saldo: "+cliente.getSaldo());
        
    }
}
