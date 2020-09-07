
package Model;

import Model.Reservas;


public class Carros {
    
    private int codCarro;
    private String nome;
    private String alugado;
    private String marca;
    private int ano;
    private String placa;
    private String categoria;
    private double preco;
    private Reservas reservaCarro;

    public Carros(int codCarro, String nome, String alugado, String marca, int ano, String placa, String categoria, double preco) {
        this.codCarro = codCarro;
        this.nome = nome;
        this.alugado = alugado;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Carros() {
    }
    
     public int getCodCarro() {
        return codCarro;
    }

    public void setCodCarro(int codCarro) {
        this.codCarro = codCarro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlugado() {
        return alugado;
    }

    public void setAlugado(String alugado) {
        this.alugado = alugado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Reservas getReservaCarro() {
        return reservaCarro;
    }

    public void setReservaCarro(Reservas reservaCarro) {
        this.reservaCarro = reservaCarro;
    }

    

}