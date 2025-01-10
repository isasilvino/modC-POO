/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.escolaDTO;
import DTO.praiaDTO;
import DTO.videoGameDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class PalavraDAO {
       private Connection conn;
       ConexaoDAO conex = new ConexaoDAO();

    public PalavraDAO(Connection conn) {
        this.conn = conn;
    }
    //busca as palavras de cada nivel

    public List<String> buscarPalavrasPoNivel(String nivel) throws SQLException {
        List<String> palavras = new ArrayList<>();
        conn = conex.conectaBD();
        String query = "";

        switch (nivel.toLowerCase()) {
            case "video game":
                query = "SELECT palavra FROM videoGame";
                break;

            case "praia":
                query = "SELECT palavra FROM praia";
                break;

            case "escola":
                query = "SELECT palavra FROM escola";
                break;

            default:
                throw new SQLException("Nivel invalido");
        }
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                palavras.add(rs.getString("palavra"));
            }
        }
        return palavras;
    }
    
    //inserir palavra especifica

    public void inserirPalavra(String nivel, String palavra) throws SQLException {
        String query = "";

        switch (nivel.toLowerCase()) {
            case "video game":
                query = "INSERT INTO videoGame (palavra) VALUES (?)";
                break;
            case "praia":
                query = "INSERT INTO praia (palavra) VALUES (?)";
                break;
            case "escola":
                query = "INSERT INTO escola (palavra) VALUES (?)";
                break;
            default:
                throw new SQLException("Nível inválido");
        }

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, palavra);
            stmt.executeUpdate();
        }
    }
    
    
    
}
