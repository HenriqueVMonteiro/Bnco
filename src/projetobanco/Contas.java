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
public abstract class Contas {
    
    public ArrayList<String> Extratos = new ArrayList<>();
    
    private double saldo;
    private int id;

    public Contas(double Saldo, int Id) {
        this.saldo = Saldo;
        this.id = Id;
    }
    public abstract boolean sacar(double valor_p_sacar);
    
    public double getSaldo() {
        return saldo;
    }
    public int getId() {
		return id;
    }
    public void setSaldo(double saldo) {
		this.saldo = saldo;
    }
    

}
