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
     * constructor, sets value to declare instances of class.
     * if no param set angle to default 0.
     */
    public Volvo240(){
        this(0);
    }

    /**
     * Constructor, sets value to declare instances of class.
     * @param angle The direction the car points at when created.
     */
    public Volvo240(double angle){
        super(4, Color.black, 100, 0, "Volvo240", angle);
    }

    /**
     * calculates speedFactor for Volvo240 which later is used to increase and decrease speed.
     * @return value to multiply incrementSpeed and decrementSpeed by.
     */
    double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}
