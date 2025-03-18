package math;

public class Calculator {

    private static final Calculator instance = new Calculator();

    public static Calculator getInstance() {
        return instance;
    }

    private Calculator() {}


    private double memory = 0;

    public double getMemory() {
        return memory;
    }

    private void setMemory(final double memory) {
        this.memory = memory;
    }

    public void add(final double a) {
        memory += a;
    }
    public void sub(final double a) {
        memory -= a;
    }
    public void mult(final double a) {
        memory *= a;
    }
    public void div(final double a) {
        memory /= a;
    }

    public void clear() {
        memory = 0;
    }

    public void print() {
        System.out.println(memory);
    }
}
