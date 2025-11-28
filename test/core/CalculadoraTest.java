package core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Teste da soma
    @Test
    void somaDeveFuncionar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(5, 7);

        assertEquals(12, resultado);
    }

    // Teste da subtração
    @Test
    void subtracaoDeveFuncionar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.subtrair(10, 4);

        assertEquals(6, resultado);
    }

    // Teste da multiplicação
    @Test
    void multiplicacaoDeveFuncionar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.multiplicar(3, 6);

        assertEquals(18, resultado);
    }

    // Teste da divisão
    @Test
    void divisaoDeveFuncionar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.dividir(20, 5);

        assertEquals(4, resultado);
    }

    // Testando divisão por zero (esperando exceção)
    @Test
    void deveFalharAoDividirPorZero() {
        Calculadora calc = new Calculadora();

        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}
