/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_pilha_dinamica_encadeada;
 
/**
 *
* @author Rui Rodrigues
 */
public class Pilha_Jogos {
    static Jogo topo;
    private int count;


 
    public Pilha_Jogos() {
        this.topo = null;
        System.out.println("Pilha Criada!");
    }
     
    public static void push(Jogo jogo) {
        jogo.setAnterior(topo);
        topo = jogo;
             
    }
     
    public static void print(){
        if (topo == null) {
            System.out.println("PILHA VAZIA");
        }else{
            Jogo aux = topo;
            do{
                System.out.println("ID: " + aux.getId());
                System.out.println("NOME: " + aux.getNome());
                System.out.println("GÊNERO: " + aux.getGenero());
                aux = aux.getAnterior();
            }while(aux != null);
             
        }
    }
    
    public String encontraJogo(String game){
        if (topo == null) {
            System.out.println("Pilha Vazia!");
        }else{
            Jogo aux = topo;
            do{
                if (aux.getNome().equals(game)) {
                    return "Jogo Encontrado";
                }
                aux = aux.getAnterior();                
            }while(aux != null);
        }
        return "Jogo Não Encontrado";
    }
    
    
    public int pegaQtd(){
        if (topo == null) {
            System.out.println("Pilha Vazia!");
        }else{
            Jogo aux = topo;
            while(aux != null){
                count++;
                aux = aux.getAnterior();
            }
        }
        return count;
    }
    
     
    public static void pop(){
        if (topo == null) {
            System.out.println("Impossível Remover. Pilha Vazia");
        }else{
            topo = topo.getAnterior();
            System.out.println("Elemento Removido Com Sucesso!");
        }
    }
     
     
}