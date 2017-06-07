package quiz;

import data.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import login.FrmLogin;
import model.Pergunta;
import data.UsuarioData;

public class FrmTemas extends javax.swing.JInternalFrame {

    UsuarioData DAO = new UsuarioData();
    private Conexao con;
    private String tema;
    private int codUser;
    private FrmRank telaRank;
    private ArrayList perguntas = new ArrayList();
    private FrmPerguntas telaResp;
    private String nomeLogado;
    private FrmMenuUsuario adm;

    public FrmTemas() {
        initComponents();
        this.comboboxTema();
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    }

    public FrmTemas(int cod) {
        initComponents();
        this.comboboxTema();
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        this.codUser = cod;

    }

    public FrmTemas(FrmMenuUsuario a) {
        this.adm = a;
        initComponents();

    }

    public int getCodUser() {
        return codUser;
    }

    public void setCodUser(int codUser) {
        this.codUser = codUser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTemas = new javax.swing.JComboBox<>();
        btnComecar = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Escolha do Tema");

        cmbTemas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tema" }));
        cmbTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemasActionPerformed(evt);
            }
        });

        btnComecar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComecar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        btnComecar.setText("Começar");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });

        lblTexto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTexto.setForeground(java.awt.Color.blue);
        lblTexto.setText("Escolha seu tema para começar!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnComecar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTexto))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTexto)
                .addGap(60, 60, 60)
                .addComponent(cmbTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnComecar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTemasActionPerformed

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed

        telaResp = new FrmPerguntas(this.codUser, String.valueOf(cmbTemas.getSelectedItem()));
        telaResp.setEscolha(String.valueOf(cmbTemas.getSelectedItem()));
        FrmMenuUsuario.jDesktopPane1.add(telaResp);
        telaResp.setVisible(true);

        this.dispose();


    }//GEN-LAST:event_btnComecarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnComecar;
    private javax.swing.JComboBox<String> cmbTemas;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables

    public void comboboxTema() {
        try {
            con = new Conexao();
            String SQL = "select * from tema";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cmbTemas.addItem(rs.getString("nome"));
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }
}
