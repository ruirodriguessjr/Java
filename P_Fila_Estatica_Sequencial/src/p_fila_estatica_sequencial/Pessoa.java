/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_fila_estatica_sequencial;

/**
 *
 * @author Rui Rodrigues
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private char sexo;

    public Pessoa(String nome, String cpf, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "\nnome = " + nome + ".\ncpf = " + cpf + ".\nsexo = " + sexo + '}';
    }
    
    
    
    
    
    
}
