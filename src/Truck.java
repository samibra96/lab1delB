import java.awt.*;

public abstract class Truck extends Vehicle implements Movable {



    private double rampAngle;
    private int nrDoors;


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
    public Truck(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double rampAngle) {
        super(enginePower, currentSpeed, color, modelName, angle);
          this.rampAngle = rampAngle;
          this.nrDoors = nrDoors;
    }

    /**
     * Moves Truck in x or y direction.
     */
    @Override
    public void move(){
        if (Double.compare(rampAngle,0) == 0){
            super.move();
        }
    }

    public double getRampAngle() {
        return rampAngle;
    }

    public void setRampAngle(double rampAngle) {
        this.rampAngle = rampAngle;
    }
}
