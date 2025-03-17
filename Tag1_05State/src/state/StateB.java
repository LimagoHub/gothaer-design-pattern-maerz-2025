package state;

public class StateB extends AbstractState{
    public StateB(final Front front) {
        super(front);
    }

    @Override
    public void print() {
        System.out.println("Hier druckt StateB");
    }

    @Override
    public void changeToA() {
        getFront().current = getFront().stateA;
    }
}
