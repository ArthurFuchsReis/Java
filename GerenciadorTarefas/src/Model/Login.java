
package Model;

import java.util.*;
import JDBC.Conexao;
import java.sql.*;


public class Login {

    private int codUsuario;
    private String usuario;
    private String senha;
    Gerenciadores gerenciadores;
    
     public Login() {
    }

    public Login(int codUsuario, String usuario, String senha) {
        this.codUsuario = codUsuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    

    private static final String SELECT_QUERY = "SELECT * FROM Usuarios WHERE Usuario = ? and Senha = ?";

    public boolean validate(String usuario, String senha) {

        try (Connection conn = DriverManager.getConnection(Conexao.STRING_CONEXAO);


            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, senha);

            System.out.println(preparedStatement);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
          
            printSQLException(e);
        }
        return false;
    }
    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Gerenciadores getGerenciadores() {
        return gerenciadores;
    }

    public void setGerenciadores(Gerenciadores gerenciadores) {
        this.gerenciadores = gerenciadores;
    }
    
    
   
}
