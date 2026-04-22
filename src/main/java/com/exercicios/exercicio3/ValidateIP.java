package com.exercicios.exercicio3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateIP {

    private static final String REGEX_IP =
        "^(25[0-5]|2[0-4]\\d|1\\d\\d|\\d{1,2})(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|\\d{1,2})){3}$";

    public static boolean validate(String ip) {

        Pattern pattern = Pattern.compile(REGEX_IP);
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }
}
