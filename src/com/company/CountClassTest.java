package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountClassTest {
    private char[] letters;
    private int[] testCount;

    @BeforeEach
    void setUp() {
        letters = new char[]{'a', 'b', 'c'};
        testCount = new int[]{4, 5, 6};
    }

    @Test
    void countLetters() {
        CountClass countClass = new CountClass("AaAa BbBbB cCcCcC");
        countClass.countLetters();
        for (int i = 0; i < letters.length; i++) {
            Assertions.assertEquals(letters[i], countClass.alphabet[i]);
            Assertions.assertEquals(testCount[i], countClass.count[i]);
        }
    }
}