package command;

import math.Calculator;

public class AddCommand extends AbstractTransactionCommand {


    private double value;

    @Override
    public void parse(final String[] tokens) {
        this.value = Double.parseDouble(tokens[1]);
    }


    @Override
    protected void doAction() {
        Calculator.getInstance().add(this.value);
    }


}
