package com.contamagica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TesteContaMagica{
    private ContaMagica c;

    @BeforeEach
    public void setup(){
        c = new ContaMagica();
    }

    @DisplayName("Teste de depósito")
    @ParameterizedTest
    @CsvSource({"1000.0,0","50100.0,1","200100.0,2"})
    public void testeStatus(double val, int rEsp){
        c.deposito(val);
        int rObs = c.getStatus();
        assertEquals(rObs, rEsp);
    }

    @DisplayName("Teste de retirada")
    @ParameterizedTest
    @CsvSource({"1000.0,0","50100.0,1","200100.0,2"})
    public void testeRetirada(double val, int rEsp){
        c.retirada(val);
        int rObs = c.getStatus();
        assertEquals(rObs, rEsp);
    }
}