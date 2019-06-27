/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcadastro;

import java.text.ParseException;

/**
 *
 * @author Rui Rodrigues
 */
public class PCadastro {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws ParseException{
        // Objeto 1º Pessoa Sem Parâmetros de construtor
        Pessoa p1 = new Pessoa();
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Cpf: " + p1.getCpf());
        System.out.println("");
        // Objeto 2º Pessoa Com Parâmetros de Construtor
        Pessoa p2 = new Pessoa("Vanessa Juliani", "169.810.297-87");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Cpf: " + p2.getCpf());
        System.out.println("");
        // Objeto 1º Empregado extendendo Pessoa Sem Parâmetros de construtor
        Empregado e1 = new Empregado();
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Cpf: " + e1.getCpf());
        System.out.println("Salario: " + e1.getSalario());
        System.out.println("");
        // Objeto 2º Empregado extendendo Pessoa Com Parâmetros de Construtor
        Empregado e2 = new Empregado(7700.00f, "Rui Rodrigues", "169.916.223-23");
        System.out.println("Nome: " + e2.getNome());
        System.out.println("Cpf: " + e2.getCpf());
        System.out.println("Salario: " + e2.getSalario());
        System.out.println("");
        // Objeto 1º Cliente extendendo Pessoa Com Parâmetros de Construtor
        Cliente c1 = new Cliente(1, "19/01/1988", "42.030.032-6", "Rui Rodrigues", "169.810.297-87");
        System.out.println("Id: " + c1.getId());
        System.out.println("Data de Nascimento: " + c1.getData());
        System.out.println("RG: " + c1.getRg());
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Cpf: " + c1.getCpf());
        System.out.println("");
        // Objeto 2º Cliente extendendo Pessoa Sem Parâmetros de construtor
        Cliente c2 = new Cliente();
        System.out.println("Id: " + c2.getId());
        System.out.println("Data de Nascimento: " + c2.getData());
        System.out.println("RG: " + c2.getRg());
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Cpf: " + c2.getCpf());
        System.out.println("");
        // Objeto 3º Cliente extendendo Pessoa Com Parâmetros de Construtor    

    }
    
}
