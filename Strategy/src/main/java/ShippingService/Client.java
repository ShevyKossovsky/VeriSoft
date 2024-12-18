package ShippingService;

public class Client {
    public static void main(String[] args) {
        ShippingContext shippingContext = new ShippingContext();
        shippingContext.setShippingStrategy(new StandardShipping());
        shippingContext.calculateShippingStrategy();
        shippingContext.setShippingStrategy(new ExpressShipping());
        shippingContext.calculateShippingStrategy();
        shippingContext.setShippingStrategy(new SameDayShipping());
        shippingContext.calculateShippingStrategy();

    }
}
