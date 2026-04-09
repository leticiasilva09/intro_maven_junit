package com.exercicios.exercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalendarDayTest {

    @Test
    void retornaDiaCorreto() {
        String resultado = CalendarDay.findDay(8, 4, 2026);
        assertEquals("WEDNESDAY", resultado);
    }

    @Test
    void retornaDataInvalida() {
        String resultado = CalendarDay.findDay(30, 2, 2023);
        assertEquals("DATA_INVALIDA", resultado);
    }

    @Test
    void aceitaDataValidaEmAnoBissexto() {
        String resultado = CalendarDay.findDay(29, 2, 2024);
        assertEquals("THURSDAY", resultado);
    }

    @Test
    void rejeita29FevereiroAnoNaoBissexto() {
        String resultado = CalendarDay.findDay(29, 2, 2023);
        assertEquals("DATA_INVALIDA", resultado);
    }
}
