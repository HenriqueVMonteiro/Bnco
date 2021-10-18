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
public class ContaSimples extends Contas {
    
    public ContaSimples(double saldo,int id) {
		super(saldo, id);
    }
    @Override
    public String toString() {
		return "Conta Simples " + this.getId();
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
