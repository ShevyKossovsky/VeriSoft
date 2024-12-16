import Prototype.Bunny;
import Prototype.Prototype;
import Prototype.TeddyBear;

public class Main {
    public static void main(String[] args) {
        Prototype bunny = new Bunny("White", "Small");
        Prototype teddy = new TeddyBear("Brown", "Large");

        Prototype bunny1=bunny.clone();
        Prototype teddy1=teddy.clone();

       bunny.display();
       bunny1.display();



    }
}
