package core;

import java.util.List;
import java.util.Scanner;

public class CalculadoraRefatorada {

    private final History history;

    public CalculadoraRefatorada() {
        this.history = new History();
    }

    public static void main(String[] args) {
        CalculadoraRefatorada app = new CalculadoraRefatorada();
        app.runCli();
    }

    public void runCli() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int option = readInt(scanner);
            if (option == 0) {
                System.out.println("Encerrando...");
                break;
            }
            if (option == 5) {
                printHistory();
                continue;
            }

            System.out.print("Primeiro número: ");
            int a = readInt(scanner);
            System.out.print("Segundo número: ");
            int b = readInt(scanner);

            String result = calculate(option, a, b);
            System.out.println("Resultado: " + result);
            history.add(result);
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n=== Calculadora Refatorada ===");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Ver histórico");
        System.out.println("0. Sair");
        System.out.print("Escolha a opção: ");
    }

    private int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void printHistory() {
        List<String> all = history.getAll();
        if (all.isEmpty()) {
            System.out.println("Nenhuma operação realizada.");
            return;
        }
        System.out.println("\n--- Histórico ---");
        for (String entry : all) {
            System.out.println(entry);
        }
    }
    
    public String calculate(int option, int a, int b) {
        switch (option) {
            case 1:
                return format(a, "+", b, a + b);
            case 2:
                return format(a, "-", b, a - b);
            case 3:
                return format(a, "*", b, a * b);
            case 4:
                if (b == 0) {
                    return "Erro: divisão por zero!";
                }
                return format(a, "/", b, a / b);
            default:
                return "Opção inválida!";
        }
    }

    private String format(int a, String op, int b, int result) {
        return a + " " + op + " " + b + " = " + result;
    }

    public List<String> getHistory() {
        return history.getAll();
    }
}
