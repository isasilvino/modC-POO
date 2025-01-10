package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Aluno
 */
public class ConexaoDAO {

    private static Connection connection = null;

    private String nome = "root";
    private String senha = "root";
    Connection conn = null;

    private final String URL = "jdbc:mysql://localhost:3306/jogo?user=" + nome + "&password=" + senha;

    /* jdbc = JAVA DATA BASE CONNECTION
    é a biblioteca que faz a conexao do java com mysql
     */
    public Connection conectaBD() {

        try {

            conn = DriverManager.getConnection(URL);
            return conn;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CONEXAO " + erro.getMessage());

        }

        return null;
    }
}
