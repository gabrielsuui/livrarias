/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrarias.classes;



/**
 *
 * @author gabriel
 */
public class livros {
    
    private int id_livro;
    private String titulo;
    private int ano;
    private editoras editora;
    private autores autor;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public editoras getEditora() {
        return editora;
    }

    public void setEditora(editoras editora) {
        this.editora = editora;
    }

    public autores getAutor() {
        return autor;
    }

    public void setAutor(autores autor) {
        this.autor = autor;
    }
    
    

    @Override
    public String toString() {
        return getTitulo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
