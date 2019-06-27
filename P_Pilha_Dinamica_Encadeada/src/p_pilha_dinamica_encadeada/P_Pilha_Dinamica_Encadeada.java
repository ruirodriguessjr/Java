/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_pilha_dinamica_encadeada;
 
import java.util.Scanner;

/**
 *
* @author Rui Rodrigues
 */
public class P_Pilha_Dinamica_Encadeada{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha_Jogos mpj = new Pilha_Jogos();
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int opcao = 0;
        
        do{
            System.out.println("");
            System.out.println("PILHA DINÂMICA!!!");
            System.out.println("[1] - Inserir Jogo");
            System.out.println("[2] - Remover Jogo");
            System.out.println("[3] - Imprimir Jogo");
            System.out.println("[4] - Quantidade Cadastrado");
            System.out.println("[5] - Busca Por Nome");
            System.out.println("[0] - Sair");
            System.out.print("Informe A Opção Desejada: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    mpj.push(ler_jogo());
                    contador++;
                    break;
                case 2:
                    mpj.pop();
                    break;
                case 3:
                    mpj.print();
                    break;
                case 4:
                    System.out.println("O total cadastrado foi: " + mpj.pegaQtd());
                    break;
                case 5:
                    System.out.println("Informe o jogo a ser Encontrado: ");
                    String game = scan.next();
                    System.out.println(mpj.encontraJogo(game));
                    break;
                case 0:
                    System.out.println(">>>> Fim <<<<");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while(opcao != 0);      

        
    }
    
    public static Jogo ler_jogo(){
        int id;
        String nome, genero;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme os dados do NOVO JOGO:");
        System.out.print("ID:");
        id = sc.nextInt();
        System.out.print("NOME:");
        nome = sc.next();
        System.out.print("GENERO:");
        genero = sc.next();
        return (new Jogo(id, nome, genero));
    }
     
}

