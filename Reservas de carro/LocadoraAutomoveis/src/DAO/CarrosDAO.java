package DAO;

import Model.Carros;
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

public class CarrosDAO {

    private Connection conn;

    public CarrosDAO() {
        this.conn = new Conexao().getConnection();
    }

    public boolean addCarro(Carros carros) {

        try {
            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }

            String inserirPSQL = "INSERT INTO Carro (Nome, Marca, Ano, Placa, Categoria, Alugado, Valor) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(inserirPSQL);
            statement.setString(1, carros.getNome());
            statement.setString(2, carros.getMarca());
            statement.setInt(3, carros.getAno());
            statement.setString(4, carros.getPlaca());
            statement.setString(5, carros.getCategoria());
            statement.setString(6, carros.getAlugado());
            statement.setDouble(7, carros.getPreco());
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

    public boolean update(Carros carro) {
        String atualizarPSQL = "UPDATE Carro SET Nome = ?, Marca = ?,  Ano = ?, Placa = ?, Categoria = ?, Alugado = ?, Valor = ? WHERE CodCarro =?";
        try {

            if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setString(1, carro.getNome());
            statement.setString(2, carro.getMarca());
            statement.setInt(3, carro.getAno());
            statement.setString(4, carro.getPlaca());
            statement.setString(5, carro.getCategoria());
            statement.setString(6, carro.getAlugado());
            statement.setDouble(7, carro.getPreco());
            statement.setInt(8, carro.getCodCarro());
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

    public boolean delete(Carros carro) {
        String atualizarPSQL = "DELETE FROM Carro WHERE CodCarro = ?";
        try {
            
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, carro.getCodCarro());
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
    
//    select * from carro where alugado='Sim' and categoria='B'
//    criar um metodo com uma lista de carros com esse select

    public List<Carros> getList() {

        List<Carros> car = new ArrayList<>();
        String listSQL = "SELECT * FROM Carro";
        try {
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(listSQL);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Carros carro = new Carros();
                carro.setCodCarro(rs.getInt("CodCarro"));
                carro.setNome(rs.getString("Nome"));
                carro.setMarca(rs.getString("Marca"));
                carro.setAno(rs.getInt("Ano"));
                carro.setPlaca(rs.getString("Placa"));
                carro.setCategoria(rs.getString("Categoria"));
                carro.setAlugado(rs.getString("Alugado"));
                carro.setPreco(rs.getDouble("Valor"));
                car.add(carro);
            }
            statement.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return car;
    }
    
     public List<Carros> getCodCarro() {

        List<Carros> car = new ArrayList<>();
        String listSQL = "SELECT CodCarro FROM Carro";
        try {
             if (this.conn.isClosed()) {

                this.conn = new Conexao().getConnection();
            }
            PreparedStatement statement = conn.prepareStatement(listSQL);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Carros carro = new Carros();
                carro.setCodCarro(rs.getInt("CodCarro"));
               
            }
            statement.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return car;
    }

    public static void main(String[] args) {
        CarrosDAO carrosDAO = new CarrosDAO();
        List<Carros> carro = carrosDAO.getList();
        for (Carros carro1 : carro) {
            System.out.println(carro1.getNome());
        }
    }

}
