package ShippingService;

public class ShippingContext {
    public ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        System.out.println("Setting shipping strategy...");
        this.shippingStrategy = shippingStrategy;
    }

    public void calculateShippingStrategy() {
        System.out.println("Executing shipping strategy");
        shippingStrategy.calculateDeliveryPrice();
    }

}
