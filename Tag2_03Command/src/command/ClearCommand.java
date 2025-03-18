package command;

import math.Calculator;

public class ClearCommand extends AbstractTransactionCommand {



    @Override
    public void doAction() {

        Calculator.getInstance().clear();
    }
}
