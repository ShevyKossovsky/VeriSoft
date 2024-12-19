package StatePatternExample;

public class VendingMachine {
    private State currentState;

    //constructor
    public VendingMachine(State state) {
        currentState = state;
    }

    public void setState(State state) {
        currentState = state;
    }

    public void operateState() {
        currentState.handleState();
    }
}
