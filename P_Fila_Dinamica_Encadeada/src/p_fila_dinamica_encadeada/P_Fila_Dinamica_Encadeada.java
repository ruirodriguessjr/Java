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
public class P_Fila_Dinamica_Encadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila_Carro mfc = new Fila_Carro();
        mfc.print();
        Carro c1 = new Carro("Azul", "Fiat", 2019, "Argo", "PZS 4128");
        mfc.push(c1);
        System.out.println("");
        Carro c2 = new Carro("Amarelo", "Chevrolet", 2015, "Onix", "EBE 7347");
        mfc.push(c2);
        mfc.print();
        mfc.pop();
        mfc.print();
        mfc.pop();
        
        
    }
    
}
