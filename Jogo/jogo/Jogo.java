/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo;

import DAO.ConexaoDAO;
import DAO.PalavraDAO;
//import DTO.escolaDTO;
//import DTO.praiaDTO;
//import DTO.videoGameDTO;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Jogo {

    private Scanner scanner;
    

    public Jogo() {
        this.scanner = new Scanner(System.in);
        
    }

    // metodo pra iniciar o jogo
    public void iniciar() {
        try (Connection connection = new ConexaoDAO().conectaBD()) {
            PalavraDAO palavraDAO = new PalavraDAO(connection);

            String[] niveis = {"video game", "praia", "escola"};

            for (String nivel : niveis) {
                System.out.println("Nivel: " + nivel.toUpperCase() + "");
                jogarNivel(nivel, palavraDAO);
            }

            System.out.println("Parabens! Voce completou todos os niveis.");
            
        } catch (Exception e) {
            System.out.println("Erro ao iniciar o jogo: " + e.getMessage());
        }

    }

    // metodo pra jogar o nivel
    private void jogarNivel(String nivel, PalavraDAO palavraDAO) throws Exception {
        // busca palavra do nivel atual
        List<String> palavras = palavraDAO.buscarPalavrasPoNivel(nivel);

        for (String palavra : palavras) {
            jogarPalavra(palavra);
        }

        System.out.println("Voce completou o nivel: " + nivel.toUpperCase());
        
        System.out.println("===========================================");
    }

    // metodo pra digitar a palavra
 private void jogarPalavra(String palavra) {
    StringBuilder palavraOculta = new StringBuilder(palavra.charAt(0) + "_".repeat(palavra.length() - 1));
    int erros = 0;
    

    while (!palavraOculta.toString().equals(palavra)) {
        System.out.println("Palavra: " + palavraOculta);
        System.out.print("Digite sua tentativa de palavra: ");
        String tentativa = scanner.nextLine().toLowerCase();

        if (tentativa.equals(palavra)) {
            System.out.println("Acertou!");
            
            
            break;
        } else {
            erros++;
            System.out.println("Errado! Tente novamente.");

            // revela uma letra a cada 2 erros
            if (erros % 2 == 0) {
                revelarLetra(palavra, palavraOculta);
            }
        }

       
    }
}

// metodo que revela a letra da palavra invisivel 
private void revelarLetra(String palavra, StringBuilder palavraOculta) {
    for (int i = 0; i < palavra.length(); i++) {
        if (palavraOculta.charAt(i) == '_') {
            palavraOculta.setCharAt(i, palavra.charAt(i));
            break; 
        }
    }
}
   
}
