package com.example.ewgengabruskiy.mycalc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mathTest {
    @Test
    public void multiply_isCorrect() {
        assertEquals(21.0,MainActivity.multiply(7,3),0.1);

    }
}
