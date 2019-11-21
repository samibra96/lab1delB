import java.awt.*;

public abstract class Vehicle implements Movable {

    private Movehelper parent;

    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double angle;
    private double x;
    private double y;

    public Vehicle(double enginePower, double currentSpeed, Color color, String modelName, double angle) {
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.angle = angle;
    }

    /**
     * move() makes car move in x and y direction depending on angle and cos/sin functions.
     * + on Y makes car move downwards. IE the unit circle is upside down.
     */
    public void move() {
        x = x + Math.cos(angle) * Math.abs(Math.cos(angle)) * currentSpeed;
        y = y + Math.sin(angle) * Math.abs(Math.sin(angle)) * currentSpeed;
    }

    /**
     * Makes car turn left by decreasing angle with &pi;/16
     */
    public void turnLeft() {
        angle = angle - Math.PI/16;
    }

    /**
     * Makes car turn right by increasing angle with &pi;/16
     */
    public void turnRight() {
        angle = angle + Math.PI/16;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    /**
     * Abstract method have to implement in any class that extends this one.
     * @return value to multiply incrementSpeed and decrementSpeed by.
     */
    abstract double speedFactor();

    /**
     * Increases and sets currentSpeed.
     * uses the min value of currentSpeed + increase and get enginePower.
     * Which makes sure that currentSpeed is not greater than enginePower.
     * @param amount user input
     */
    private void incrementSpeed(double amount) {
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    /**
     * Decrease and sets currentSpeed.
     * Uses the max value of currentSpeed - decrease and 0.
     * Which makes sure that currentSpeed is 0 or greater
     * @param amount user input
     */
    private void decrementSpeed(double amount) {
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    /**
     * starts engine by setting currentSpeed to 0.1
     */
    protected void startEngine() {
        currentSpeed = 0.1;
    }

    private void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    /**
     * stops engine by turning currentSpeed to 0.0
     */
    private void stopEngine() {
        currentSpeed = 0.0;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAngle() {
        return angle;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * Calls incrementSpeed to increase currentSpeed.
     * @param amount user input has to be in interval [0,1]
     */
    public void gas(double amount) {
        if(amount>=0 && amount <=1.0){
            double old = getCurrentSpeed();
            incrementSpeed(amount);
            if(old > getCurrentSpeed()){    //Decreased speed.
                setCurrentSpeed(old);
            }
        }
    }

    /**
     * Class decrementSpeed do decrease currentSpeed.
     * @param amount user input has to be in interval [0,1]
     */
    public void brake(double amount){
        if(amount >= 0 && amount <=1){
            double old = getCurrentSpeed();
            decrementSpeed(amount);
            if(old < getCurrentSpeed()){        //Increased speed.
                setCurrentSpeed(old);
            }
        }
    }
}
