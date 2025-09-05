package com.mycompany.pooi.atvfix05;

public class POOIAtvFix05 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("nometeste1", 111, "cidadeteste1");
        Pessoa p2 = new Pessoa("nometeste2", 222, "cidadeteste2");
        Pessoa p3 = new Pessoa("nometeste3", 333, "cidadeteste3");

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();

        ContaBancaria c1 = new ContaBancaria("titular1", 1000, 123456);
        ContaBancaria c2 = new ContaBancaria("titular2", 2000, 222333);
        
        //zz do more withdrawls and deposits
        c1.exibirSaldo();
        c1.depositarPara(c2, 1000);
        c2.exibirSaldo();
    }
}
