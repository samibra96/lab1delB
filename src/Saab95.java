import java.awt.*;

/**
 * Class Saab95 is through extension a subclass to the abstract class Cars
 */
public class Saab95 extends Cars {

    /**
     * instance variable to turn turboOn on Saab95.
     */
    private boolean turboOn;

    /**
     * constructor, sets value to declare instances of class.
     * if no param set angle to default 0.
     */
    public Saab95(){
        this(0);
    }

    /**
     * Constructor, sets value to declare instances of class.
     *
     * @param angle The direction the car points at when created.
     */
    public Saab95(double angle) {
        super(2, Color.red, 125, 0, "Saab95",angle);
    }

    /**
     * Activate turbo by setting instance variable to true
     */
    public void setTurboOn() {
        turboOn = true;
    }

    /**
     * Deactivate turbo by setting instance variable to false.
     */
    public void setTurboOff() {
        turboOn = false;
    }

    /**
     * calculates speedFactor for a Saab95.
     *
     * @return value to multiply incrementSpeed and decrementSpeed by.
     */
    double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
