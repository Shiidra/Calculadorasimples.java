package test;

import core.Calculator;
import core.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoryTest {

    @Test
    public void somaDeveFuncionar() {
        History history = new History();
        Calculator calc = new Calculator(history);

        String resultado = calc.calculate(1, 5, 7);

        assertEquals("5 + 7 = 12", resultado);
    }
}
