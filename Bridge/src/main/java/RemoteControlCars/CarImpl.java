package RemoteControlCars;

public class CarImpl implements Car,CarModel {
    private String model;
    private String color;
    private int speed;

    public CarImpl(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    @Override
    public void driveForward() {
        System.out.println(model + " (" + color + ") is driving forward.");
    }

    @Override
    public void driveBackward() {
        System.out.println(model + " (" + color + ") is driving backward.");
    }

    @Override
    public void turnLeft() {
        System.out.println(model + " (" + color + ") is turning left.");
    }

    @Override
    public void turnRight() {
        System.out.println(model + " (" + color + ") is turning right.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getColor() {
        return color;
    }
}
