/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_lista_dinamica_simplesmente_encadeada;

/**
 *
 * @author aluno
 */
public class Contato {
    
    private String nome;
    private int telefone;
    private Contato proximo;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.proximo = null;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Contato getProximo() {
        return proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }
    
    

    @Override
    public String toString() {
        return "Contato{" + "\nnome = " + nome + ", \ntelefone = " + telefone + '}';
    }


    
    
    
    
}
