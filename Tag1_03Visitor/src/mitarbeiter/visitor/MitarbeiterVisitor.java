package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public interface MitarbeiterVisitor {

    void visit(LohnEmpfaenger lohnEmpfaenger);
    void visit(GehaltsEmpfaenger gehaltsEmpfaenger);
}
