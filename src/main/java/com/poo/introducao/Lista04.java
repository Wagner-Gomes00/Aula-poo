package com.poo.introducao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lista04 {
    public void FechamentoDeVendas() {
        // ex1,ex2,ex3
        double[] vendasDoDia = { 35.02, 100.5, 89.60, 850, 10 };

        double somaDasVendas = 0.0;
        double menorValor = vendasDoDia[0];
        double maiorValor = vendasDoDia[0];

        for (double venda : vendasDoDia) {

            somaDasVendas += venda;

            if (venda < menorValor) {
                menorValor = venda;
            }

            if (venda > maiorValor) {
                maiorValor = venda;
            }
        }

        double valorMedio = somaDasVendas / vendasDoDia.length;

        System.out.println("Fechamento das vendas do dia: R$ " + somaDasVendas);
        System.out.println("Compra de menor valor: R$ " + menorValor);
        System.out.println("Compra de maior valor: R$ " + maiorValor);
        System.out.println("Valor médio dos ticket: R$ " + valorMedio);
    }

    public void ContadorDenumeroPares() {
        // ex4
        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int contadorPares = 0;

        for (int numero : lista) {

            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println(" Os números pares na lista: " + contadorPares);
    }

    public static void ListaDeCompras() {
        ArrayList<ItemDeCompra> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // ex5
            System.out.println("||==============||");
            System.out.println("||     MENU     ||");
            System.out.println("||==============||");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista");
            System.out.println("3. Remover item");
            System.out.println("4. Imprimir por ordem de preço (crescente)");
            System.out.println("5. Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Digite o nome do item: ");
                    String itemNome = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double itemPreco = scanner.nextDouble();
                    scanner.nextLine();
                    listaDeCompras.add(new ItemDeCompra(itemNome, itemPreco));
                    System.out.println("Item adicionado!");
                    break;

                case 2:

                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i).getNome(),
                                listaDeCompras.get(i).getPreco());
                    }
                    break;

                case 3:
                    // ex6
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i).getNome(),
                                listaDeCompras.get(i).getPreco());
                    }
                    System.out.print("Digite o número do item que deseja remover: ");
                    int numeroItem = scanner.nextInt();
                    scanner.nextLine();
                    if (numeroItem > 0 && numeroItem <= listaDeCompras.size()) {
                        listaDeCompras.remove(numeroItem - 1);
                        System.out.println("Item removido!");
                    } else {
                        System.out.println("Número do item inválido.");
                    }
                    break;

                case 4:
                    // ex8
                    Collections.sort(listaDeCompras, Comparator.comparingDouble(ItemDeCompra::getPreco));
                    System.out.println("Lista de Compras (Ordenada por Preço Crescente):");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i).getNome(),
                                listaDeCompras.get(i).getPreco());
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 5);

        scanner.close();
    }
}

class ItemDeCompra {
    private String nome;
    private double preco;

    public ItemDeCompra(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
