package CustomCakes;

public class FlavorDecorator extends CakeDecorator {
    FlavorDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public void bake() {
     super.bake();
        System.out.println("Adding flavor to the cake...");
    }
}
