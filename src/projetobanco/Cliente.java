/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

/**
 *
 * @author Greg Mago
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        teste = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Bem vindo, cliente!");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abrir conta", "Aplicar dinheiro em uma de suas contas", "Retirar dinheiro de uma de suas contas", "Verificar saldo de uma conta específica", "Verificar extrato de uma conta específica", "Alterar sua senha" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Selecione uma opção");

        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        teste.setText("Voltar");
        teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetobanco/imagens/pngwing.com (8).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teste))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(teste))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       switch (jComboBox1.getSelectedIndex()){
           case 0:
                System.out.println("Criar Contas");              
                CriarConta ac = new CriarConta();
                ac.setVisible(true);
                
                this.setVisible(false);
                break;
           case 1:
                DepositarDinheiro_cliente ad = new DepositarDinheiro_cliente();
                ad.setVisible(true);
                this.setVisible(false);
                
                System.out.println("Aplicar dinheiro em uma de suas contas");
               break;
           case 2:
               RetirarDinheiro_cliente1 rc = new RetirarDinheiro_cliente1();
               rc.setVisible(true);
               this.setVisible(false);   
               
               System.out.println("Retirar dinheiro de uma de suas contas");
               break;
           case 3:
               VerificarSaldo_cliente vc = new VerificarSaldo_cliente();
               vc.setVisible(true);
               this.setVisible(false);
               
               System.out.println("Verificar saldo de uma conta específica");
               break;
           case 4:
               Extrato_cliente ec = new Extrato_cliente();
               ec.setVisible(true);
               this.setVisible(false);
               
               System.out.println("Verificar extrato de uma conta específica");
               break;
           case 5:
               AlterarSenha_cliente acc = new AlterarSenha_cliente();
               acc.setVisible(true);
               this.setVisible(false);
               
               System.out.println("Alterar sua senha");
               break;
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeActionPerformed
        // TODO add your handling code here:
       Inicio ini = new Inicio();
       ini.setVisible(true);
       
       this.setVisible(false);
    }//GEN-LAST:event_testeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton teste;
    // End of variables declaration//GEN-END:variables
}
