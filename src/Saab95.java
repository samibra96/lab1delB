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
     */
    public Saab95(){
        this(0);
    }

    public Saab95(double angle) {
        super(2, Color.red, 125, 0, "Saab95",angle);
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    /**
     * calculates speedFactor for a Saab95.
     *
     * @return returns a double speedFactor that are used to increase & decrease speed.
     */

    double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
