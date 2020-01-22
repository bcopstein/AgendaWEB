package com.bcopstein;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CidadeTest {
    
    @BeforeEach
    public void setup() {
    }

    @Disabled
    @DisplayName("Classifica pontos")
    @ParameterizedTest
    @CsvSource({ "3,9,8,3,3","3,6,3,3,2","6,1,8,1,1","11,1,13,1,0"})
    public void rotaTest(int x1,int y1,int x2,int y2,int rEsp) {
    }    
}