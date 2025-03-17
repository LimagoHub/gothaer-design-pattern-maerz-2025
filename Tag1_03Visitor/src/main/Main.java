package main;

import firma.Firma;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;
import mitarbeiter.visitor.PrintVisitor;
import mitarbeiter.visitor.ResetArbeitszeitVisitor;
import mitarbeiter.visitor.StatistikVisitor;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();

        firma.add(new GehaltsEmpfaenger("Maier", 1000));
        firma.add(new GehaltsEmpfaenger("Mueller", 2000));
        firma.add(new LohnEmpfaenger("Hinz", 40, 20));
        firma.add(new LohnEmpfaenger("Kunz", 35, 25));
        firma.add(new GehaltsEmpfaenger("Schulz", 3000));

        //firma.print();
        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());

        firma.iterate(new StatistikVisitor());

    }
}