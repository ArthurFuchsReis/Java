package DAO;
       
import Model.Usuarios;
import JDBC.Conexao;
import java.util.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuariosDAO {

    private Connection conn;

    public UsuariosDAO() {
        this.conn = new Conexao().getConnection();
    }

    public boolean addUsuarios(Usuarios usuarios) {

        try {
            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }

            String inserirPSQL = "INSERT INTO Usuarios (Usuario, Senha) VALUES (?,?)";
            PreparedStatement statement = conn.prepareStatement(inserirPSQL);
            statement.setString(1, usuarios.getUsuario());
            statement.setString(2, usuarios.getSenha());
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

    public boolean update(Usuarios usuarios) {
        String atualizarPSQL = "UPDATE Usuarios SET Usuario = ?, Senha = ? WHERE CodUsuario =?";
        try {

            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setString(1, usuarios.getUsuario());
            statement.setString(2, usuarios.getSenha());
            statement.setInt(3, usuarios.getCodUsuario());
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

    public boolean delete(Usuarios usuarios) {
        String atualizarPSQL = "DELETE FROM Usuarios WHERE CodUsuario = ?";
        try {
            
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, usuarios.getCodUsuario());
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
    
    public List<Usuarios> getList() {

        List<Usuarios> user = new ArrayList<>();
        String listSQL = "SELECT * FROM Usuarios";
        try {
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(listSQL);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Usuarios usuarios = new Usuarios();
                usuarios.setCodUsuario(rs.getInt("CodUsuario"));
                usuarios.setUsuario(rs.getString("Usuario"));
                usuarios.setSenha(rs.getString("Senha"));
                
                user.add(usuarios);
            }
            statement.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }
    
    public Usuarios getUsuario(String usuario) {

        Usuarios usuarios = null;
        String listSQL = "SELECT * FROM Usuarios WHERE Usuario =?";
        try {
            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(listSQL);
            statement.setString(1, usuario);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarios = new Usuarios();
                usuarios.setCodUsuario(rs.getInt("CodUsuario"));
                usuarios.setUsuario(rs.getString("Usuario"));
                usuarios.setSenha(rs.getString("Senha"));

            }
            statement.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return usuarios;
    }
    
}
