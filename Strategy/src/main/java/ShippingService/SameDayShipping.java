package ShippingService;

public class SameDayShipping implements ShippingStrategy{
    @Override
    public void calculateDeliveryPrice() {
        System.out.println("Calculating delivery price for same day shipping...");
    }
}
