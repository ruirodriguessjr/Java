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
public class P_Fila_Estatica_Sequencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila_Pessoa mfp = new Fila_Pessoa();
        mfp.pop();
        mfp.print();
        Pessoa p1 = new Pessoa("Rui Rodrigues", "324.546.987-98", 'M');
        mfp.push(p1);
        mfp.print();
        mfp.pop();
        mfp.print();
        
        
        
    }
    
}
