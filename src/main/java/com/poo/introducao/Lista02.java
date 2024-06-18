package com.poo.introducao;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Lista02 {
    public void exec1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("O número digitado é 0.");
        }

        else if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }

    }

    public void exec2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número(" + numero2 + ")é maior que o primeiro número(" + numero1 + ").");
        } else {
            System.out.println("Os dois números sao iguais");
        }

    }

    public void exec3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Voce é deficiente? (sim/não) ");
        String deficiente = scanner.next();

        System.out.println("Você é gestante? (sim/não) ");
        String gestante = scanner.next();

        boolean filapreferencial = false;

        if (idade > 65 || deficiente.equalsIgnoreCase("sim") || gestante.equalsIgnoreCase("sim")) {
            filapreferencial = true;
        }

        if (filapreferencial) {
            System.out.println("você deve ir para a fila preferencial. ");
        } else {
            System.out.println("Voce deve ir para a fila comum. ");
        }
    }

    public void exec4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode entrar no evento. ");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("você está acompanhado pelos responsáveis? (sim/não) ");
            String acompanhado = scanner.next();

            if (acompanhado.equalsIgnoreCase("sim")) {
                System.out.println("Você pode entrar no evento. ");
            } else {
                System.out.println("você não pode entrar no evento sem estar acompanhado pelos responsáveis ");

            }
        } else {
            System.out.println("Você pode entra no evento ");
        }
    }

    public void exec5() {
        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "wagner";
        String senhaCorreta = "w1234567";

        System.out.println("Login: ");
        String login = scanner.nextLine();

        System.out.println("Senha");
        String senha = scanner.nextLine();

        boolean loginCorretoFlag = login.equals(loginCorreto);
        boolean senhaCorretaFlag = senha.equals(senhaCorreta);

        if (loginCorretoFlag && senhaCorretaFlag) {
            System.out.println("Login e senha corretos. bem vindo ");
        } else {
            if (!loginCorretoFlag) {
                System.out.println("Login ou senha incorreto ");

            }
            if (!senhaCorretaFlag) {
                System.out.println("Login ou senha incorreto ");
            }
        }

    }

    public void exec6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aluno aprovado com média " + media);
        } else {

            System.out.print("Digite a nota de recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            if (nota1 < nota2) {
                nota1 = notaRecuperacao;
            } else {
                nota2 = notaRecuperacao;
            }

            media = (nota1 + nota2) / 2;

            if (media >= 6) {
                System.out.println("Aluno aprovado após recuperação com média " + media);
            } else {
                System.out.println("Aluno reprovado com média " + media);
            }
        }
    }

    public void exec7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número a ser verificado: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor não pode ser zero.");
        } else if (numero % divisor == 0) {
            System.out.println("O número " + numero + " é divisível por " + divisor + ".");
        } else {
            System.out.println("O número " + numero + " não é divisível por " + divisor + ".");
        }

    }

    public void exec8() {
        
        Scanner scanner = new Scanner(System.in);
        int erros = 0;
        int acertos = 0;

        
        String[][] perguntas = {
            {"Em que ano foi fundado o Club de Regatas Vasco da Gama?", "a) 1898", "b) 1903", "c) 1912", "d) 1898", "a"},
            {"Qual estádio é a casa do Vasco da Gama?", "a) Maracanã", "b) Engenhão", "c) São Januário", "d) Pacaembu", "c"},
            {"Qual é o mascote do Vasco da Gama?", "a) Urubu", "b) Galo", "c) Almirante", "d) Raposa", "c"},
            {"Quantos títulos do Campeonato Brasileiro o Vasco da Gama possui?", "a) 2", "b) 3", "c) 4", "d) 5", "c"},
            {"Em que ano o Vasco da Gama conquistou a Libertadores da América?", "a) 1995", "b) 1998", "c) 2000", "d) 2001", "b"}
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(perguntas[i][j]);
            }

            System.out.print("Digite a sua resposta: ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase(perguntas[i][5])) {
                acertos++;
                System.out.println("Resposta correta!\n");
            } else {
                erros++;
                System.out.println("Resposta incorreta.\n");
                if (erros == 3) {
                    System.out.println("Você errou 3 vezes. Fim de jogo.");
                    break;
                }
            }
        }

        if (erros < 3) {
            System.out.println("Parabéns! Você completou o jogo.");
        }

        System.out.println("Número de acertos: " + acertos);
    }

        
}



