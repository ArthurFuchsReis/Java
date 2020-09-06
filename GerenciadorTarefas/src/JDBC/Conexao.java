
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Arthur Reis
 */
public class Conexao {
     public static final String NOME_DB = "GerenciadorTarefas.db";
    public static final String STRING_CONEXAO = "jdbc:sqlite:C:/Users/Arthur Reis/Desktop/Repositorio 2/Java/GerenciadorTarefas/src/" + NOME_DB;
    


    public Connection getConnection() {

        try{
            
            
            return DriverManager.getConnection(STRING_CONEXAO);
            

        }catch (SQLException e) {
            System.out.println(" Não foi possível conectar com a banco de dados");
            throw new RuntimeException(e);
        }

    } 

       
public static void main(String[] args) {


        try{


                  DriverManager.getConnection(STRING_CONEXAO);


              }catch (SQLException e) {
                  System.out.println(" Não foi possível conectar com a banco de dados");
                  throw new RuntimeException(e);
              }

        }
}
