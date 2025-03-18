package processor;

public class CharacterCounter extends AbstractFileCounter {



    @Override
    public void process(final char c) {
        incrementCounter();
    }
}
