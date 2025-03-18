package main;

import processor.AbstractFileProcessor;
import processor.CharacterCounter;
import processor.LineCounter;

public class Main {
    public static void main(String[] args) {
       AbstractFileProcessor fileProcessor = new CharacterCounter();
        fileProcessor.run("./resources/eingabe.txt");
    }
}