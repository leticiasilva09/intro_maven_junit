package com.exercicios.exercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateIPTest {

    @Test
    void validaIPsCorretos() {
        assertTrue(ValidateIP.validate("192.168.0.1"));
        assertTrue(ValidateIP.validate("255.255.255.255"));
        assertTrue(ValidateIP.validate("0.0.0.0"));
    }

    @Test
    void invalidaIPsErrados() {
        assertFalse(ValidateIP.validate("256.1.1.1"));
        assertFalse(ValidateIP.validate("192.168.1"));
        assertFalse(ValidateIP.validate("abc.def.ghi.jkl"));
        assertFalse(ValidateIP.validate("192.168.1.999"));
    }
}
