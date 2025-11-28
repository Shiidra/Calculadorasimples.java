package core;

// Essa é a versão refatorada da calculadora.
// Agora cada parte faz só o que precisa fazer.
public class Calculadora {

    // Método só para somar.
    // Antes tudo estava dentro de um método só.
    public int somar(int a, int b) {
        return a + b;
    }

    // Método só para subtrair.
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método só para multiplicar.
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Na versão simples não tinha isso e podia dar problema com divisão por zero.
    public int dividir(int a, int b) {

        if (b == 0) {
            // Aqui retorno uma exceção porque não dá para dividir por zero.
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }

        return a / b;
    }
}
