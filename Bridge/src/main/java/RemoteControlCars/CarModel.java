package RemoteControlCars;
/**
 * CarModel interface representing different models of remote-controlled cars.
 * Defines methods for specifying car features such as speed and color.
 */
public interface CarModel {
    /**
     * Returns the speed of the car.
     * @return the speed of the car.
     */
    int getSpeed();

    /**
     * Returns the color of the car.
     * @return the color of the car.
     */
    String getColor();
}
