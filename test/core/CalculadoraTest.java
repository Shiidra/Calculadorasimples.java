import core.CalculadoraRefatorada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void somaDeveFuncionar() {
        CalculadoraRefatorada calc = new CalculadoraRefatorada();
        String resultado = calc.calculate(1, 5, 7);
        assertEquals("5 + 7 = 12", resultado);
    }
}
