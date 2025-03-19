package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractBankNode {

    private List<AbstractBankNode> children = new ArrayList<AbstractBankNode>();
    public KontoGruppe(final String label) {
        super(label);
    }

    @Override
    public List<AbstractBankNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractBankNode child) {
        children.add(child);
        child.setParent(this);
    }

    public void removeChild(final AbstractBankNode child) {
        children.remove(child);
        child.setParent(null);
    }
}
