package DAO;
//
import Model.Gerenciadores;
import JDBC.Conexao;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Usuarios;

//
public class GerenciadoresDAO {
        private Connection conn;

    public GerenciadoresDAO() {
        this.conn = new Conexao().getConnection();
    }

    public boolean addGerenciadores(Gerenciadores gerenciadores) {

        try {
            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }

            String inserirPSQL = "INSERT INTO Gerenciadores (Prioridades, Terminado, Tarefas, CodUsuario, DataInicio, HoraInicio, DataPrevistoFinal, HoraPrevistoFinal) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(inserirPSQL);
            statement.setInt(1, gerenciadores.getPrioridade());
            statement.setString(2, gerenciadores.getTerminado());
            statement.setString(3, gerenciadores.getTarefa());
            statement.setInt(4, gerenciadores.getCodUsuario());
            statement.setString(5, gerenciadores.getDataInicio());
            statement.setString(6, gerenciadores.getHoraInicio());
            statement.setString(7, gerenciadores.getDataPrevistoFinal());
            statement.setString(8, gerenciadores.getHoraPrevistoFinal());
            statement.executeUpdate();
            statement.close();
            conn.close();
            return true;

        } catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }
    }

    public boolean update(Gerenciadores gerenciadores) {
        String atualizarPSQL = "UPDATE Gerenciadores SET Prioridades =?, Terminado =?, Tarefas =?, DataInicio =?, HoraInicio =?, DataPrevistoFinal =?, HoraPrevistoFinal =? WHERE CodTarefa =?";
        try {

            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, gerenciadores.getPrioridade());
            statement.setString(2, gerenciadores.getTerminado());
            statement.setString(3, gerenciadores.getTarefa());
            statement.setString(4, gerenciadores.getDataInicio());
            statement.setString(5, gerenciadores.getHoraInicio());
            statement.setString(6, gerenciadores.getDataPrevistoFinal());
            statement.setString(7, gerenciadores.getHoraPrevistoFinal());
            statement.setInt(8, gerenciadores.getCodGerenciador());
            
            statement.execute();
            statement.close();
            conn.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }
    }

    public boolean delete(Gerenciadores gerenciadores) {
        String atualizarPSQL = "DELETE FROM Gerenciadores WHERE CodTarefa = ?";
        try {
            
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, gerenciadores.getCodGerenciador());
            statement.execute();
            statement.close();
            conn.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }

    }
    
    public List<Gerenciadores> getList(int codUsuario) {

        List<Gerenciadores> ger = new ArrayList<>();
        String listSQL = "SELECT * FROM Gerenciadores WHERE CodUsuario =? ORDER BY Prioridades";
        try {
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(listSQL);
            statement.setInt(1, codUsuario);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Gerenciadores gerenciadores = new Gerenciadores();
                gerenciadores.setCodGerenciador(rs.getInt("CodTarefa"));
                gerenciadores.setPrioridade(rs.getInt("Prioridades"));
                gerenciadores.setTerminado(rs.getString("Terminado"));
                gerenciadores.setTarefa(rs.getString("Tarefas"));
                gerenciadores.setCodUsuario(rs.getInt("CodUsuario"));
                gerenciadores.setDataInicio(rs.getString("DataInicio"));
                gerenciadores.setHoraInicio(rs.getString("HoraInicio"));
                gerenciadores.setDataPrevistoFinal(rs.getString("DataPrevistoFinal"));
                gerenciadores.setHoraPrevistoFinal(rs.getString("HoraPrevistoFinal"));
                gerenciadores.setDataChegada(rs.getString("DataChegada"));
                gerenciadores.setHoraChegada(rs.getString("HoraChegada"));
                gerenciadores.setDataFinal(rs.getString("DataFinal"));
                gerenciadores.setHoraFinal(rs.getString("Horafinal"));
                gerenciadores.setStatusInicial(rs.getString("StatusInicial"));
                gerenciadores.setStatusFinal(rs.getString("StatusFinal"));
                
                
                ger.add(gerenciadores);
            }
            statement.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
       return ger;
    }
    
     public boolean iniciarTarefa(Gerenciadores gerenciadores) {
        String atualizarPSQL = "UPDATE Gerenciadores SET"
                + " DataChegada =?, HoraChegada =?, StatusInicial =?"
                + " WHERE CodTarefa =?";
        try {

            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setString(1, gerenciadores.getDataChegada());
            statement.setString(2, gerenciadores.getHoraChegada());
            statement.setString(3, gerenciadores.getStatusInicial());
            statement.setInt(4, gerenciadores.getCodGerenciador());
         
            statement.execute();
            statement.close();
            conn.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }
     }
        
    public boolean finalizarTarefa(Gerenciadores gerenciadores) {
        String atualizarPSQL =  "UPDATE Gerenciadores SET"
                + " DataFinal =?, HoraFinal =?, StatusFinal =?"
                + " WHERE CodTarefa =?";
        try {

            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setString(1, gerenciadores.getDataFinal());
            statement.setString(2, gerenciadores.getHoraFinal());
            statement.setString(3, gerenciadores.getStatusFinal());
            statement.setInt(4, gerenciadores.getCodGerenciador());
         
            statement.execute();
            statement.close();
            conn.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }
    }  
}
