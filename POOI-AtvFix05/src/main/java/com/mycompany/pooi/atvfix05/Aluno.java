package com.mycompany.pooi.atvfix05;
import java.util.ArrayList;
import java.util.Scanner;


public class Aluno {

    private String nome;
    private int qtdProvas;
    static ArrayList<Double> notas = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    public Aluno(String nome, int qtdProvas){
        this.nome = nome;
        this.qtdProvas = qtdProvas;
        for (int i = 0; i < this.qtdProvas; i++){
            System.out.printf("Digite a nota da %dº prova do aluno: %n", i+1);
            notas.add(scanner.nextDouble());
        }
        
    }

    public void calcMedia(){
        int soma = 0;
        for (int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }
        double media = soma / notas.size();
        if (media >= 7){
            System.out.printf("O aluno %s passou de ano.%n", nome);
        }else{
            System.out.printf("O aluno %s não passou de ano.%n", nome);
        }
    }
}
