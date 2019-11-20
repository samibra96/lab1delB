import java.awt.*;

public abstract class Truck extends Cars implements Movable, ITransport {


    private double flatbedAngle;


    /**
     * constructor who initializes Truck.
     *
     * @param nrDoors      Number of doors on the car
     * @param color        Color of the car
     * @param enginePower  Engine power of the car
     * @param currentSpeed The current speed of the car
     * @param modelName    The car model name
     * @param angle        The direction the car is pointed towards
     */
    public Truck(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double flatbedAngle) {
        super(nrDoors, color, enginePower, currentSpeed, modelName, angle);
          this.flatbedAngle = flatbedAngle;
    }

    /**
     * Moves Truck in x or y direction.
     */
    @Override
    public void move(){
        if (Double.compare(flatbedAngle,0) == 0){
            super.move();
        }
    }

    /**
     * Loads cargo on truck. TODO use composition to be able to use method on ferry.
     */
    @Override
    public void loadCargo() {

    }

    /**
     * Loads cargo on truck. TODO use composition to be able to use method on ferry.
     */
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
