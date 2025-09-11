package com.mycompany.pooi.atvfix05;

public class Retangulo {

    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public int calcArea(){
        int area = largura*altura;
        System.out.printf("A área do retangulo é %d%n", area);
        return area;
    }
    
    public void calcPerimetro(){
        int perimetro = (largura + altura)*2;
        System.out.printf("O perimetro do retangulo é: %d%n", perimetro);
    }

    public void compararRetangulo(Retangulo r1, Retangulo r2){
        if (r1.calcArea() > r2.calcArea()){
            System.out.printf("O retangulo 1 tem maior área.");
        }else{
            System.out.printf("O retangulo 2 tem maior área.");
        }
    }
}

