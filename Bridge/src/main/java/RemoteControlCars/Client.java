package RemoteControlCars;

public class Client {
    public static void main(String[] args) {
        // Create a specific model of car with speed and color
        Car car1 = new CarImpl("Sports Car", "Red", 200);
        Car car2 = new CarImpl("SUV", "Black", 120);

        // Create remote controls for the cars
        RemoteControl remote1 = new RemoteControlImpl(car1);
        RemoteControl remote2 = new RemoteControlImpl(car2);

        // Control the first car
        System.out.println("Controlling the first car:");
        remote1.pressDriveForward();
        remote1.pressTurnLeft();
        remote1.pressDriveBackward();
        remote1.pressTurnRight();

        System.out.println("\nControlling the second car:");
        // Control the second car
        remote2.pressDriveForward();
        remote2.pressTurnRight();
        remote2.pressDriveBackward();
        remote2.pressTurnLeft();
    }
}
