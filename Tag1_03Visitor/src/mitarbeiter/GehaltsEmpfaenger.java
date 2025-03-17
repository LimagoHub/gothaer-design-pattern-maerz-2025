package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class GehaltsEmpfaenger extends AbstractMitarbeiter {

    private double gehalt = 0.0;

    public GehaltsEmpfaenger(final String name, final double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(final double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", gehalt=").append(gehalt);

        return sb.toString();
    }

    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
