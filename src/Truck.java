import java.awt.*;

public abstract class Truck extends Vehicle implements Movable, ITransport {


    private double flatbedAngle;
    private int nrDoors;


    /**
     * constructor who initializes Car.
     *
     * @param nrDoors      Number of doors on the car
     * @param color        Color of the car
     * @param enginePower  Engine power of the car
     * @param currentSpeed The current speed of the car
     * @param modelName    The car model name
     * @param angle        The direction the car is pointed towards
     */
    public Truck(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double flatbedAngle) {
        super(enginePower, currentSpeed, color, modelName, angle);
          this.flatbedAngle = flatbedAngle;
          this.nrDoors = nrDoors;
    }
    @Override
    public void move(){
        if (Double.compare(flatbedAngle,0) == 0){
            super.move();
        }
    }

    @Override
    public void loadCargo() {

    }

    @Override
    public void unloadCargo() {
    }

    public double getFlatbedAngle() {
        return flatbedAngle;
    }

    public void setFlatbedAngle(double flatbedAngle) {
        this.flatbedAngle = flatbedAngle;
    }
}
