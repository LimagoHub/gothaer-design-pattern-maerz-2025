package command;

import math.Calculator;

public class ClearCommand extends AbstractCommand {

    private double oldValue;

    @Override
    public boolean isUndoable() {
        return true;
    }

    @Override
    public void undo() {
        Calculator.getInstance().setMemory(oldValue);
    }

    @Override
    public void execute() {
        this.oldValue = Calculator.getInstance().getMemory();
        Calculator.getInstance().clear();
    }
}
