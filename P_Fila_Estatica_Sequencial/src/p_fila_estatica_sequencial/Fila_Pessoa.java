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
public class Fila_Pessoa {
    
    static int head;
    static int tail;
    static Pessoa[] elementos = new Pessoa[6]; // Criando vetor de pessoas, pois é o tipo de dado que irei criar.

    public Fila_Pessoa() {
        this.head = -1;
        this.tail = -1;
        System.out.println("Fila Criada com Sucesso!");
    }

    private static boolean vazia(){
        if ((head == -1) && (tail == -1)) {
            return true;
        }else{
            return false;
        }
    }
    
    private static boolean cheia(){ // Não estar cheio não significa estar vazio e vice-versa
        if (tail == elementos.length - 1) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void push(Pessoa p){
        if (cheia()) {
            System.out.println("Impossível Inserir, Fila Cheia!");
        }else{
            if (vazia()) {
                head = 0;
                tail = 0;
            }else{
                tail++;
            }
            elementos[tail] = p;            
        }                           
    }

    public static void print(){
        if (vazia()) {
            System.out.println("Fila Vazia!");    
        }else{
            System.out.println("Os Elementos são: ");
            for (int i = 0; i <= tail; i++) {
                System.out.println(elementos[i].toString());
            }
        }
        
    }
    
    public static void pop(){
        if (vazia()) {
            System.out.println("Impossível Remover, Fila Vazia!");
        }else{
            for (int i = 0; i < tail ; i++) {
                elementos[i] = elementos[i+1];
            }
            elementos[tail] = null;
            tail--;
            if (tail == -1) {
                head = -1;
            }
            
        }
    }
    
    
    
    
}
