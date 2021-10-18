/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Greg Mago
 */
public class Login_Gerente extends javax.swing.JFrame {
    
    public static Contas conta = new Contas();
    public static ContaPoupança conta_poupanca = new ContaPoupança();
    public static ContaEspecial conta_especial = new ContaEspecial();

    /**
     * Creates new form NewJFrame
     */
    public Login_Gerente() {
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

        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Usuario_txt = new javax.swing.JTextField();
        Senha_txt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Usuario.setText("Usuario");

        Senha.setText("Senha:");

        jButton1.setText("Acessar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usuario)
                            .addComponent(Senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Senha_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(Usuario_txt))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(Usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(Senha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:      
        try
        {
            String usuario ,senha;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("login_gerente.txt"));
          
            bufferedReader.readLine();
                     
            usuario = bufferedReader.readLine();
            senha = bufferedReader.readLine();
                
            Manager gerente = new Manager(usuario, senha);
            gerente.setUsername(usuario);
            Lista_contas.lista_gerentes.add(gerente);
            
            System.out.println("Txt Usuario: " + usuario + " Txt Senha: " + senha);                                  
        }
        catch (IOException ex)  
        {
            ex.printStackTrace();
        } 
        
        for (int i = 0; i < Lista_contas.lista_gerentes.size(); i++) {
            
                Manager gerentes_cadastrados = Lista_contas.lista_gerentes.get(i);
                
                if(gerentes_cadastrados.getUsername().equals(Usuario_txt.getText()) && gerentes_cadastrados.getPassword().equals(Senha_txt.getText())) {
                    JOptionPane.showMessageDialog(null,"Bem vindo gerente"); 
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto!");
                    
                    System.out.println("Usuario: " + gerentes_cadastrados.getUsername() + "Senha: " + gerentes_cadastrados.getPassword());
                }               
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField Senha_txt;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField Usuario_txt;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
