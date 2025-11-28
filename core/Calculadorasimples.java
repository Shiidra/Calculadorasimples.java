import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> historico = new ArrayList<>();
        int opcao;

        while (true) {
            mostrarMenu();
            opcao = lerInteiro(scanner);

            if (opcao == 0) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            if (opcao == 5) { // opção para ver histórico
                mostrarHistorico(historico);
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double a = lerDouble(scanner);
            System.out.print("Digite o segundo número: ");
            double b = lerDouble(scanner);

            String resultado = executarOperacao(opcao, a, b);
            if (resultado != null) {
                System.out.println("Resultado: " + resultado);
                historico.add(resultado);
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Calculadora Simples ===");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Ver histórico");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static String executarOperacao(int opcao, double a, double b) {
        switch (opcao) {
            case 1:
                return a + " + " + b + " = " + (a + b);
            case 2:
                return a + " - " + b + " = " + (a - b);
            case 3:
                return a + " * " + b + " = " + (a * b);
            case 4:
                if (b == 0) {
                    System.out.println("Erro: divisão por zero não permitida!");
                    return null;
                }
                return a + " / " + b + " = " + (a / b);
            default:
                System.out.println("Opção inválida.");
                return null;
        }
    }

    private static void mostrarHistorico(ArrayList<String> historico) {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
        } else {
            System.out.println("\n=== Histórico de Operações ===");
            for (String h : historico) {
                System.out.println(h);
            }
        }
    }

    private static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Valor inválido. Digite um número inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double lerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
