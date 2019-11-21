import java.awt.*;
/**
 * Abstract class that Saab95 and Volvo240 extends
 */
public abstract class Cars extends Vehicle{

    /**
     * instance variables for Cars.
     */
    private int nrDoors; // Number of doors on the car


    /**
     * constructor who initializes Car.
     * @param nrDoors Number of doors on the car
     * @param color Color of the car
     * @param enginePower Engine power of the car
     * @param currentSpeed The current speed of the car
     * @param modelName The car model name
     * @param angle The direction the car is pointed towards
     */
    public Cars(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle) {
        super(enginePower, currentSpeed, color, modelName, angle);
        this.nrDoors = nrDoors;
        startEngine();
    }


    public int getNrDoors() {
        return nrDoors;
    }

}
