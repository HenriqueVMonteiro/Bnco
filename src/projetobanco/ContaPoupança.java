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
public class ContaPoupança extends Contas {
    
    public ContaPoupança(double saldo,int id) {
		super(saldo, id);
    }
    
    @Override
    public String toString() {
		return "Conta Poupança " + this.getId();
    }
    private double rendimento;
    
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rend) {
        rendimento = rend;
    }
    public double getCalculoRendimento() {

        double pcr_total = (this.rendimento / 100) * this.getSaldo();
        
        return pcr_total;
    }
 
    @Override
    public boolean sacar(double valor_p_sacar) {
        if (this.getSaldo() < valor_p_sacar) {
            System.out.printf("\nNao foi possivel sacar\nSaldo atual: %.1fR$\nValor requisitado %.1fR$\n", this.getSaldo(),
                    valor_p_sacar);
            return false;
        } else {
            this.setSaldo(this.getSaldo() - valor_p_sacar);
            return true;
        }
    }
    
}
