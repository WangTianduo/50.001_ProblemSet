package com.example.norman_lee.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //TODO 5.4 Write unit tests to check calculateExchangeRate

    @Test
    public void exhangeRateDefault() {
        assertEquals(2.95, ExchangeRate.calculateExchangeRate(), 1e-10);
    }

    @Test(expected = ArithmeticException.class)
    public void exchangeRate_Infinity() {
        ExchangeRate.calculateExchangeRate("1.0", "0.0");
    }

    @Test
    public void exchangeRate_Correct() {
        assertEquals(0.2, ExchangeRate.calculateExchangeRate("5.0", "1.0"), 1e-10);
    }

}