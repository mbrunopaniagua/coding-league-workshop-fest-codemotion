package com.ing.codemotion.rnatranscription;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription;

    @BeforeEach
    public void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    public void testEmptyRnaSequence() {
        assertEquals("", rnaTranscription.transcribe(""));
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        assertEquals("G", rnaTranscription.transcribe("C"));
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        assertEquals("C", rnaTranscription.transcribe("G"));
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        assertEquals("A", rnaTranscription.transcribe("T"));
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        assertEquals("U", rnaTranscription.transcribe("A"));
    }

    @Test
    public void testRnaTranscriptionOfMultipleNucleotides() {
        assertEquals("CGCAUGGAUCCCUUGAUCCUCCUAAUGGGGUGCAUUAAAUGGCUGGUCCUGAUCGAUUUGACCUAUCGAUAAUUUUAAUAAGCUACCCGUACCUUGAUCCUCCGAUAAUCUGGAUCGAUACCAUCAUCACCUAUCGAUCGAUACGGGUGCAUUAAAUGCCUUGAUCCUCCGAUACGAUAAUUUUAAUCGAUAAUUUUAAUAAGAUCGAUAAUUCCUAU",
                rnaTranscription.transcribe("GCGTACCTAGGGAACTAGGAGGATTACCCCACGTAATTTACCGACCAGGACTAGCTAAACTGGATAGCTATTAAAATTATTCGATGGGCATGGAACTAGGAGGCTATTAGACCTAGCTATGGTAGTAGTGGATAGCTAGCTATGCCCACGTAATTTACGGAACTAGGAGGCTATGCTATTAAAATTAGCTATTAAAATTATTCTAGCTATTAAGGATA"));
    }

}