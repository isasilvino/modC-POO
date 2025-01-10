/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Aluno
 */
public class escolaDTO {
    

       private String palavra;
    
    //construtor
    public escolaDTO (String palavra){
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
        return "Nivel: ESCOLA {"+
                 "palavra=  "+ palavra +'\''+
                '}';
    }
}
