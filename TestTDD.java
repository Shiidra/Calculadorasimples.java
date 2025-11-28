package test;

import core.Calculator;
import core.History;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class History {

    @Test
    void somaDeveFuncionar() {
        History history = new History();
        Calculator calc = new Calculator(history);

        String resultado = calc.calculate(1, 5, 7);

        assertEquals("5 + 7 = 12", resultado);
    }
}

