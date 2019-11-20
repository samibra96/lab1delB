import java.awt.*;

/**
 *  Scania is a Truck
 */
public class Scania extends Truck implements ITransport{

    /**
     * instance variable used to calculate speedFactor of a Scania.
     */
    private double trimFactor = 1.1;

    /**
     * Constructor for Scania without arguments.
     */
    public Scania() {
        this(2, Color.YELLOW, 80, 0, "Scania 2-Series", 0, 0);
    }

    /**
     *  Constructor for Scania with arguments
     * @param nrDoors Number of doors
     * @param color Color of Scania
     * @param enginePower Max speed of the Scania
     * @param currentSpeed Current speed of the Scania
     * @param modelName Model name for Scania
     * @param angle Angle used to calculate turns right/left
     * @param flatBedAngle Angle for flatbed.
     */
    public Scania(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double flatBedAngle) {
        super(2, Color.YELLOW, 80, 0, "Scania 2-Series", angle,flatBedAngle);
    }

    /**
     * Calculate speedFactor for Scania
     * @return value to multiply incrementSpeed and decrementSpeed by.
     */
    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    /**
     * Increases angle of flatbed
     */

    public void liftFlatbed() {
        if(Double.compare(getCurrentSpeed(),0) == 0) {
            setFlatbedAngle(Math.min(getFlatbedAngle() + 0.1, 70));
        }
    }

    /**
     * Decreases angle of flatbed
     */

    public void lowerFlatbed() {
        setFlatbedAngle(Math.max(getFlatbedAngle()-0.1 , 0));
    }

    @Override
    public void loadCargo() {

    }

    @Override
    public void unloadCargo() {

    }
}
