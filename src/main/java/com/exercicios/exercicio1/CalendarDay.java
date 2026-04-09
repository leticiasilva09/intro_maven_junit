package com.exercicios.exercicio1;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class CalendarDay {

    public static String findDay(int day, int month, int year) {
        try {
            LocalDate data = LocalDate.of(year, month, day);
            DayOfWeek diaSemana = data.getDayOfWeek();
            return diaSemana.toString();

        } catch (Exception e) {
            return "DATA_INVALIDA";
        }
    }
}
