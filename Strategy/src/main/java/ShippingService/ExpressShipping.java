package ShippingService;

public class ExpressShipping implements ShippingStrategy{
    @Override
    public void calculateDeliveryPrice() {
        System.out.println("Calculating delivery price to express shipping...");
    }
}
