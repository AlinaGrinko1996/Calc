package ua.nure.hrynko;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class CalcTest {
    private Calc calc;

    @Test
    public void results() {
        assertTrue(calc.Add(10.0, 2.0) == 12);
        assertTrue(calc.Sub(10.0, 2.0) == 8);
        assertTrue(calc.Div(10.0, 2.0) == 5);
        assertTrue(calc.Mult(10.0, 2.0) == 20);
    }
}
