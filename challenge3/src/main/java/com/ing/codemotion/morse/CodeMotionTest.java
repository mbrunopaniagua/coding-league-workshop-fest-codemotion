package com.ing.codemotion.morse;

class CodeMotionTest {

    public static void main(String[] args) {

        final Morse sut = new Morse();

        System.out.println(sut.morseToText("-.-. --- -.. .. -. --. / .-.. . .- --. ..- . / .-. . .-.. --- .- -.. . -.. .-.-.- / -.. . ..."
            + " .- "
            + "..-. .. --- ... / -.. . / .--. .-. --- --. .-. .- -- .- -.-. .. --- -. / . -. / .- -.-. -.-. .. --- -."));
    }

}