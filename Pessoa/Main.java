/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Aluno
 */
public class Main  {
    
    public static void main(String[] args) {
        Pessoa cliente = new Pessoa("Isabel", 19, 1.60f);
        
        System.out.println("Nome: "+ cliente.getNome());
        System.out.println("Idade: "+ cliente.getIdade());
        System.out.println("Altura: "+ cliente.getAltura());
        
        
    }
    }
    

