package processor;

public class LineCounter extends AbstractFileProcessor {
    private int counter = 0;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.println(getClass().getSimpleName() + ": Counter: " + counter);
    }

    @Override
    public void process(final char c) {
        if(c == '\n') {
            counter++;
        }
    }
}
