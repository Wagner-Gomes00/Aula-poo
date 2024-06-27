package com.poo.introducao;

import java.util.Scanner;
import java.util.*;
import javax.sound.sampled.SourceDataLine;

public class Lista03 {
    public void exerci1() {
        Scanner scanner = new Scanner(System.in);
        int segundos = 0;

        System.out.println("Digite um numero entre 1 e 59:");
        while (true)
            try {
                segundos = Integer.parseInt(scanner.nextLine());
                if (segundos >= 1 && segundos <= 59) {
                    break;
                } else {
                    System.out.println("Número inválido. Digite um número entre 1 e 59:");

                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número valido:");

            }
        System.out.println("Contagem iniciada para " + segundos + "segundos...");
        try {
            for (int i = segundos; i > 0; i--) {
                System.out.println("Faltam" + i + " segundos...");
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo esgotado!");

    }

    void exerci2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next();
            System.out.print("Digite um número para ver a tabuada: ");
        }

        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    void exerci3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next();
            System.out.print("Digite o primeiro número inteiro: ");
        }
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next();
            System.out.print("Digite o segundo número inteiro: ");
        }
        int segundoNumero = scanner.nextInt();

        int inicio = Math.min(primeiroNumero, segundoNumero);
        int fim = Math.max(primeiroNumero, segundoNumero);

        System.out.println("Números pares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    void exerci4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pessoa 1, escolha um número (entre 1 e 10): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next();
            System.out.print("Pessoa 1, escolha um número (entre 1 e 10): ");
        }
        int numeroEscolhido = scanner.nextInt();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Pessoa 2, tente adivinhar o número escolhido.");
        int tentativa;
        while (true) {
            System.out.print("Digite sua tentativa: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.next();
                System.out.print("Digite sua tentativa: ");
            }
            tentativa = scanner.nextInt();

            if (tentativa == numeroEscolhido) {
                System.out.println("Parabéns! Você adivinhou o número.");
                break;
            } else if (Math.abs(tentativa - numeroEscolhido) <= 2) {
                System.out.println("Quase lá!");
            } else if (tentativa < numeroEscolhido) {
                System.out.println("Muito baixo.");
            } else {
                System.out.println("Muito alto.");
            }
        }
    }

    void exerci5() {
        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "wagner";
        String senhaCorreta = "w1234567";

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite seu login: ");
            String login = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Número de tentativas excedido.");
                } else {
                    if (!login.equals(loginCorreto)) {
                        System.out.println("Login incorreto.");
                    }
                    if (!senha.equals(senhaCorreta)) {
                        System.out.println("Senha incorreta.");
                    }
                    if (tentativasRestantes == 1) {
                        System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                    } else {
                        System.out.println("Você tem " + tentativasRestantes + " tentativas restantes.");
                    }
                }
            }
        }
    }

    void exerci6(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de andares da pirâmide: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next(); 
            System.out.print("Digite o número de andares da pirâmide: ");
        }
        int numeroAndares = scanner.nextInt();

        
        for (int i = 1; i <= numeroAndares; i++) {
            
            for (int j = 1; j <= numeroAndares - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    void exerci7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo (em asteriscos): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next(); 
            System.out.print("Digite a largura do retângulo (em asteriscos): ");
        }
        int largura = scanner.nextInt();

        System.out.print("Digite a altura do retângulo (em asteriscos): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.next(); 
            System.out.print("Digite a altura do retângulo (em asteriscos): ");
        }
        int altura = scanner.nextInt();

       
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

    }

}
