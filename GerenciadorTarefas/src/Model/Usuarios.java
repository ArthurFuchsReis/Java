
package Model;


public class Usuarios {
    
    private int codUsuario;
    private String usuario;
    private String senha;
    private Gerenciadores gerenciadorTarefas;

    public Usuarios(int codUsuario, String usuario, String senha) {
        this.codUsuario = codUsuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuarios() {
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

    public Gerenciadores getGerenciadorTarefas() {
        return gerenciadorTarefas;
    }

    public void setGerenciadorTarefas(Gerenciadores gerenciadorTarefas) {
        this.gerenciadorTarefas = gerenciadorTarefas;
    }
    
    
   
        
}
