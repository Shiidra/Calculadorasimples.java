package core;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraSimples {

    private final History history;

    public CalculadoraSimples() {
        this.history = new History();
    }

    public static void main(String[] args) {
        new CalculadoraSimples().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            mostrarMenu();
            opcao = lerInteiro(scanner);

            if (opcao == 0) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            if (opcao == 5) {
                mostrarHistorico();
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            int a = lerInteiro(scanner);

            System.out.print("Digite o segundo número: ");
            int b = lerInteiro(scanner);

            String resultado = executarOperacao(opcao, a, b);

            if (resultado != null) {
                System.out.println("Resultado: " + resultado);
                history.add(resultado);
            }
        }

        scanner.close();
    }

    private String executarOperacao(int opcao, int a, int b) {

        return switch (opcao) {
            case 1 -> a + " + " + b + " = " + (a + b);
            case 2 -> a + " - " + b + " = " + (a - b);
            case 3 -> a + " * " + b + " = " + (a * b);
            case 4 -> {
                if (b == 0) {
                    System.out.println("Erro: divisão por zero não permitida!");
                    yield null;
                }
                yield a + " / " + b + " = " + (a / b);
            }
            default -> {
                System.out.println("Opção inválida.");
                yield null;
            }
        };
    }

    private void mostrarMenu() {
        System.out.println("\n=== Calculadora Simples ===");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Ver histórico");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void mostrarHistorico() {
        ArrayList<String> lista = history.getAll();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
            return;
        }

        System.out.println("\n=== Histórico de Operações ===");
        for (String h : lista) {
            System.out.println(h);
        }
    }

    private int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Valor inválido. Digite um número inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
