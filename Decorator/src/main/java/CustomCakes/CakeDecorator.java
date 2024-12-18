package CustomCakes;

public abstract class CakeDecorator implements Cake {
    Cake cake;
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void bake() {
        cake.bake();
    }

}
