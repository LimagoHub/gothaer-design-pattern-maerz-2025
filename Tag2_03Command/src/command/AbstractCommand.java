package command;

public abstract class AbstractCommand implements Command {


    @Override
    public void parse(final String[] tokens) {
        // Ok
    }



    @Override
    public void undo() {
        throw new UnsupportedOperationException("Upps");
    }

    @Override
    public boolean isUndoable() {
        return false;
    }
}
