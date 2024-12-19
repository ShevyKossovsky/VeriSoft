package StatePatternExample;

public class SelectProductState implements State{
    @Override
    public void handleState() {
        System.out.println("Selecting Products...");
    }
}
