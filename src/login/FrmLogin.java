
package login;

import ViewAdm.FrmMenuAdm;
import quiz.FrmTemas;
import javax.swing.ImageIcon;
import data.UsuarioData;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Usuarios;
import quiz.FrmMenuUsuario;
import quiz.FrmPerguntas;
import quiz.FrmRegras;
import quiz.FrmTemas;


public class FrmLogin extends javax.swing.JFrame {

    FrmPerguntas obTelaPergunta;
    UsuarioData DAO;
    Usuarios objusu;
    Date data;
    FrmRegras TelaRegra;
    public FrmLogin() {
        initComponents();
        DAO = new UsuarioData();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnNovoUsuario = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lbltTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar");
        setIconImage(new ImageIcon(getClass().getResource("/icones/icon.png")).getImage());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setText("Usuário:");

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnNovoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/group_add.png"))); // NOI18N
        btnNovoUsuario.setText("Novo Usuário");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/accept.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lbltTexto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltTexto.setForeground(java.awt.Color.blue);
        lbltTexto.setText("Comece agora o seu desafio!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntrar)
                                .addGap(63, 63, 63)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(98, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        this.dispose();
        FrmCadastroUsuarios outra = new FrmCadastroUsuarios();
        outra.setVisible(true);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        obTelaPergunta = new FrmPerguntas();
        if (txtUsuario.getText().equals("adm") && txtSenha.getText().equals("123")) {
            this.dispose();
            FrmMenuAdm outra = new FrmMenuAdm();
            outra.setVisible(true);
        } else {
            try {
                if (validarCampos()) {
                    if (preencherObjeto()) {
                        if (DAO.acessarSistema(txtUsuario.getText(), txtSenha.getText())) {
                            JOptionPane.showMessageDialog(null, "Bem vindo " + DAO.pegarNomeUser(txtUsuario.getText(), txtSenha.getText()) + "!");
                            this.dispose();
                            FrmMenuUsuario telaMenuUsuario = new FrmMenuUsuario(DAO.pegarCodUser(txtUsuario.getText(), txtSenha.getText()));
                            TelaRegra = new FrmRegras(); 
                            TelaRegra.setVisible(true);
                            telaMenuUsuario.setVisible(true);
                           

                        } else {
                            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                            limparCampos();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível efetuar o logon!");
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(this, "Erro em aqui:" + erro.getMessage());
            }

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbltTexto;
    public javax.swing.JPasswordField txtSenha;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void limparCampos() {
        txtUsuario.setText("");
        txtSenha.setText("");
    }

    public boolean preencherObjeto() {
        objusu = new Usuarios();
        objusu.setUsuario(txtUsuario.getText());
        objusu.setSenha(txtSenha.getText());
        return true;
    }

    public boolean validarCampos() {
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Usuário!");
            txtUsuario.requestFocus();
            return false;
        }

        if (txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Senha!");
            txtSenha.requestFocus();
            return false;
        }

        return true;
    }

}
