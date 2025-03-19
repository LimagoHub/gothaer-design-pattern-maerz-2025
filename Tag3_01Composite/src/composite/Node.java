package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node extends AbstractNode {

    private List<AbstractNode> children = new ArrayList<AbstractNode>();
    public Node(final String label) {
        super(label);
    }

    @Override
    public List<AbstractNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractNode child) {
        children.add(child);
        child.setParent(this);
    }

    public void removeChild(final AbstractNode child) {
        children.remove(child);
        child.setParent(null);
    }
}
