
import ChocolateBarFactory.*;
import ChocolateBarFactory.Models.DarkChocolate;

public class Main {
    public static void main(String[] args) {
        ChocolateBarFactory milkChocolateBarFactory = new MilkChocolateBarFactory();
        ChocolateBarFactory darkChocolateBarFactory = new DarkChocolateBarFactory();
        ChocolateBarFactory whiteChocolateBarFactory = new WhiteChocolateBarFactory();

        ChocolateBar darkChocolate = darkChocolateBarFactory.takeOrder();
        ChocolateBar whiteChocolate = whiteChocolateBarFactory.takeOrder();
        ChocolateBar milkChocolate = milkChocolateBarFactory.takeOrder();


    }
}
