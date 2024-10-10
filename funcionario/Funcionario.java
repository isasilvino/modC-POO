/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {

        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void aumentarSalario() {
        Scanner teclado = new Scanner(System.in);
        
        double porc; 
        double calc;
        double aumento;
        double soma;
        
        System.out.println("Qual o porcentual de aumento para o funcionario?");
        porc = teclado.nextDouble();
        
        
        calc = porc / 100;
        aumento = salario * calc;
        soma = salario + aumento;
        
        System.out.println("Novo salario: "+ soma);

    }
}
