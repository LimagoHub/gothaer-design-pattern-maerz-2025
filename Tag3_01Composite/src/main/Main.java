package main;


import composite.AbstractNode;
import composite.Leaf;
import composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("root");

        Node child1 = new Node("child1");
        root.appendChild(child1);

        Node child2 = new Node("child2");
        root.appendChild(child2);

        Node child1_1 = new Node("child1_1");
        child1.appendChild(child1_1);

        Node child1_2 = new Node("child1_2");
        child1.appendChild(child1_2);

        Leaf leaf2_1 = new Leaf("leaf2_1");
        child2.appendChild(leaf2_1);

        Leaf leaf1_1_1 = new Leaf("leaf1_1_1");
        child1_1.appendChild(leaf1_1_1);

        Leaf leaf1_2_1 = new Leaf("leaf1_2_1");
        child1_2.appendChild(leaf1_2_1);

        travers(root);
    }

    public static void travers(AbstractNode abstractNode) {
        System.out.println(abstractNode);
        for (AbstractNode child : abstractNode.getChildren()) {
            travers(child);
        }
    }

}