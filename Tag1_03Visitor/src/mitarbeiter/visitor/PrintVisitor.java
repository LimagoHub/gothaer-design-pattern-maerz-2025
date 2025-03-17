package mitarbeiter.visitor;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        print(lohnEmpfaenger);
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        print(gehaltsEmpfaenger);
    }

    private void print(AbstractMitarbeiter mitarbeiter) {
        System.out.println(mitarbeiter);
    }
}
