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
        super(2, Color.red, 125, 0, "src.Saab95");
    }

    private void setTurboOn() {
        turboOn = true;
    }

    private void setTurboOff() {
        turboOn = false;
    }

    /**
     * calculates speedFactor for a Saab95.
     * @return returns a double speedFactor that are used to increase & decrease speed.
     */
    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Increments speed and sets the currentSpeed value.
     * @param amount TODO
     */
    public void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    /**
     * Decrement speed and sets the currentSpeed value.
     * @param amount TODO
     */
    public void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

    /**
     * TODO
     * @param amount TODO
     */
    // TODO fix this method according to lab pm
    private void gas(double amount) {
        incrementSpeed(amount);
    }

    /**
     * TODO
     * @param amount TODO
     */
    // TODO fix this method according to lab pm
    private void brake(double amount) {
        decrementSpeed(amount);
    }
}
