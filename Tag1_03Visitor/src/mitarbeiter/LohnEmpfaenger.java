package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class LohnEmpfaenger extends AbstractMitarbeiter {

    private double stundenlohn = 0, arbeitszeit= 0;



    public LohnEmpfaenger() {
    }

    public LohnEmpfaenger(final String name) {
        this(name, 0,0);
    }

    public LohnEmpfaenger(final String name, final double stundenlohn, final double arbeitszeit) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.arbeitszeit = arbeitszeit;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(final double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(final double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", stundenlohn=").append(stundenlohn);
        sb.append(", arbeitszeit=").append(arbeitszeit);

        return sb.toString();
    }

    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
