package ShippingService;

public class StandardShipping implements ShippingStrategy{
    @Override
    public void calculateDeliveryPrice() {
        System.out.println("Calculating delivery price for standard shipping...");
    }
}
