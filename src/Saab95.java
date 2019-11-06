import java.awt.*;

public class Saab95 extends Cars {

    private boolean turboOn;

    public Saab95(){
        super(2, Color.red, 125, 0, "src.Saab95");
    }

    private void setTurboOn() {
        turboOn = true;
    }

    private void setTurboOff() {
        turboOn = false;
    }

    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

    // TODO fix this method according to lab pm
    private void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    private void brake(double amount) {
        decrementSpeed(amount);
    }
}
