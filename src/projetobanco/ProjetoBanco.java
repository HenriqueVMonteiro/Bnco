/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Greg Mago
 */
public class ProjetoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Atualização dos dados persistidos no bloco de notas para gerentes;
        try {
            String usuario, senha;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("login_gerente.txt"));
            String lineReading = bufferedReader.readLine();

            while (lineReading != null) {

                if (lineReading.equals("--------")) {
                    usuario = bufferedReader.readLine();
                    senha = bufferedReader.readLine();
                    
                     try {
                        senha = Encrypt.decrypt(senha);
                    } catch (Exception a) {
                        a.printStackTrace();
                    }

                    Manager gerente = new Manager(usuario, senha);
                    Lista_contas.lista_gerentes.add(gerente);
                    System.out.println("Gerentes\t Usuario: " + usuario + "| Senha: " + senha);
                }
                lineReading = bufferedReader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Atualização dos dados persistidos no bloco de notas para consumidores;
        try {
            String usuario, senha;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("login_cliente.txt"));
            String lineReading = bufferedReader.readLine();

            while (lineReading != null) {

                if (lineReading.equals("--------")) {
                    usuario = bufferedReader.readLine();
                    senha = bufferedReader.readLine();

                    try {
                        senha = Encrypt.decrypt(senha);
                    } catch (Exception a) {
                        a.printStackTrace();
                    }

                    Consumidor cons = new Consumidor(usuario, senha);
                    Lista_contas.lista_consumidores.add(cons);
                    System.out.println("Consumidores\t Usuario: " + usuario + "| Senha: " + senha);
                }
                lineReading = bufferedReader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Inicio ini = new Inicio();
        ini.setVisible(true);

    }

}
