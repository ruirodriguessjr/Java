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
public class Livro {
    
    // Atributos
    private String titulo;
    private String autor;
    private int isbn;

    
    // Método Construtor

    public Livro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
           
    
    // Métodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return isbn;
    }

    public void setCodigo(int codigo) {
        this.isbn = codigo;
    }

    @Override
    public String toString() {
        return "Livro{" + "Titulo = " + titulo + ",\n Autor = " + autor + ",\n Isbn = " + isbn + '}';
    }
    
    
    
    
    
}
