package ChocolateBarFactory;

import ChocolateBarFactory.Models.DarkChocolate;

public class DarkChocolateBarFactory extends ChocolateBarFactory {
    @Override
    public ChocolateBar prepareChocolateBar() {
        System.out.println("Preparing Dark Chocolate...");
        return new DarkChocolate();
    }

}
