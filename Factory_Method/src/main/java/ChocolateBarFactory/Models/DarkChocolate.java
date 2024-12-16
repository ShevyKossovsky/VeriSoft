package ChocolateBarFactory.Models;

import ChocolateBarFactory.ChocolateBar;

public class DarkChocolate extends ChocolateBar {
    @Override
    public ChocolateBar serve() {
        System.out.println("Serving Dark Chocolate");
        return this;
    }
}
