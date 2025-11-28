package core;

// Essa classe é a versão "simples" da calculadora.
// que vamos refatorar depois. Mantive como estava para mostrar o antes.
public class CalculadoraSimples {

    public String calcular(int operacao, int a, int b) {

        // Isso é confuso porque 1, 2, 3 e 4 não explicam nada sozinhos.
        if (operacao == 1) { 
            int resultado = a + b;
            return a + " + " + b + " = " + resultado;

        } else if (operacao == 2) {
            int resultado = a - b;
            return a + " - " + b + " = " + resultado;

        } else if (operacao == 3) {
            int resultado = a * b;
            return a + " * " + b + " = " + resultado;

        } else if (operacao == 4) {

            // Aqui não tem tratamento de divisão por zero,
            // então se b for 0 o programa quebra.
            int resultado = a / b;
            return a + " / " + b + " = " + resultado;
        }

        return "Operação inválida";
    }
}
