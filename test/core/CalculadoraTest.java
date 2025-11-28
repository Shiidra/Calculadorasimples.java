import core.CalculadoraSimples;
import core.History;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void somaDeveFuncionar() {
        History history = new History();
        CalculadoraSimples calc = new CalculadoraSimples();

        String resultado = calc.calcular(1, 5, 7);

        assertEquals("5 + 7 = 12", resultado);
    }
}
