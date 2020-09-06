
package Model;


import java.util.*;

public class Gerenciadores {
    
    private int codGerenciador;
    private int prioridade;
    private String terminado;
    private String tarefa;
    
    private int codUsuario;
    private String dataInicio;
    private String horaInicio;
    private String dataPrevistoFinal;
    private String horaPrevistoFinal;
    private String dataChegada;
    private String horaChegada;
    private String dataFinal;
    private String horaFinal;
    private String statusInicial;
    private String statusFinal;

    public Gerenciadores(int codGerenciador, int prioridade, String terminado, String tarefa, int codUsuario, String dataInicio, String horaInicio, String dataPrevistoFinal, String horaPrevistoFinal, String dataChegada, String horaChegada, String dataFinal, String horaFinal, String statusInicial, String statusFinal) {
        this.codGerenciador = codGerenciador;
        this.prioridade = prioridade;
        this.terminado = terminado;
        this.tarefa = tarefa;
        this.codUsuario = codUsuario;
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
        this.dataPrevistoFinal = dataPrevistoFinal;
        this.horaPrevistoFinal = horaPrevistoFinal;
        this.dataChegada = dataChegada;
        this.horaChegada = horaChegada;
        this.dataFinal = dataFinal;
        this.horaFinal = horaFinal;
        this.statusInicial = statusInicial;
        this.statusFinal = statusFinal;
    }

    public Gerenciadores() {
    }
    
    

    public int getCodGerenciador() {
        return codGerenciador;
    }

    public void setCodGerenciador(int codGerenciador) {
        this.codGerenciador = codGerenciador;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getTerminado() {
        return terminado;
    }

    public void setTerminado(String terminado) {
        this.terminado = terminado;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getDataPrevistoFinal() {
        return dataPrevistoFinal;
    }

    public void setDataPrevistoFinal(String dataPrevistoFinal) {
        this.dataPrevistoFinal = dataPrevistoFinal;
    }

    public String getHoraPrevistoFinal() {
        return horaPrevistoFinal;
    }

    public void setHoraPrevistoFinal(String horaPrevistoFinal) {
        this.horaPrevistoFinal = horaPrevistoFinal;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getStatusInicial() {
        return statusInicial;
    }

    public void setStatusInicial(String statusInicial) {
        this.statusInicial = statusInicial;
    }

    public String getStatusFinal() {
        return statusFinal;
    }

    public void setStatusFinal(String statusFinal) {
        this.statusFinal = statusFinal;
    }

    
    
  
   

 

   
}  
    
    

