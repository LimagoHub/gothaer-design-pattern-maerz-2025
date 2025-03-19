package composite;

public class Konto extends AbstractBankNode {
    private double saldo = 0.0;

    public Konto(final String label) {
        super(label);
    }

    public Konto(final String label, final double saldo) {
        super(label);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(final double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", saldo=").append(saldo);

        return sb.toString();
    }
}
