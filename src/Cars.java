import java.awt.*;
/**
 * Abstract class that Saab95 and Volvo240 extends
 */
public abstract class Cars implements Movable {

    /**
     * instance variables for Cars.
     */
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x;
    private double y;
    private double angle;


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
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.modelName = modelName;
        this.angle = angle;
        startEngine();
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
    private void startEngine() {
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

    public int getNrDoors() {
        return nrDoors;
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
