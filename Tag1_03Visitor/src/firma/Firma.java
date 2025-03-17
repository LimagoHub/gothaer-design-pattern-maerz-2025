package firma;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.visitor.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

    public boolean add(final AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.add(abstractMitarbeiter);
    }

    public void remove(final AbstractMitarbeiter abstractMitarbeiter) {
        mitarbeiters.remove(abstractMitarbeiter);
    }

    public void print() {
        mitarbeiters.forEach(System.out::println);
    }

    public void iterate(MitarbeiterVisitor visitor) {
        visitor.init();
        for(var mitarbeiter : mitarbeiters) {
            //visitor.visit(mitarbeiter);
            mitarbeiter.accept(visitor);
        }
        visitor.dispose();
    }
}
