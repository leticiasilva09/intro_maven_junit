package com.exercicios.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareSubstrings {

    public static String getSmallestAndLargest(String s, int k) {

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }

        Collections.sort(substrings);

        String menor = substrings.get(0);
        String maior = substrings.get(substrings.size() - 1);

        return menor + "\n" + maior;
    }
}
