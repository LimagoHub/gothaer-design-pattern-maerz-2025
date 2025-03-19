package processor;

public abstract class AbstractFileCounter implements CharacterHandler {

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    protected void incrementCounter() {
        counter++;
    }

    @Override
    public void dispose() {
        System.out.println(getClass().getSimpleName() + ": Counter: " + counter);
    }
}
