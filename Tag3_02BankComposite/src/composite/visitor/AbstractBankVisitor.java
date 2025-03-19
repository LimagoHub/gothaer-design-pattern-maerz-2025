package composite.visitor;

import composite.Konto;
import composite.KontoGruppe;

public class AbstractBankVisitor implements BankVisitor {
    @Override
    public void init() {
        // Ok
    }

    @Override
    public void visit(final Konto konto) {
        // Ok
    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {
        // Ok
    }

    @Override
    public void dispose() {
        // Ok
    }
}
