package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {
    public void ex1() {
        int num1;
        int num2;
        int rest;

        System.out.println("digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Digite outro número; ");
        num2 = sc.nextInt();

        rest = num1 + num2;

        System.out.println("A soma dos números é: " + rest);

    }

    public void ex2() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + "!");
    }

    public void ex3() {
        Scanner sc = new Scanner(System.in);
        Double ValorDigitadoEmreais;
        Double ValorConvertidoParaDolar;
        Double TaxaDeConversao = 5.25;

        System.out.println("Digite um valor em reais para converter em dólar ");
        ValorDigitadoEmreais = sc.nextDouble();

        ValorConvertidoParaDolar = ValorDigitadoEmreais / TaxaDeConversao;

        System.out.println("O valor em dólar é: $" + ValorConvertidoParaDolar);

    }



    public void ex4() {
        Scanner sc = new Scanner(System.in);
        int NumeroDigitado;
        int Antecessor;
        int Sucessor;

        System.out.println("Digite um número para saber seu antecessor e sucessor");
        NumeroDigitado = sc.nextInt();

        Antecessor = NumeroDigitado - 1;
        Sucessor = NumeroDigitado + 1;
        System.out.println("O sucessor de " + NumeroDigitado + "é" + Sucessor + "e seu antecessor é " + Antecessor);

    }

    public void ex5() {
        Scanner sc = new Scanner(System.in);
        int larguraTerreno;
        int comprimentoTerreno;
        int area;
        int valorDoM2;

        System.out.println("Qual a largura do terreno em metros?");
        larguraTerreno = sc.nextInt();
        System.out.println("Qual o comprimento do terreno em metros?");
        comprimentoTerreno = sc.nextInt();

        area = larguraTerreno * comprimentoTerreno;

        System.out.println("Qual o valor deo m2 na região em R$?");
        valorDoM2 = sc.nextInt();
        System.out.println("O valor total do terreno é: R$" + valorDoM2 * +area);

    }

    public void ex6() {
        Scanner sc = new Scanner(System.in);
        int DistanciaPercorrida;
        int CustoTotalCombustivel;
        double CustoLitro = 5.25;

        System.out.println("Qual a distancia pecorrida?");
        DistanciaPercorrida = sc.nextInt();
        System.out.println("qual o custo de combustível?");
        CustoTotalCombustivel = sc.nextInt();

        System.out
                .println("Sua autonomia foi de:" + DistanciaPercorrida / +CustoTotalCombustivel / +CustoLitro + "Km/l");
    }

    public void ex7() {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Digite a nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3");
        nota3 = sc.nextDouble();
        System.out.println("Digite a nota 4");
        nota4 = sc.nextDouble();

        media = nota1 + nota2 + nota3 + nota4 / 4;
        System.out.println("A média do aluno foi" + media);

    }

    public void ex8() {
        Scanner sc = new Scanner(System.in);
        double TemperaturaEmFahrenheit;
        double TemperaturaEmCelsius;

        System.out.println("Digite a temperatura em Fahrenheit");
        TemperaturaEmFahrenheit = sc.nextDouble();
        TemperaturaEmCelsius = TemperaturaEmFahrenheit - 32 / 1.8;

        System.out.println(+TemperaturaEmFahrenheit + "oF corresponde a " + TemperaturaEmCelsius + "oC");
    }

}
