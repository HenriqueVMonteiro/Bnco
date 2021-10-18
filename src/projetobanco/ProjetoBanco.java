/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;
import javax.swing.JOptionPane;
/**
 *
 * @author Greg Mago
 */
public class ProjetoBanco {

    /**
     * @param args the command line arguments
     */
    public static Contas conta = new Contas();
    public static ContaPoupança conta_poupanca = new ContaPoupança();
    public static ContaEspecial conta_especial = new ContaEspecial();

    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.print("SENHA:" + conta.senha);
        NewJFrame inicio = new NewJFrame();
              
        inicio.setVisible(true);
                   
    }
    
}
