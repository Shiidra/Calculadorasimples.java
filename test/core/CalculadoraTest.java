import core.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Esse é o teste que garante que a soma funciona.
public class CalculadoraTest {

    @Test
    void somaDeveFuncionar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(5, 7);

        assertEquals(12, resultado);
    }
}
