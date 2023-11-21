package com.ing.codemotion.rnatranscription;

public class RnaTranscription {

    String transcribe(String dnaStrand) {
        if (dnaStrand.equals("G")){
            return "C";
        }
        return "";
    }
}
