package com.mycompany.pooi.atvfix05;

public class POOIAtvFix05 {

    public static void main(String[] args) {
        //1)
        Pessoa p1 = new Pessoa("nometeste1", 111, "cidadeteste1");
        Pessoa p2 = new Pessoa("nometeste2", 222, "cidadeteste2");
        Pessoa p3 = new Pessoa("nometeste3", 333, "cidadeteste3");

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
        //2)
        ContaBancaria c1 = new ContaBancaria("titular1", 1000, 123456);
        ContaBancaria c2 = new ContaBancaria("titular2", 2000, 222333);

        //zz do more withdrawls and deposits
        c1.exibirSaldo();
        c1.depositarPara(c2, 1000);
        c2.exibirSaldo();
        //3)
        Carro car1 = new Carro("marca1", "modelo1", 2022, 90);
        Carro car2 = new Carro("marca1", "modelo2", 2024, 50);

        car1.acelerar(10);
        car2.acelerar(100);
        Carro.testeCorrida(car1, car2);
        car2.frear(200);
        Carro.testeCorrida(car1, car2);
        car2.acelerar(150);
        Carro.testeCorrida(car1, car2);
        //4)

        Aluno aluno1 = new Aluno("aluno1", 3);
        aluno1.calcMedia();
        Aluno aluno2 = new Aluno("aluno2", 2);
        aluno2.calcMedia();

    }

}
