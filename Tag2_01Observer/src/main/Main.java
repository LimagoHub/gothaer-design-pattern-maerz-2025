package main;

import tiere.PigTooFatListener;
import tiere.Schwein;

public class Main {

    private final Metzger metzger = new Metzger();
    private Spediteuer spediteuer = new Spediteuer();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(s->spediteuer.fahren(s));
        piggy.addPigTooFatListener(spediteuer::fahren);
        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    private class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(final Schwein sender) {
            metzger.schlachten(sender);
        }
    }
}

class Metzger {
    public void schlachten(final Object sender) {
        System.out.println("Messer Wetz!");
    }
}

class Spediteuer {
    public void fahren(final Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}