package main;


import composite.AbstractBankNode;
import composite.Konto;
import composite.KontoGruppe;

public class Main {
    public static void main(String[] args) {

        KontoGruppe root = new KontoGruppe("root");

        KontoGruppe child1 = new KontoGruppe("child1");
        root.appendChild(child1);

        KontoGruppe child2 = new KontoGruppe("child2");
        root.appendChild(child2);

        KontoGruppe child1_1 = new KontoGruppe("child1_1");
        child1.appendChild(child1_1);

        KontoGruppe child1_2 = new KontoGruppe("child1_2");
        child1.appendChild(child1_2);

        Konto konto2_1 = new Konto("konto2_1");
        child2.appendChild(konto2_1);

        Konto konto1_1_1 = new Konto("konto1_1_1");
        child1_1.appendChild(konto1_1_1);

        Konto konto1_2_1 = new Konto("konto1_2_1");
        child1_2.appendChild(konto1_2_1);


        //root.print();
        //travers(root);
    }

    public static void travers(AbstractBankNode abstractNode) {
        System.out.println(abstractNode);
        for (AbstractBankNode child : abstractNode.getChildren()) {
            travers(child);
        }
    }

}