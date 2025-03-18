package command;

import math.Calculator;
import math.CalculatorMemento;

public abstract class AbstractTransactionCommand extends AbstractCommand {
    private CalculatorMemento memento;

    @Override
    public final void execute() {
        memento = Calculator.getInstance().getMemento();
        doAction();
    }

    protected abstract void doAction();

    @Override
    public void undo() {
        Calculator.getInstance().setMemento(memento);
    }

    @Override
    public boolean isUndoable() {
        return true;
    }
}
