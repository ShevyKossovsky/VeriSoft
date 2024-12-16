package ChocolateBarFactory;

import ChocolateBarFactory.Models.MilkChocolate;

public class MilkChocolateBarFactory extends ChocolateBarFactory {
    @Override
    public ChocolateBar prepareChocolateBar() {
        System.out.println("Preparing Milk Chocolate...");
        return new MilkChocolate();
    }


}
