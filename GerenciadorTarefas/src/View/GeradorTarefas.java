
package View;

import java.util.*;
import javax.swing.*;
import org.joda.time.DateTime;

import org.joda.time.Hours;
import org.joda.time.Minutes;
import util.ManipulacaoDatas;

import Model.Gerenciadores;
import javax.swing.table.DefaultTableModel;
import DAO.GerenciadoresDAO;

public class GeradorTarefas extends javax.swing.JFrame {
    List<Gerenciadores> listaGerenciadores;
    String modo;
    private GerenciadoresDAO gerenciadoresDAO;
    private ManipulacaoDatas manipulacaoDatas;
    
    
    public void loadTableGerenciadores(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CodTarefa","Prioridades","Terminado","Tarefas","Usuario","Data Inicio","Hora Inicio","Data Previsto Final","Hora Previsto Final","Data Chegada","Hora Chegada","Data Final","Hora Final","Status Inicial","Status Final"}, 0);
          
        listaGerenciadores = gerenciadoresDAO.getList(Login.usuarios.getCodUsuario());
        
        for (Gerenciadores gerenciadores1 : listaGerenciadores) {

        
                    Object linha[] = new Object[]{gerenciadores1.getCodGerenciador(),gerenciadores1.getPrioridade(),gerenciadores1.getTerminado(),gerenciadores1.getTarefa(),Login.usuarios.getUsuario(),gerenciadores1.getDataInicio(),gerenciadores1.getHoraInicio(),gerenciadores1.getDataPrevistoFinal(),gerenciadores1.getHoraPrevistoFinal(),gerenciadores1.getDataChegada(),gerenciadores1.getHoraChegada(),gerenciadores1.getDataFinal(),gerenciadores1.getHoraFinal(),gerenciadores1.getStatusInicial(),gerenciadores1.getStatusFinal()};
                    
                    modelo.addRow(linha);
       
               }

            tblGerenciador.setModel(modelo);
            tblGerenciador.getColumnModel().getColumn(0).setPreferredWidth(700);
            tblGerenciador.getColumnModel().getColumn(1).setPreferredWidth(600);
            tblGerenciador.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(4).setPreferredWidth(600);
            tblGerenciador.getColumnModel().getColumn(5).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(6).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(7).setPreferredWidth(900);
            tblGerenciador.getColumnModel().getColumn(8).setPreferredWidth(900);
            tblGerenciador.getColumnModel().getColumn(9).setPreferredWidth(700);
            tblGerenciador.getColumnModel().getColumn(10).setPreferredWidth(700);
            tblGerenciador.getColumnModel().getColumn(11).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(12).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(13).setPreferredWidth(600);
            tblGerenciador.getColumnModel().getColumn(14).setPreferredWidth(600);

        }
    

    public GeradorTarefas() {
        initComponents();
        setLocationRelativeTo(null);
        modo = "Navegar";
        manipulaInterfaceGerenciadores();
        gerenciadoresDAO = new GerenciadoresDAO();
        loadTableGerenciadores();
        manipulacaoDatas = new ManipulacaoDatas();
    }
    public void manipulaInterfaceGerenciadores() {
        switch (modo) {
            case "Navegar":

                btnEnviar.setEnabled(false);
                btnLimpar.setEnabled(false);
                txtCodTarefa.setEnabled(false);
                txtPrioridade.setEnabled(false);
                cmbTerminado.setEnabled(false);
                txtTarefa.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtDataInicio.setEnabled(false);
                txtHoraInicio.setEnabled(false);
                txtDataPrevistoFinal.setEnabled(false);
                txtHoraPrevistoFinal.setEnabled(false);
                txtDataChegada.setEnabled(false);
                txtHoraChegada.setEnabled(false);
                txtDataFinal.setEnabled(false);
                txtHoraFinal.setEnabled(false);
                txtStatusInicial.setEnabled(false);
                txtStatusFinal.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnIniciarTarefa.setEnabled(false);
                btnFinalizarTarefa.setEnabled(false);
               

                break;
            case "Novo":

                btnEnviar.setEnabled(true);
                btnLimpar.setEnabled(true);
                txtCodTarefa.setEnabled(true);
                txtPrioridade.setEnabled(true);
                cmbTerminado.setEnabled(true);
                txtTarefa.setEnabled(true);
                txtUsuario.setEnabled(true);
                txtDataInicio.setEnabled(true);
                txtHoraInicio.setEnabled(true);
                txtDataPrevistoFinal.setEnabled(true);
                txtHoraPrevistoFinal.setEnabled(true);
                txtDataChegada.setEnabled(true);
                txtHoraChegada.setEnabled(true);
                txtDataFinal.setEnabled(true);
                txtHoraFinal.setEnabled(true);
                txtStatusInicial.setEnabled(true);
                txtStatusFinal.setEnabled(true);
                btnNovo.setEnabled(false);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnIniciarTarefa.setEnabled(false);
                btnFinalizarTarefa.setEnabled(false);
               

                break;

            case "Editar":

                btnEnviar.setEnabled(true);
                btnLimpar.setEnabled(true);
                txtCodTarefa.setEnabled(true);
                txtPrioridade.setEnabled(true);
                cmbTerminado.setEnabled(true);
                txtTarefa.setEnabled(true);
                txtUsuario.setEnabled(true);
                txtDataInicio.setEnabled(true);
                txtHoraInicio.setEnabled(true);
                txtDataPrevistoFinal.setEnabled(true);
                txtHoraPrevistoFinal.setEnabled(true);
                txtDataChegada.setEnabled(true);
                txtHoraChegada.setEnabled(true);
                txtDataFinal.setEnabled(true);
                txtHoraFinal.setEnabled(true);
                txtStatusInicial.setEnabled(true);
                txtStatusFinal.setEnabled(true);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnIniciarTarefa.setEnabled(true);
                btnFinalizarTarefa.setEnabled(true);
                

                break;

            case "Excluir":

                btnEnviar.setEnabled(false);
                btnLimpar.setEnabled(false);
                txtCodTarefa.setEnabled(false);
                txtPrioridade.setEnabled(false);
                cmbTerminado.setEnabled(false);
                txtTarefa.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtDataInicio.setEnabled(false);
                txtHoraInicio.setEnabled(false);
                txtDataPrevistoFinal.setEnabled(false);
                txtHoraPrevistoFinal.setEnabled(false);
                txtDataChegada.setEnabled(false);
                txtHoraChegada.setEnabled(false);
                txtDataFinal.setEnabled(false);
                txtHoraFinal.setEnabled(false);
                txtStatusInicial.setEnabled(false);
                txtStatusFinal.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnIniciarTarefa.setEnabled(false);
                btnFinalizarTarefa.setEnabled(false);
            

                break;

            case "Selecao":

                btnEnviar.setEnabled(false);
                btnLimpar.setEnabled(false);
                txtCodTarefa.setEnabled(false);
                txtPrioridade.setEnabled(false);
                cmbTerminado.setEnabled(false);
                txtTarefa.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtDataInicio.setEnabled(false);
                txtHoraInicio.setEnabled(false);
                txtDataPrevistoFinal.setEnabled(false);
                txtHoraPrevistoFinal.setEnabled(false);
                txtDataChegada.setEnabled(false);
                txtHoraChegada.setEnabled(false);
                txtDataFinal.setEnabled(false);
                txtHoraFinal.setEnabled(false);
                txtStatusInicial.setEnabled(false);
                txtStatusFinal.setEnabled(false);
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnIniciarTarefa.setEnabled(true);
                btnFinalizarTarefa.setEnabled(true);
               

                break;

            default:
                System.out.println("Modo Invalido!");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGerenciador = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnIniciarTarefa = new javax.swing.JButton();
        btnFinalizarTarefa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodTarefa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTarefa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrioridade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDataPrevistoFinal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHoraPrevistoFinal = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtHoraChegada = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        cmbTerminado = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtDataChegada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JTextField();
        txtHoraFinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStatusInicial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtStatusFinal = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Tarefas");
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciar Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblGerenciador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Tarefa", "Prioridades", "Terminado", "Tarefas", "Usuario", "Data Inicio", "Hora Inicio", "Data Previsto Final", "Hora Previsto Final", "Data Chegada", "Hora Chegada", "Data Final", "Hora Final", "Status Inicial", "Status Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGerenciador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGerenciadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGerenciador);
        if (tblGerenciador.getColumnModel().getColumnCount() > 0) {
            tblGerenciador.getColumnModel().getColumn(0).setPreferredWidth(700);
            tblGerenciador.getColumnModel().getColumn(1).setPreferredWidth(600);
            tblGerenciador.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(4).setPreferredWidth(600);
            tblGerenciador.getColumnModel().getColumn(5).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(6).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(7).setPreferredWidth(900);
            tblGerenciador.getColumnModel().getColumn(8).setPreferredWidth(900);
            tblGerenciador.getColumnModel().getColumn(9).setPreferredWidth(700);
            tblGerenciador.getColumnModel().getColumn(10).setPreferredWidth(700);
            tblGerenciador.getColumnModel().getColumn(11).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(12).setPreferredWidth(500);
            tblGerenciador.getColumnModel().getColumn(13).setPreferredWidth(600);
            tblGerenciador.getColumnModel().getColumn(14).setPreferredWidth(600);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 1240, 120);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Agenda.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        btnIniciarTarefa.setText("Iniciar Tarefa");
        btnIniciarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTarefaActionPerformed(evt);
            }
        });

        btnFinalizarTarefa.setText("Finalizar Tarefa");
        btnFinalizarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnFinalizarTarefa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarTarefa)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizarTarefa)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1090, 190, 160, 420);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastros Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Código Tarefa:");

        txtCodTarefa.setEditable(false);
        txtCodTarefa.setEnabled(false);

        jLabel2.setText("Tarefa:");

        jLabel3.setText("Prioridades:");

        jLabel4.setText("Usuario:");

        txtUsuario.setEditable(false);
        txtUsuario.setEnabled(false);

        jLabel5.setText("Data Início:");

        jLabel6.setText("Hora Início:");

        jLabel7.setText("Data Previsto Final:");

        jLabel8.setText("Hora Previsto Final:");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel11.setText("Hora Chegada:");

        txtHoraChegada.setEditable(false);

        jLabel12.setText("Hora Final:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        cmbTerminado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terminado?", "Sim", "Não" }));
        cmbTerminado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTerminadoItemStateChanged(evt);
            }
        });

        jLabel13.setText("Data Chegada:");

        txtDataChegada.setEditable(false);
        txtDataChegada.setEnabled(false);

        jLabel14.setText("Data Final:");

        txtDataFinal.setEditable(false);
        txtDataFinal.setEnabled(false);

        txtHoraFinal.setEditable(false);
        txtHoraFinal.setEnabled(false);

        jLabel9.setText("Status Inicial:");

        txtStatusInicial.setEditable(false);
        txtStatusInicial.setEnabled(false);

        jLabel15.setText("Status Final");

        txtStatusFinal.setEditable(false);
        txtStatusFinal.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHoraPrevistoFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCodTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtStatusInicial, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDataFinal, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDataInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                                        .addComponent(txtDataPrevistoFinal, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDataChegada, javax.swing.GroupLayout.Alignment.LEADING)))
                                                .addGap(88, 88, 88)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jLabel11)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                                            .addComponent(txtHoraChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel12)
                                                                .addComponent(jLabel8)
                                                                .addComponent(jLabel6)
                                                                .addComponent(jLabel15))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtHoraFinal)
                                                                .addComponent(txtStatusFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(106, 106, 106)
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnEnviar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLimpar)
                                                .addGap(360, 360, 360))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(76, 76, 76)
                                .addComponent(txtTarefa)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDataPrevistoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtHoraPrevistoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtStatusInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtStatusFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnEnviar))
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 200, 1080, 420);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(10, 150, 73, 23);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(510, 170, 120, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(980, 160, 63, 23);

        setSize(new java.awt.Dimension(1279, 676));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCodTarefa.setText("");
        txtPrioridade.setText("");
        cmbTerminado.setSelectedItem("Terminado?");
        txtTarefa.setText("");
        txtUsuario.setText("");
        txtDataInicio.setText("");
        txtHoraInicio.setText("");
        txtDataPrevistoFinal.setText("");
        txtHoraPrevistoFinal.setText("");
        txtDataChegada.setText("");
        txtHoraChegada.setText("");
        txtDataFinal.setText("");
        txtHoraFinal.setText("");
        txtStatusInicial.setText("");
        txtStatusFinal.setText("");

        modo = "Navegar";
        manipulaInterfaceGerenciadores();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        int codTarefa = 0;
        int prioridade = 0;
        if( txtPrioridade.getText() != null && txtPrioridade.getText().length()>0){
           prioridade = Integer.parseInt(txtPrioridade.getText());
        }
        String terminado = "";
        if(cmbTerminado.getSelectedItem() != null) {
          terminado = cmbTerminado.getSelectedItem().toString();
        }
        int codUsuario = Login.usuarios.getCodUsuario();
        
//        int codUsuario = 0;
        String dataChegada = "";
        String horaChegada = "";
        String dataFinal = "";
        String horaFinal = "";
        String statusInicial = "";
        String statusFinal = "";

       
        Gerenciadores gerenciadores = null;

        if (modo.equals("Novo")) {
      
//            gerenciadores = new Gerenciadores(codTarefa,prioridade,terminado,txtTarefa.getText(),usuario,txtDataInicio.getText(),txtHoraInicio.getText(),txtDataPrevistoFinal.getText(),txtHoraPrevistoFinal.getText(),txtDataChegada.getText(),txtHoraChegada.getText(),txtDataFinal.getText(),txtHoraFinal.getText(),txtStatusInicial.getText(),txtStatusFinal.getText());
            gerenciadores = new Gerenciadores(codTarefa,prioridade,terminado,txtTarefa.getText(),codUsuario,txtDataInicio.getText(),txtHoraInicio.getText(),txtDataPrevistoFinal.getText(),txtHoraPrevistoFinal.getText(),dataChegada,horaChegada,dataFinal,horaFinal,statusInicial,statusFinal);
            gerenciadoresDAO.addGerenciadores(gerenciadores);
            
        } else if (modo.equals("Editar")) {
            codTarefa = Integer.parseInt(txtCodTarefa.getText());
            
            
            dataChegada = txtDataChegada.getText();
            horaChegada = txtHoraChegada.getText();
            dataFinal = txtDataFinal.getText();
            horaFinal = txtHoraFinal.getText();
            statusInicial = txtStatusInicial.getText();
            statusFinal = txtStatusFinal.getText();
            
            gerenciadores = new Gerenciadores(codTarefa,prioridade,terminado,txtTarefa.getText(),codUsuario,txtDataInicio.getText(),txtHoraInicio.getText(),txtDataPrevistoFinal.getText(),txtHoraPrevistoFinal.getText(),dataChegada,horaChegada,dataFinal,horaFinal,statusInicial,statusFinal);
//           gerenciadores = new Gerenciadores(codTarefa,prioridade,terminado,txtTarefa.getText(),codUsuario,txtDataInicio.getText(),txtHoraInicio.getText(),txtDataPrevistoFinal.getText(),txtHoraPrevistoFinal.getText(),txtDataChegada.getText(),txtHoraChegada.getText(),txtDataFinal.getText(),txtHoraFinal.getText(),txtStatusInicial.getText(),txtStatusFinal.getText());
            gerenciadoresDAO.update(gerenciadores);

        }
        loadTableGerenciadores();

        modo = "Navegar";
        manipulaInterfaceGerenciadores();
        
        txtCodTarefa.setText("");
        txtPrioridade.setText("");
        cmbTerminado.setSelectedItem("Terminado?");
        txtTarefa.setText("");
        txtUsuario.setText("");
        txtDataInicio.setText("");
        txtHoraInicio.setText("");
        txtDataPrevistoFinal.setText("");
        txtHoraPrevistoFinal.setText("");
        txtDataChegada.setText("");
        txtHoraChegada.setText("");
        txtDataFinal.setText("");
        txtHoraFinal.setText("");
        txtStatusInicial.setText("");
        txtStatusFinal.setText("");
  
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodTarefa.setText("");
        txtPrioridade.setText("");
        cmbTerminado.setSelectedItem("Terminado?");
        txtTarefa.setText("");
        txtUsuario.setText(Login.usuarios.getUsuario());
        txtDataInicio.setText("");
        txtHoraInicio.setText("");
        txtDataPrevistoFinal.setText("");
        txtHoraPrevistoFinal.setText("");
        txtDataChegada.setText("");
        txtHoraChegada.setText("");
        txtDataFinal.setText("");
        txtHoraFinal.setText("");
        txtStatusInicial.setText("");
        txtStatusFinal.setText("");
        
        modo = "Novo";
        manipulaInterfaceGerenciadores();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tblGerenciadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGerenciadorMouseClicked
         int index = tblGerenciador.getSelectedRow();

        if (index >= 0 && index < listaGerenciadores.size()) {

            Gerenciadores gerenciadores = listaGerenciadores.get(index);

              txtCodTarefa.setText(String.valueOf(gerenciadores.getCodGerenciador()));
              txtPrioridade.setText(String.valueOf(gerenciadores.getPrioridade()));
              cmbTerminado.setSelectedItem(String.valueOf(gerenciadores.getTerminado()));
              txtTarefa.setText(gerenciadores.getTarefa());
              txtUsuario.setText(Login.usuarios.getUsuario());
              txtDataInicio.setText(gerenciadores.getDataInicio());
              txtHoraInicio.setText(gerenciadores.getHoraInicio());
              txtDataPrevistoFinal.setText(gerenciadores.getDataPrevistoFinal());
              txtHoraPrevistoFinal.setText(gerenciadores.getHoraPrevistoFinal());
              txtDataChegada.setText(gerenciadores.getDataChegada());
              txtHoraChegada.setText(gerenciadores.getHoraChegada());
              txtDataFinal.setText(gerenciadores.getDataFinal());
              txtHoraFinal.setText(gerenciadores.getHoraFinal());
              txtStatusInicial.setText(gerenciadores.getStatusInicial());
              txtStatusFinal.setText(gerenciadores.getStatusFinal());
            
              modo = "Selecao";
              manipulaInterfaceGerenciadores();
       }
    }//GEN-LAST:event_tblGerenciadorMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int codTarefa = Integer.parseInt(txtCodTarefa.getText());
        int prioridade = Integer.parseInt(txtPrioridade.getText());
        String terminado = cmbTerminado.getSelectedItem().toString();

//        int codUsuario = 0;
        Gerenciadores gerenciadores = new Gerenciadores(codTarefa, prioridade, terminado, txtTarefa.getText(),Login.usuarios.getCodUsuario(), txtDataInicio.getText(), txtHoraInicio.getText(), txtDataPrevistoFinal.getText(), txtHoraPrevistoFinal.getText(), txtDataChegada.getText(), txtHoraChegada.getText(), txtDataFinal.getText(), txtHoraFinal.getText(), txtStatusInicial.getText(), txtStatusFinal.getText());
        gerenciadoresDAO.delete(gerenciadores);

        loadTableGerenciadores();
        txtCodTarefa.setText("");
        txtPrioridade.setText("");
        cmbTerminado.setSelectedItem("Terminado?");
        txtTarefa.setText("");
        txtUsuario.setText("");
        txtDataInicio.setText("");
        txtHoraInicio.setText("");
        txtDataPrevistoFinal.setText("");
        txtHoraPrevistoFinal.setText("");
        txtDataChegada.setText("");
        txtHoraChegada.setText("");
        txtDataFinal.setText("");
        txtHoraFinal.setText("");
        txtStatusInicial.setText("");
        txtStatusFinal.setText("");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        modo = "Editar";
        
        manipulaInterfaceGerenciadores();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cmbTerminadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTerminadoItemStateChanged
      
    }//GEN-LAST:event_cmbTerminadoItemStateChanged

    private void btnFinalizarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarTarefaActionPerformed
        int codTarefa = 0;

        if (txtCodTarefa.getText() != null && txtCodTarefa.getText().length() > 0) {
            codTarefa = Integer.parseInt(txtCodTarefa.getText());
        }

        DateTime agora = new DateTime();
        Gerenciadores gerenciadores = new Gerenciadores();
        gerenciadores.setCodGerenciador(codTarefa);
        gerenciadores.setHoraFinal(agora.toString("HH:mm"));
        gerenciadores.setDataFinal(agora.toString("dd/MM/yyyy"));

        String horaPrevisto = txtHoraPrevistoFinal.getText();
        String horaFinal = gerenciadores.getHoraFinal();
        DateTime dtInicio2 = null;
        DateTime dtFim2 = null;

        String[] horaPrevistoFinal = horaPrevisto.split(":");
        String[] horaFim = horaFinal.split(":");

        if (horaPrevisto.length() > 0 && horaFinal.length() > 0) {

            String[] dataPrevistoFinal = txtDataPrevistoFinal.getText().split("/");
            String[] dataFim = gerenciadores.getDataFinal().split("/");

            dtInicio2 = new DateTime(Integer.parseInt(dataPrevistoFinal[2]), Integer.parseInt(dataPrevistoFinal[1]), Integer.parseInt(dataPrevistoFinal[0]), Integer.parseInt(horaPrevistoFinal[0]), Integer.parseInt(horaPrevistoFinal[1]), 0);
            dtFim2 = new DateTime(Integer.parseInt(dataFim[2]), Integer.parseInt(dataFim[1]), Integer.parseInt(dataFim[0]), Integer.parseInt(horaFim[0]), Integer.parseInt(horaFim[1]), 0);

            if (manipulacaoDatas.diferencaDataHoras(dtInicio2, dtFim2)) {
                gerenciadores.setStatusFinal("Atrasado");
            } else {
                gerenciadores.setStatusFinal("Dentro do prazo");
            }

        }
        gerenciadoresDAO.finalizarTarefa(gerenciadores);
        loadTableGerenciadores();

        modo = "Selecao";
        manipulaInterfaceGerenciadores();

        txtCodTarefa.setText("");
        txtPrioridade.setText("");
        cmbTerminado.setSelectedItem("Terminado?");
        txtTarefa.setText("");
        txtUsuario.setText("");
        txtDataInicio.setText("");
        txtHoraInicio.setText("");
        txtDataPrevistoFinal.setText("");
        txtHoraPrevistoFinal.setText("");
        txtDataChegada.setText("");
        txtHoraChegada.setText("");
        txtDataFinal.setText("");
        txtHoraFinal.setText("");
        txtStatusInicial.setText("");
        txtStatusFinal.setText("");
    }//GEN-LAST:event_btnFinalizarTarefaActionPerformed

    private void btnIniciarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarTarefaActionPerformed
         int codTarefa = 0;
        if( txtCodTarefa.getText() != null && txtCodTarefa.getText().length()>0){
           codTarefa = Integer.parseInt(txtCodTarefa.getText());
        }
        
        DateTime agora = new DateTime();
        Gerenciadores gerenciadores = new Gerenciadores();
        gerenciadores.setCodGerenciador(codTarefa);
        gerenciadores.setHoraChegada(agora.toString("HH:mm"));
        gerenciadores.setDataChegada(agora.toString("dd/MM/yyyy"));
        
      String horaInicio = txtHoraInicio.getText();
      String horaChegada = gerenciadores.getHoraChegada();
      DateTime dtInicio = null;
      DateTime dtFim = null;
      
      String[] horaInicial = horaInicio.split(":");
      String[] horaComecou = horaChegada.split(":");
      
      if(horaInicio.length()>0 && horaChegada.length()>0){
          
          String[] dataInicio= txtDataInicio.getText().split("/");
          String[] dataChegou = gerenciadores.getDataChegada().split("/");
          
          dtInicio = new DateTime(Integer.parseInt(dataInicio[2]),Integer.parseInt(dataInicio[1]),Integer.parseInt(dataInicio[0]),Integer.parseInt(horaInicial[0]),Integer.parseInt(horaInicial[1]),0);
          dtFim = new DateTime(Integer.parseInt(dataChegou[2]),Integer.parseInt(dataChegou[1]),Integer.parseInt(dataChegou[0]),Integer.parseInt(horaComecou[0]),Integer.parseInt(horaComecou[1]),0);

         if(manipulacaoDatas.diferencaDataHoras(dtInicio, dtFim)){
             gerenciadores.setStatusInicial("Atrasado");
         } else {
              gerenciadores.setStatusInicial("Dentro do prazo");
         }
         
      }
        
        gerenciadoresDAO.iniciarTarefa(gerenciadores);
        loadTableGerenciadores();
        
        modo = "Selecao";
        manipulaInterfaceGerenciadores();
        
        txtCodTarefa.setText("");
        txtPrioridade.setText("");
        cmbTerminado.setSelectedItem("Terminado?");
        txtTarefa.setText("");
        txtUsuario.setText("");
        txtDataInicio.setText("");
        txtHoraInicio.setText("");
        txtDataPrevistoFinal.setText("");
        txtHoraPrevistoFinal.setText("");
        txtDataChegada.setText("");
        txtHoraChegada.setText("");
        txtDataFinal.setText("");
        txtHoraFinal.setText("");
        txtStatusInicial.setText("");
        txtStatusFinal.setText("");
    }//GEN-LAST:event_btnIniciarTarefaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeradorTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeradorTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeradorTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeradorTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeradorTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizarTarefa;
    private javax.swing.JButton btnIniciarTarefa;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbTerminado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGerenciador;
    private javax.swing.JTextField txtCodTarefa;
    private javax.swing.JTextField txtDataChegada;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicio;
    private javax.swing.JTextField txtDataPrevistoFinal;
    private javax.swing.JTextField txtHoraChegada;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtHoraPrevistoFinal;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtStatusFinal;
    private javax.swing.JTextField txtStatusInicial;
    private javax.swing.JTextField txtTarefa;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
