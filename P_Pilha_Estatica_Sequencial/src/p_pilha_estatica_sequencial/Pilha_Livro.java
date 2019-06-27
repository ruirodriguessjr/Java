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
public class Pilha_Livro {
    
    static int topo;   
    static Livro elementos[] = new Livro[6];

    public Pilha_Livro() {
        topo = -1;
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = null;
        }
        System.out.println("Pilha Criada com Sucesso");
    }
    
    
    private static boolean vazia(){
        if (topo == -1) {
            return true;
        }else{
            return false;
        }
    }
    
    private static boolean cheia(){
        if (topo == elementos.length - 1) {
            return true;
        }else{
            return false;
        }
    }
    
    
    public static void push(Livro l){
        if (cheia()) {
            System.out.println("Impossível Inserir, Pilha Cheia!");
        }else{
            topo++; // topo que inicialmente é -1 recebe o próximo que é 0;
            elementos[topo] = l;            
        }                           
    }
    
    public static void print(){
        if (vazia()) {
            System.out.println("Pilha Vazia!");
        }else{
            System.out.println("Os elementos da Pilha São: ");
            for (int i = 0; i <= topo; i++) {
                System.out.println(elementos[i].toString());
            }
            //for(Livro c : elementos){
            //    System.out.println(c);
            //}
        }
    }
    
    public static void pop(){
        if (vazia()) {
            System.out.println("Impossível Remover, Pilha Vazia");
        }else{
            elementos[topo] = null;
            topo--;
            System.out.println("Elemento Removido");
        }
    }
    

            
      
        
}
