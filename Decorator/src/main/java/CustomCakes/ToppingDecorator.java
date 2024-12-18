package CustomCakes;

public class ToppingDecorator extends CakeDecorator{
    public ToppingDecorator(Cake cake) {
        super(cake);
    }
    @Override
    public void bake(){
        super.bake();
        System.out.println("Adding topping to the cake... ");
    }
}
