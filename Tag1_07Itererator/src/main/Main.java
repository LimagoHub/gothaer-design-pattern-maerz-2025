package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var liste = List.of("Eins", "zwei", "drei", "vier", "fuenf");

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        for (var s : liste) {
            System.out.println(s);
        }

        for(Iterator<String> it = liste.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }



        System.out.println("Hello, World!");
    }
}

class Foo implements Iterable<Integer> {
    public Foo() {}

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}