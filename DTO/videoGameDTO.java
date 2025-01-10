/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


public class videoGameDTO {
    
        private String palavra;
      
      //construtor
    public videoGameDTO (String palavra){
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
        return "Nivel: VIDEO GAME {"+
                 "palavra=  "+ palavra +'\''+
                '}';
    }


}