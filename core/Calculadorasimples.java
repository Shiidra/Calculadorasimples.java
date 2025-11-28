package core;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraSimples {

    private final ArrayList<String> historico = new ArrayList<>();
    private Scanner sc; 

    public CalculadoraSimples() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        CalculadoraSimples app = new CalculadoraSimples();
        app.startProgram(); 
    }

    public void startProgram() {
        while (true) {
            mostrarMenu();
            int opt = 0;
            try {
                opt = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
                sc.next(); 
                continue;
            }

            if (opt == 0) {
                System.out.println("Saindo...");
                break;
            }

            if (opt == 5) {
                MostrarHistorico();
                continue;
            }

            System.out.print("Informe primeiro numero: ");
            int n1 = sc.nextInt();

            System.out.print("Informe segundo numero: ");
            int n2 = sc.nextInt();

            if (opt == 1) {
                String r = n1 + " + " + n2 + " = " + (n1 + n2);
                System.out.println("Resultado: " + r);
                historico.add(r);
            } else if (opt == 2) {
                String res = n1 + " - " + n2 + " = " + (n1 - n2);
                System.out.println("Resultado: " + res);
                historico.add(res);
            } else if (opt == 3) {
                int mul = n1 * n2;
                System.out.println("Multiplicacao => " + n1 + " * " + n2 + " = " + mul);
                historico.add(n1 + " * " + n2 + " = " + mul);
            } else if (opt == 4) {
                if (n2 == 0) {
                    System.out.println("Nao pode dividir por zero!");
                    historico.add("Tentativa de dividir " + n1 + " por 0");
                } else {
                    int div = n1 / n2;
                    System.out.println("Divisao: " + n1 + "/" + n2 + " = " + div);
                    historico.add(n1 + " / " + n2 + " = " + div);
                }
            } else {
                System.out.println("Opcao invalida! (legacy)");
            }
        } 

        sc.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menu da Calculadora (LEGADO) ---");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Historico");
        System.out.println("0 - Sair");
