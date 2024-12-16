package ChocolateBarFactory;

public abstract class ChocolateBarFactory {

    public abstract ChocolateBar prepareChocolateBar();

    public ChocolateBar takeOrder() {
        System.out.println("Order placed at " + this.getClass().getSimpleName() + "!");
        ChocolateBar chocolateBar = prepareChocolateBar();
        return chocolateBar.serve();
    }

}
