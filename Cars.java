import java.awt.*;

public class Cars {


    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name


    public Cars(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.modelName = modelName;
        startEngine();
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void setEnginePower(double enginePower){
        this.enginePower = enginePower;
    }

    public void stopEngine(){
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
}
