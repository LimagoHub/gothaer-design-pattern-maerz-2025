package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor implements MitarbeiterVisitor {

    private int leCounter;
    private int geCounter;


    public int getLeCounter() {
        return leCounter;
    }

    public int getGeCounter() {
        return geCounter;
    }

    public int getTotal() {
        return leCounter + geCounter;
    }

    @Override
    public void init() {
        leCounter =  geCounter = 0;
    }


    @Override
    public void dispose() {
        System.out.println(this);
    }

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        leCounter++;
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
       geCounter++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("leCounter=").append(leCounter);
        sb.append(", geCounter=").append(geCounter);
        sb.append(" total=").append(getTotal());
        sb.append('}');
        return sb.toString();
    }
}
