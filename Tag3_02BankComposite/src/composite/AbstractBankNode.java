package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractBankNode implements Iterable<AbstractBankNode> {
    private AbstractBankNode parent = null  ;
    private String label;

    public AbstractBankNode(final String label) {
        this.label = label;
    }

    public AbstractBankNode getParent() {
        return parent;
    }

    public void setParent(final AbstractBankNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractBankNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() );
        sb.append(" label='").append(label).append('\'');

        return sb.toString();
    }

    public void print() {
       /* System.out.println(this);
        for (final AbstractBankNode child : getChildren()) {
            child.print();
        }

        */
       // iterator().forEachRemaining(System.out::println);
        for(var node: this) {
            System.out.println(node);
        };
    }

    @Override
    public Iterator<AbstractBankNode> iterator() {
        final List<AbstractBankNode> liste = new ArrayList<AbstractBankNode>();
        return liste.iterator();
    }
}
