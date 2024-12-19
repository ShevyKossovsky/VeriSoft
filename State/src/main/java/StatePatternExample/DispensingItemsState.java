package StatePatternExample;

public class DispensingItemsState implements State{
    @Override
    public void handleState() {
        System.out.println("Dispensing items...");
    }
}
