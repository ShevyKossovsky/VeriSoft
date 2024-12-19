package StatePatternExample;

public class InsertCoinsState implements State{
    @Override
    public void handleState() {
        System.out.println("Inserting coins...");
    }
}
