import java.awt.*;

public class Truck extends Cars implements Movable, ITransport {


    private double flatbedAngle;


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
        super(nrDoors, color, enginePower, currentSpeed, modelName, angle);
          this.flatbedAngle = flatbedAngle;
    }
    @Override
    public void move(){
        if (Double.compare(flatbedAngle,0) == 0){
            super.move();
        }
    }

    @Override
    double speedFactor() {
        return 0;
    }

    @Override
    public void liftFlatbed() {

    }

    @Override
    public void lowerFlatbed() {

    }

    @Override
    public void loadCargo() {

    }

    @Override
    public void unloadCargo() {

    }
}
