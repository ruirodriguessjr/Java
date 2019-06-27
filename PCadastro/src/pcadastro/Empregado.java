/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcadastro;

/**
 *
 * @author aluno
 */
public class Empregado extends Pessoa {
    private double salario;

    public Empregado(double salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    

    public Empregado() {
        salario = 0.0f;
    }
    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
