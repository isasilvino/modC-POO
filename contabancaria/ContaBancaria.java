/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;



/**
 *
 * @author Aluno
 */
public class ContaBancaria {

    private int numConta;
    private double saldo;
    private String titular;
    
    public ContaBancaria (int numConta, double saldoInicial, String titular){
    
        this.numConta = numConta;
        this.saldo = saldoInicial;
        this.titular = titular;
        
    
}

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
}
    
   
        
    
    

