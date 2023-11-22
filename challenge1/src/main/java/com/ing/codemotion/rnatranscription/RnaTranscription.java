package com.ing.codemotion.rnatranscription;

import java.util.Map;
import java.util.stream.Collectors;

public class RnaTranscription {
    private final Map<String, String> nucleotides = Map.of("G","C","C","G", "T","A","A","U");

    String transcribe(String dnaStrand) {
        return dnaStrand.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(nucleotides::get)
                .collect(Collectors.joining());
    }
}
