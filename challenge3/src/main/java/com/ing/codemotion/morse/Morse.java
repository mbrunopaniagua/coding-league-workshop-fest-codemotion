package com.ing.codemotion.morse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
        return Arrays.stream(morse.split(" / "))
            .map(word -> Arrays.stream(word.split(" "))
                .filter(reverseMorseMap::containsKey)
                .map(reverseMorseMap::get)
                .map(Object::toString)
                .collect(Collectors.joining()))
            .collect(Collectors.joining(" "))
            .toUpperCase()
            .trim();
    }

    public String textToMorse(String text) {
        String result = text.toUpperCase().chars()
            .mapToObj(c -> morseMap.getOrDefault((char) c, ""))
            .collect(Collectors.joining(" "));
        return result.trim();
    }

}