package RemoteControlCars;

/**
 * RemoteControl interface representing a remote control for a car.
 * This interface defines methods for controlling the car's movements.
 */
public interface RemoteControl {
    /**
     * Sends a command to drive the car forward.
     */
    void pressDriveForward();

    /**
     * Sends a command to drive the car backward.
     */
    void pressDriveBackward();

    /**
     * Sends a command to turn the car to the left.
     */
    void pressTurnLeft();

    /**
     * Sends a command to turn the car to the right.
     */
    void pressTurnRight();
}

