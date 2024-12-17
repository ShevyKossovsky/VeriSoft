package RemoteControlCars;

public class RemoteControlImpl implements RemoteControl {
    private Car car;

    public RemoteControlImpl(Car car) {
        this.car = car;
    }

    @Override
    public void pressDriveForward() {
        car.driveForward();
    }

    @Override
    public void pressDriveBackward() {
        car.driveBackward();
    }

    @Override
    public void pressTurnLeft() {
        car.turnLeft();
    }

    @Override
    public void pressTurnRight() {
        car.turnRight();
    }
}
