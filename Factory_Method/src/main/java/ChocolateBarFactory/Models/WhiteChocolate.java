package ChocolateBarFactory.Models;

import ChocolateBarFactory.ChocolateBar;

public class WhiteChocolate extends ChocolateBar {
    @Override
    public ChocolateBar serve() {
        System.out.println("Serving White Chocolate");
        return this;

    }
}
