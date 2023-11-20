package com.ing.codemotion.morse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MorseTest {

    private final Morse sut = new Morse();

    @Test
    void translateRegularToMorse() {
        String expected = ".... --- .-.. .- / -- ..- -. -.. ---";

        String actual = sut.textToMorse("HOLA MUNDO");

        assertEquals(expected, actual);
    }

    @Test
    void translateATextWithNumbersToMorse() {
        String expected = "... --- -- --- ... / ..- -. .- ... / ....- ..... / .--. . .-. ... --- -. .- ...";

        String actual = sut.textToMorse("SOMOS UNAS 45 PERSONAS");

        assertEquals(expected, actual);
    }

    @Test
    void translateATextWithSymbolsToMorse() {
        String expected = "--...- -- .. / . -- .- .. .-.. / . ... / .--. . .--. . .--.-. .. -. --. .-.-.- -.-. --- -- -.-.--";

        String actual = sut.textToMorse("¡MI EMAIL ES PEPE@ING.COM!");

        assertEquals(expected, actual);
    }

    @Test
    void translateAMorseRegularText() {
        String expected = "HOLA MUNDO";

        String actual = sut.morseToText(".... --- .-.. .- / -- ..- -. -.. ---");

        assertEquals(expected, actual);
    }

    @Test
    void translateMorseToTextWithNumbers() {
        String expected = "SOMOS UNAS 45 PERSONAS";

        String actual = sut.morseToText("... --- -- --- ... / ..- -. .- ... / ....- ..... / .--. . .-. ... --- -. .- ...");

        assertEquals(expected, actual);
    }

    @Test
    void translateMorseToTextWithSymbols() {
        String expected = "¡MI EMAIL ES PEPE@ING.COM!";

        String actual = sut.morseToText("--...- -- .. / . -- .- .. .-.. / . ... / .--. . .--. . .--.-. .. -. --. .-.-.- -.-. --- -- -.-"
            + ".--");

        assertEquals(expected, actual);
    }

}