import java.awt.*;

public class Volvo240 extends Cars {

    private final static double trimFactor = 1.25;

    public Volvo240(double trimFactor){
        super(4, Color.black, 100, 0, "src.Volvo240");
    }

    private double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    private void incrementSpeed(double amount) {
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    private void decrementSpeed(double amount) {
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    // TODO fix this method according to lab pm
    private void gas(double amount) {
        incrementSpeed(amount);
    }       //TODO not private?

    // TODO fix this method according to lab pm
    private void brake(double amount) {
        decrementSpeed(amount);
    }       //TODO not private?
}
