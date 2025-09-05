package com.mycompany.pooi.atvfix05;
import java.util.ArrayList;

public class Produto {

    public String nome;
    public int preco;
    public int quantidade;
    static ArrayList<Produto> estoqueGeral = new ArrayList<>();
    
    
    public Produto(String nome, int preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        estoqueGeral.add(this);
    }
    
    public void totalProduto(){
        double soma = (preco * quantidade);
        System.out.printf("Valor total do estoque do produto: %.2f%n", soma);
    }
    
    public void totalEstoque(){
        double somatotal = 0;
        for (Produto p: estoqueGeral){
        somatotal += (p.preco*p.quantidade);
        }
        System.out.printf("Valor total do estoque geral: %.2f%n", somatotal);
    }
}
