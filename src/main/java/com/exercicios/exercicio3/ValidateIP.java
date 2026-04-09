package com.exercicios.exercicio3;

public class ValidateIP {

    public static boolean validate(String ip) {

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        return ip.matches(regex);
    }
}
