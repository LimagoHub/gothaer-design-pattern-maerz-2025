package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public interface MitarbeiterVisitor {

    void init();
    void visit(LohnEmpfaenger lohnEmpfaenger);
    void visit(GehaltsEmpfaenger gehaltsEmpfaenger);
    void dispose();
}
