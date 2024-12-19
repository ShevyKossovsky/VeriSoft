package StatePatternExample;

public class Client {
    public static void main(String[] args) {
        State initialState = new SelectProductState();
        VendingMachine machine = new VendingMachine(initialState);
        machine.operateState();
        machine.setState(new InsertCoinsState());
        machine.operateState();
        machine.setState(new DispensingItemsState());
        machine.operateState();


    }
}
