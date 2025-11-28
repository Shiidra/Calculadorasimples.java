package core;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraSimples {

    private final Calculator calculator; 
    private final History history;

    public CalculadoraSimples() {
        this.history = new History();
        this.calculator = new Calculator(history); 
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

            String resultado = calculator.calculate(opcao, a, b);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
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

