package composite.visitor;

import composite.Konto;
import composite.KontoGruppe;

public interface BankVisitor {

    void init();
    void visit(Konto konto);
    void visit(KontoGruppe kontoGruppe);
    void dispose();
}
