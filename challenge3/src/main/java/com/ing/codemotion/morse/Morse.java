package com.ing.codemotion.morse;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    private static final Map<Character, String> morseMap = new HashMap<>();

    static {
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        morseMap.put('0', "-----");
        morseMap.put('.', ".-.-.-");
        morseMap.put(',', "--..--");
        morseMap.put('?', "..--..");
        morseMap.put('!', "-.-.--");
        morseMap.put('/', "-..-.");
        morseMap.put('(', "-.--.");
        morseMap.put(')', "-.--.-");
        morseMap.put('&', ".-...");
        morseMap.put(':', "---...");
        morseMap.put(';', "-.-.-.");
        morseMap.put('=', "-...-");
        morseMap.put('-', "-....-");
        morseMap.put('_', "..--.-");
        morseMap.put('+', ".-.-.");
        morseMap.put('$', "...-..-");
        morseMap.put('@', ".--.-.");
        morseMap.put(' ', "/");
        morseMap.put('¡', "--...-");
    }

    private static final Map<String, Character> reverseMorseMap = new HashMap<>();

    static {
        morseMap.forEach((key, value) -> reverseMorseMap.put(value, key));
    }


    public String morseToText(String morse) {
        StringBuilder builder = new StringBuilder();
        for (String word : morse.split(" / ")) {
            for (String letter : word.split(" ")) {
                if (reverseMorseMap.containsKey(letter)) {
                    builder.append(reverseMorseMap.get(letter));
                }
            }
            builder.append(" ");
        }
        return builder.toString().toUpperCase().trim();
    }

    public String textToMorse(String text) {
        StringBuilder builder = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (morseMap.containsKey(c)) {
                builder.append(morseMap.get(c)).append(" ");
            }
        }
        return builder.toString().trim();
    }

}