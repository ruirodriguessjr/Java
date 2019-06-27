/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_pilha_dinamica_encadeada;
 
/**
 *
 * @author Rui Rodrigues
 */
public class Jogo {
    private int id;
    private String nome;
    private String  genero;
    private Jogo anterior;
 
     
    public Jogo(int id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.anterior = null;
    }
     
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getGenero() {
        return genero;
    }
 
    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    public Jogo getAnterior() {
        return anterior;
    }
 
    public void setAnterior(Jogo anterior) {
        this.anterior = anterior;
    }
 
 
     
     
     
     
}