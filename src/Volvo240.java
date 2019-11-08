import java.awt.*;
/**
 * Class Volvo240 is through extension a subclass to the abstract class Cars
 */
public class Volvo240 extends Cars {

    /**
     * Instance variable used to calculate the speedFactor for a Volvo240.
     */
    private final static double trimFactor = 1.25;

    /**
     * constructor for a Volvo240
     * @param trimFactor Instance variable used to calculate the speedFactor for a Volvo240.
     */
    public Volvo240(double trimFactor){
        super(4, Color.black, 100, 0, "Volvo240");
    }

    /**
     * calculates speedFactor for Volvo240 which later is used to increase & decrease speed.
     * @return a double speedFactor.
     */
    private double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    /**
     * Increases and sets currentSpeed.
     * @param amount TODO
     */

    public void incrementSpeed(double amount) {
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    /**
     * Decrease and sets currentSpeed.
     * @param amount TODO
     */

    public void decrementSpeed(double amount) {
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

}
