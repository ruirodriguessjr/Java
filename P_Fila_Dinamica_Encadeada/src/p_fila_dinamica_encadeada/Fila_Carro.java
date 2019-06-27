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
public class Fila_Carro {
    
    static Carro head, tail;

    public Fila_Carro() {         
        head = null;
        tail = null;
        System.out.println("Fila Criada com Sucesso!");
        
    }

    private static boolean vazia(){ // Método verificando se ele está vazia!
        if ((head == null) && (tail == null)) {
            return (true); // Está Vazia
        }else{
            return (false); // Existe algum elemento nqa fila
        }
    }
    
    
    public static void push(Carro carro){
        if (vazia()) {
            head = carro;
            tail = carro;
        }else{
            tail.setProximo(carro);
            tail = carro;
            
        }
    }
    
   
    public static void print(){
        if (vazia()) {
            System.out.println("Impossível Imprimir. Fila Vazia!");
        }else{
            Carro aux = head;
            do{
                System.out.println(aux.toString());
                aux = aux.getProximo();
            }while(aux != null);
            
        }
        
    }
    
    public static void pop(){ // Remove só a head
        if (vazia()) {
            System.out.println("Impossívrel Remover! Fila Vazia");
        }else{
            head = head.getProximo();
            if (head == null) {
                tail = null;
            }
            System.out.println("Fila Ficou Vazia!");
        }
    }
    
    
    
}
