package com.ing.codemotion.rnatranscription;

import java.util.stream.Collectors;

public class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(this::getRnaComplement)
                .collect(Collectors.joining());
    }

    private String getRnaComplement(String dnaStrand) {
        return switch (dnaStrand) {
            case "G" -> "C";
            case "C" -> "G";
            case "T" -> "A";
            case "A" -> "U";
            default -> "";
        };
    }
}
