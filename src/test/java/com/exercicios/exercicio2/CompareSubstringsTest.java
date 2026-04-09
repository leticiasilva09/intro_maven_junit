package com.exercicios.exercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareSubstringsTest {

    @Test
    void retornaMenorEMaiorSubstring() {
        String resultado = CompareSubstrings.getSmallestAndLargest("welcometojava", 3);

        assertEquals("ava\nwel", resultado);
    }
}
