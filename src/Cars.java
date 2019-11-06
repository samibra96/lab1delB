import java.awt.*;

public abstract class Cars implements Movable {


    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x;
    private double y;
    private double angle;



    public Cars(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.modelName = modelName;
        startEngine();
    }

    public void move() {
        y = y + Math.cos(angle) * Math.abs(Math.cos(angle)) * currentSpeed;
        x = x + Math.sin(angle) * Math.abs(Math.sin(angle)) * currentSpeed;
    }

    public void turnLeft() {
        angle = angle + 0.1;
    }

    public void turnRight() {
        angle = angle - 0.1;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private void startEngine() {
        currentSpeed = 0.1;
    }

    private void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    private void stopEngine() {
        currentSpeed = 0.0;
    }

    private int getNrDoors() {
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
}
