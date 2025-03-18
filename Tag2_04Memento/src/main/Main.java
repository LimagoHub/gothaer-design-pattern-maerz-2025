package main;

import tiere.Schwein;
import tiere.SchweineMemento;

public class Main {
    public static void main(String[] args) {

        Schwein piggy = new Schwein("Miss Piggy");
        System.out.println(piggy);

        SchweineMemento m = piggy.getMemento();

        piggy.fuettern();

        System.out.println(piggy);

        piggy.setMemento(m);
        System.out.println(piggy);
    }
}