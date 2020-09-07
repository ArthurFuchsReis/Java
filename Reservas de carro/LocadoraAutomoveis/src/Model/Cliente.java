
package Model;

import Model.Reservas;

public class Cliente {
    
    private int CodCliente;
    private int cpf;
    private String dataNascimento;
    private String nome;
    private String cidade;
    private String estado;
    private String email;
    private String telefone;
    private Reservas reservaCliente;

    public Cliente(int CodCliente, int cpf, String dataNascimento, String nome, String cidade, String estado, String email) {
        this.CodCliente = CodCliente;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
    }

    public Cliente() {
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Reservas getReservaCliente() {
        return reservaCliente;
    }

    public void setReservaCliente(Reservas reservaCliente) {
        this.reservaCliente = reservaCliente;
    }

    
   
       
}
