/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;



public class Main {
    public static void main(String[] args) {
      
        
        
        Produto leite = new Produto ("Leite", 2.99, 5);
        
        System.out.println("Nome: "+leite.getNome());
        System.out.println("Preco: "+leite.getPreco());
        System.out.println("Estoque: "+leite.getEstoque());
        
     leite.comprar();
        
        
                
        
        
        
    }
}
