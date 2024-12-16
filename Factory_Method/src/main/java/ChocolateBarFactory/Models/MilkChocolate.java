package ChocolateBarFactory.Models;

import ChocolateBarFactory.ChocolateBar;

public class MilkChocolate extends ChocolateBar {
    @Override
    public ChocolateBar serve() {
        System.out.println("Serving Milk Chocolate");
        return this;
    }
}
