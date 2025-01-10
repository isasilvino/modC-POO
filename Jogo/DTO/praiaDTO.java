/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Aluno
 */
public class praiaDTO {
    
          private String palavra;
      
      //construtor
    public praiaDTO (String palavra){
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
     @Override
    public String toString(){
        return "Nivel: PRAIA {"+
                 "palavra=  "+ palavra +'\''+
                '}';
    }
}
