/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_fila_dinamica_encadeada;

/**
 *
 * @author Rui Rodrigues
 */
public class Carro {
    private String cor;
    private String marca;
    private int ano;
    private String modelo;
    private String placa;
    private Carro proximo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public Carro getProximo() {
        return proximo;
    }

    public void setProximo(Carro proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor = " + cor + ",\nmarca = " + marca + ",\nano = " + ano + ",\nmodelo = " + modelo + ",\nplaca = " + placa + '}';
    }
    
    
    

    public Carro(String cor, String marca, int ano, String modelo, String placa) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
        this.proximo = null;
        
    }

    
}
