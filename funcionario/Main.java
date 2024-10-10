/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Funcionario func = new Funcionario ("Jorge", 1700.00, "RH");
        
        System.out.println("Nome do funcionario: "+ func.getNome());
        System.out.println("Salario: "+ func.getSalario());
        System.out.println("Departamento: "+func.getDepartamento());
        
        func.aumentarSalario();
    }
    
}
