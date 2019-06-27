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
public class P_Lista_Dinamica_Simplesmente_Encadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista_Contato mlc = new Lista_Contato();  
        Contato c1 = new Contato("Fabio", 190);
        Contato c2 = new Contato("Bruna", 3332);
        Contato c3 = new Contato("Carla", 9999);
        Contato c4 = new Contato("Diego", 8888);
        Contato c5 = new Contato("Zulma", 9873);
        mlc.push(c1);
        mlc.push(c2);
        mlc.push(c3);
        mlc.push(c4);
        mlc.push(c5);
        mlc.print();
    }
    
}
