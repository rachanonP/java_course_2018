package com.example.demo;

import com.example.demo.div.Div;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.fail;

public class DivTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void shouldThrowException3() {
        Div div = new Div();
        // ดัก exception บรรทัดต่อไปว่าต้องเกิด
        expected.expect(ArithmeticException.class);
        div.process(1, 0);

    }

    // เขียนดักบน @Test ว่าโค้ดต้องเกิด exception
    @Test(expected = ArithmeticException.class)
    public void shouldThrowException2() {
        Div div = new Div();
        div.process(1, 0);

    }

    @Test
    public void shouldThrowException() {
        // exception ภายใรโค้ด
        Div div = new Div();
        try {
            div.process(1, 0);
            fail("Should not be here!!");
        } catch (ArithmeticException e) {

        }
    }
}
