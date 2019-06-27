/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_pilha_estatica_sequencial;

/**
 *
 * @author Rui Rodrigues
 */
public class P_Pilha_Estatica_Sequencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pilha_Livro mpl = new Pilha_Livro();
        
        mpl.print();
        System.out.println("");
        
        Livro l1 = new Livro("A Arte da Guerra", "Rui Rodrigues", 0);
        mpl.push(l1);
        mpl.print();
        System.out.println("");
        Livro l2 = new Livro("Doido é pouco", "Vanessa", 1);
        mpl.push(l2);
        mpl.print();
        System.out.println("");
        mpl.pop();
        mpl.print();
 
        
        
        
        
    }
    
}
