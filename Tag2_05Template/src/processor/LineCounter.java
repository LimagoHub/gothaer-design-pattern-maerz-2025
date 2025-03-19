package processor;

public class LineCounter extends AbstractFileCounter {

    @Override
    public void process(final char c) {
        if(c == '\n') {
            incrementCounter();
        }
    }
}
