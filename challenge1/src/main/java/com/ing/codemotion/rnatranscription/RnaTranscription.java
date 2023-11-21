package com.ing.codemotion.rnatranscription;

public class RnaTranscription {

    String transcribe(String dnaStrand) {
        return switch (dnaStrand) {
            case "G" -> "C";
            case "C" -> "G";
            case "T" -> "A";
            case "A" -> "U";
            default -> "";
        };
    }
}
