package quiz;

import data.RespostaData;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Pergunta;
import model.Usuarios;

public class FrmPerguntas extends javax.swing.JInternalFrame {

    ArrayList perguntas = new ArrayList();
    Pergunta obPerg = new Pergunta();
    RespostaData DAO = new RespostaData();
    protected String escolha;
    private Pergunta perg;
    private int contador = 0;
    String resposta = null;
    protected int codUser;
    protected boolean acertou = false;
    protected int cod_perg;
    FrmTemas TelaTema;
    private int pontos;
    private int ultimoReg;

    public FrmPerguntas() {
        Usuarios obUser = new Usuarios();
    }

    public FrmPerguntas(String escolha) {

        initComponents();
        this.escolha = escolha;
        pegarPerguntas();
        preencherCampos();

        try {
            DAO.inserirRegistro(codUser);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro é: " + erro);
        }

        ultimoReg = DAO.retornaUltimoregistro();

    }

    public FrmPerguntas(int codUser, String escolha) {

        initComponents();
        this.codUser = codUser;
        this.escolha = escolha;
        pegarPerguntas();
        preencherCampos();

        try {
            DAO.inserirRegistro(codUser);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro é: " + erro);
        }

        ultimoReg = DAO.retornaUltimoregistro();

    }

    public FrmPerguntas(int codUser) {

        initComponents();
        this.codUser = codUser;
        pegarPerguntas();
        preencherCampos();
        ultimoReg = DAO.retornaUltimoregistro();
        JOptionPane.showMessageDialog(null, "O erro é: " + ultimoReg);

        try {
            DAO.inserirRegistro(codUser);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro é: " + erro);
        }
        ultimoReg = DAO.retornaUltimoregistro();

    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
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

        jLabel1 = new javax.swing.JLabel();
        txtPergunta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRespostaA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRespostaB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRespostaC = new javax.swing.JTextField();
        btnB = new javax.swing.JRadioButton();
        btnA = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnProxima = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Questionário");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("PERGUNTA");

        txtPergunta.setEditable(false);
        txtPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerguntaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("A -");

        txtRespostaA.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("B -");

        txtRespostaB.setEditable(false);
        txtRespostaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespostaBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("C -");

        txtRespostaC.setEditable(false);
        txtRespostaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespostaCActionPerformed(evt);
            }
        });

        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnProxima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProxima.setText("Próxima Pergunta");
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnB)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRespostaB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnA)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(txtRespostaA))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnC)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRespostaC, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnProxima)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespostaA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRespostaB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRespostaC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnProxima)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerguntaActionPerformed

    }//GEN-LAST:event_txtPerguntaActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAActionPerformed

    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
        if (validarMarcado()) {
            marcarResposta();
            validarResposta();
            try {
                DAO.inserirNoRegistroPergunta(obPerg.getCodigoPergunta(), ultimoReg, acertou);
                btnProxima.setEnabled(true);
                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "O erro é: " + erro);
            }
        } else {

        }
        if (PerguntaContador()) {
            preencherCampos();
            btnProxima.setEnabled(true);
        } else {

        }
    }//GEN-LAST:event_btnProximaActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBActionPerformed

    private void txtRespostaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespostaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespostaCActionPerformed

    private void txtRespostaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespostaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespostaBActionPerformed

    public void pegarPerguntas() {

        try {
            perguntas = (DAO.getPergunta(escolha));
            if (perguntas.size() == 0) {
                JOptionPane.showMessageDialog(this, "Não contém perguntas cadastradas nesse tema, porfavor escolha outro tema!");
                //TelaTema = new FrmTemas(this.codUser);
                //TelaTema.setVisible(true);
                // this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "O erro é no pegarPerguntas() " + e.getMessage());
        }

    }

    public boolean PerguntaContador() {
        if (contador >= perguntas.size() - 1) {
            JOptionPane.showMessageDialog(this, "Finalizado, você fez " + pontos + " Ponto(s), verifique o Ranking!");
            this.dispose();
            return false;
        } else {
            contador += 1;
            return true;
        }
    }

    public void preencherCampos() {
        obPerg = (Pergunta) perguntas.get(contador);
        txtPergunta.setText(obPerg.getPergunta());
        txtRespostaA.setText(obPerg.getRespostaA());
        txtRespostaB.setText(obPerg.getRespostaB());
        txtRespostaC.setText(obPerg.getRespostaC());
        cod_perg = obPerg.getCodigoPergunta();
        grupoBotao();
        
    }

    public void grupoBotao() {
        ButtonGroup respCerto;
        respCerto = new ButtonGroup();
        respCerto.add(btnA);
        respCerto.add(btnB);
        respCerto.add(btnC);
        respCerto.clearSelection();
    }

    public boolean validarMarcado() {

        if (btnA.isSelected() == true
                || btnB.isSelected() == true
                || btnC.isSelected() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Antes de salvar selecione uma alternativa!");
            return false;
        }

    }

    public void validarResposta() {
        if (obPerg.getRespostaCerta().equals(resposta)) {
            acertou = true;
            pontos = pontos + 1;
            JOptionPane.showMessageDialog(null, "Você Acertou a Alternativa!");
        } else {
            acertou = false;
            JOptionPane.showMessageDialog(null, "Você Errou a Alternativa!");
        }
    }

    public void marcarResposta() {
        if (btnA.isSelected() == true) {
            resposta = "A";
        } else if (btnB.isSelected() == true) {
            resposta = "B";
        } else if (btnC.isSelected() == true) {
            resposta = "C";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JButton btnProxima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPergunta;
    private javax.swing.JTextField txtRespostaA;
    private javax.swing.JTextField txtRespostaB;
    private javax.swing.JTextField txtRespostaC;
    // End of variables declaration//GEN-END:variables
}
