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
public class Lista_Contato {
    static private Contato head, tail;

    public Lista_Contato() {
        head = tail = null;
        System.out.println("Lista Criada com Sucesso. ");
    }
    
    
    private static boolean vazia(){ // Método verificando se está vazia!
        if ((head == null) && (tail == null)) {
            return (true); // Está Vazia
        }else{
            return (false); // Existe algum elemento na Lista
        }
    }
 
    
    
    public static void print(){
        if (vazia()) {
            System.out.println("Impossível Imprimir. Lista de Contatos Vazia!");
        }else{
            Contato aux = head;
            System.out.println("Os dados dos Contatos são:");
            do{
                System.out.println(aux.toString());
                aux = aux.getProximo();
            }while(aux != null);
            
        }
        
    }
    
    // Entrada de Dados
    // Ordenação da Lista é por Ordem Alfabética.
    public static void push(Contato novo_contato){        
        if (vazia()) {
            head = novo_contato;
            tail = novo_contato;
        }else{
            // Se for antes do primeiro inserido
            if (head.getNome().compareTo(novo_contato.getNome()) >= 0) { // Comparando se o contato que está sendo inserido 
                novo_contato.setProximo(head);                           //  é menor que o que já está apontado pelo aux
                head = novo_contato;
                
            }else{
                // Inserir após o último elemento
                if(tail.getNome().compareTo(novo_contato.getNome())<0) {
                    
                    tail.setProximo(novo_contato);
                    tail = novo_contato;
                }else{
                 
                    // No meio da Lista
                    Contato aux = head;
                    Contato ant;
                    do{
                        ant = aux;
                        aux = aux.getProximo();

                        if (aux.getNome().compareTo(novo_contato.getNome()) >= 0) {  // Comparando se o contato que está sendo inserido 
                            ant.setProximo(novo_contato);                            //  é menor que o que já está apontado pelo aux
                            novo_contato.setProximo(aux);
                            break;

                        }
                    }while(true);
                }
            }
        }
    }
    
    
    
    
    
}
