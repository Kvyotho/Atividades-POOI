package com.mycompany.pooi.atvfix05;
import java.util.ArrayList;

public class Biblioteca {
    
    static ArrayList<Livro> livros = new ArrayList<>();
    
    public void addLivro(Livro livro){
        if (livro == null){
            System.out.println("Esse livro não existe.");
        }else if (livro.disponivel == false){
            System.out.println("Este livro não está disponivel");
        }else{
        livros.add(livro);
        System.out.printf("O livro %s foi adicionado a biblioteca", livro);
    }
    }
    public void removerLivro(){
        
    }
    
    public void emprestarLivro(){
        
    }
    
    public void devolverLivro(){
        
    }
    
}
