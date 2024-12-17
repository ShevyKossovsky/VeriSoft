package RemoteControlCars;

/**
 * Car interface representing a remote-controlled car.
 * This interface defines basic movement methods such as driving forward,
 * driving backward, turning left, and turning right.
 */
public interface Car {
    /**
     * Moves the car forward.
     */
    void driveForward();

    /**
     * Moves the car backward.
     */
    void driveBackward();

    /**
     * Turns the car to the left.
     */
    void turnLeft();

    /**
     * Turns the car to the right.
     */
    void turnRight();
}
