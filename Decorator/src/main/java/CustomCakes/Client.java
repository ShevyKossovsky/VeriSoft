package CustomCakes;

public class Client {
    public static void main(String[] args) {
        Cake cake = new BasicCake();
        Cake flavorCake = new FlavorDecorator(cake);
        Cake toppingCake = new ToppingDecorator(cake);

        Cake richCake = new FlavorDecorator(new ToppingDecorator(cake));

        richCake.bake();
    }


}
