package ChocolateBarFactory;

import ChocolateBarFactory.Models.WhiteChocolate;

public class WhiteChocolateBarFactory extends ChocolateBarFactory {
    @Override
    public ChocolateBar prepareChocolateBar() {
        System.out.println("Preparing White Chocolate...");
        return new WhiteChocolate();
    }

}
