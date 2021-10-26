/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

import java.io.*;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import java.security.GeneralSecurityException;

/**
 *
 * @author Greg Mago
 */
public class CriaConta_gerente extends javax.swing.JFrame {

    /**
     * Creates new form CriaConta_gerente
     */
    public CriaConta_gerente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Usuario_txt = new javax.swing.JTextField();
        Senha_txt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 86, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 149, -1, -1));

        Usuario_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 88, 167, -1));

        Senha_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Senha_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Senha_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 149, 167, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetobanco/imagens/pngwing.com_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 52, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Complete o cadastro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 11, 177, 49));

        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        jPanel1.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 198, -1, -1));

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ja possui uma conta ?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Faça o login");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Senha_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Senha_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Senha_txtActionPerformed

    private void Usuario_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario_txtActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // TODO add your handling code here:
        String senha = Senha_txt.getText();

        try {
            senha = Encrypt.encrypt(senha);
        } catch (Exception a) {
            a.printStackTrace();
        }
       
        try {
            boolean existe = !(Usuario_txt.getText().isEmpty() || Senha_txt.getText().isEmpty());

            if (existe) {
                Manager gerente = new Manager(Usuario_txt.getText(), Senha_txt.getText());
                Lista_contas.lista_gerentes.add(gerente);

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }

            if (existe) {

                BufferedWriter bw = new BufferedWriter(new FileWriter("login_gerente.txt", true));
                bw.append("--------");
                bw.newLine();
                bw.append(Usuario_txt.getText());
                bw.newLine();
                bw.append(senha);
                bw.newLine();
                bw.close();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_EnviarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        Inicio ini = new Inicio();
        ini.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_VoltarActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        CriaConta_gerente_inicio frame = new CriaConta_gerente_inicio();
        frame.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel7MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JPasswordField Senha_txt;
    private javax.swing.JTextField Usuario_txt;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
