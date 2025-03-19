package main;


import processor.CharacterCounter;
import processor.FileCopierer;
import processor.FileProcessor;
import processor.LineCounter;

public class Main {
    public static void main(String[] args) {
       FileProcessor fileProcessor = new FileProcessor();
       fileProcessor.addCharacterHandler(new LineCounter());
       fileProcessor.addCharacterHandler(new CharacterCounter());
       fileProcessor.addCharacterHandler(new FileCopierer());
       fileProcessor.run("./resources/eingabe.txt");
    }
}