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
public class Consumidor extends Usuario {

    private int ContaSimplesCount, ContaEspecialCount, ContaPoupançaCount;

    public int getContaSimplesCount() {
        return ContaSimplesCount;
    }

    public int getContaEspecialCount() {
        return ContaEspecialCount;
    }

    public int getContaPoupançaCount() {
        return ContaPoupançaCount;
    }

    public void setContaSimplesCount(int ContaSimplesCount) {
        this.ContaSimplesCount += ContaSimplesCount;
    }

    public void setContaEspecialCount(int ContaEspecialCount) {
        this.ContaEspecialCount += ContaEspecialCount;
    }

    public void setContaPoupançaCount(int ContaPoupançaCount) {
        this.ContaPoupançaCount += ContaPoupançaCount;
    }

    public Consumidor(String username, String password) {
        super(username, password, "consumidor");
    }

    @Override
    public String toString() {
        return this.getUsername();
    }

    private ArrayList<Contas> contas = new ArrayList<>();

    public ArrayList<Contas> getContas() {
        return contas;
    }

    private ArrayList<ContaSimples> ContasSimples_t = new ArrayList<>();
    private ArrayList<ContaEspecial> ContasEspeciais_t = new ArrayList<>();
    private ArrayList<ContaPoupança> ContasPoupança_t = new ArrayList<>();

    public ArrayList<ContaSimples> getContasSimples_t() {
        return ContasSimples_t;
    }

    public ArrayList<ContaEspecial> getContasEspeciais_t() {
        return ContasEspeciais_t;
    }

    public ArrayList<ContaPoupança> getContasPoupança_t() {
        return ContasPoupança_t;
    }
}
