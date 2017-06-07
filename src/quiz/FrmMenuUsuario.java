package quiz;

import data.RespostaData;
import data.UsuarioData;
import javax.swing.JOptionPane;
import login.FrmLogin;
import javax.swing.ImageIcon;

public class FrmMenuUsuario extends javax.swing.JFrame {

    FrmRank frmRank = new FrmRank();
    FrmTemas frmTemas ;
    UsuarioData DAO = new UsuarioData();
    RespostaData DAO2 = new RespostaData();
    private String nomeLogado;
    private int codUser;
    FrmSobre TelaSobre;
    FrmRegras TelaRegra;
    
    
    public FrmMenuUsuario() {
        this.frmTemas = new FrmTemas(codUser);
        initComponents();
       
    }

    public FrmMenuUsuario(int cod) {
            
        initComponents();
        try {
            this.nomeLogado = DAO.pegarNomeUser(cod);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro em pegar o Nome do user: " + erro);
        }
        lblNome.setText("Usuário: " + nomeLogado + "     Data: " + DAO2.getDateTime());
        this.codUser = cod;
        this.frmTemas = new FrmTemas(codUser);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblNome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPlay = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRanking = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuVoltar = new javax.swing.JMenuItem();
        menuFechar = new javax.swing.JMenuItem();
        menuSobreEDicas = new javax.swing.JMenu();
        menuDicas = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        setIconImage(new ImageIcon(getClass().getResource("/icones/icon.png")).getImage());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        jMenu1.setText("Jogar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset_next.png"))); // NOI18N
        menuPlay.setText("Play");
        menuPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPlayActionPerformed(evt);
            }
        });
        jMenu1.add(menuPlay);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/layout.png"))); // NOI18N
        jMenu2.setText("Ranking");

        menuRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/layout.png"))); // NOI18N
        menuRanking.setText("Verificar Ranking");
        menuRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRankingActionPerformed(evt);
            }
        });
        jMenu2.add(menuRanking);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/stop.png"))); // NOI18N
        jMenu4.setText("Sair");

        menuVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_rotate_anticlockwise.png"))); // NOI18N
        menuVoltar.setText("Voltar Para a Tela de Login");
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });
        jMenu4.add(menuVoltar);

        menuFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel.png"))); // NOI18N
        menuFechar.setText("Fechar Programa");
        menuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFecharActionPerformed(evt);
            }
        });
        jMenu4.add(menuFechar);

        jMenuBar1.add(jMenu4);

        menuSobreEDicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/asterisk_orange.png"))); // NOI18N
        menuSobreEDicas.setText("Dicas e Sobre!");
        menuSobreEDicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreEDicasActionPerformed(evt);
            }
        });

        menuDicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bell.png"))); // NOI18N
        menuDicas.setText("Dicas para jogar!");
        menuDicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDicasActionPerformed(evt);
            }
        });
        menuSobreEDicas.add(menuDicas);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/book_open.png"))); // NOI18N
        menuSobre.setText("Sobre o Programa!");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuSobreEDicas.add(menuSobre);

        jMenuBar1.add(menuSobreEDicas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPlayActionPerformed
        fecharTodos();
        jDesktopPane1.add(frmTemas);
        frmTemas.setVisible(true);
        this.setSize(624, 553);
        

    }//GEN-LAST:event_menuPlayActionPerformed

    private void menuRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRankingActionPerformed
        fecharTodos();
        jDesktopPane1.add(frmRank);
        frmRank.setVisible(true);
        this.setSize(576, 567);


    }//GEN-LAST:event_menuRankingActionPerformed

    private void menuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFecharActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        FrmLogin TelaLogin = new FrmLogin();
        TelaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuSobreEDicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreEDicasActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_menuSobreEDicasActionPerformed

    private void menuDicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDicasActionPerformed
        TelaRegra = new FrmRegras();
        TelaRegra.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_menuDicasActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:

        TelaSobre = new FrmSobre();
        TelaSobre.setVisible(true);


    }//GEN-LAST:event_menuSobreActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    public static javax.swing.JLabel lblNome;
    private javax.swing.JMenuItem menuDicas;
    private javax.swing.JMenuItem menuFechar;
    private javax.swing.JMenuItem menuPlay;
    private javax.swing.JMenuItem menuRanking;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenu menuSobreEDicas;
    private javax.swing.JMenuItem menuVoltar;
    // End of variables declaration//GEN-END:variables

    public void fecharTodos() {
        frmRank.setVisible(false);
        frmTemas.setVisible(false);
        frmRank.dispose();
        frmTemas.dispose();
        jDesktopPane1.remove(frmRank);
        jDesktopPane1.remove(frmTemas);

    }

}
