/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;
import java.util.ArrayList;
/**
 *
 * @author Greg Mago
 */
public class Manager extends Usuario {
    private ArrayList<Consumidor> ListConsumidores = new ArrayList<Consumidor>();

    public ArrayList<Consumidor> getListaConsumidores() {
		return ListConsumidores;
    }

    public Manager(String usuario, String senha) {
	super(usuario, senha,"gerente");	
    }
}
