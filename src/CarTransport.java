import java.awt.*;
import java.util.ArrayDeque;

public class CarTransport extends Truck implements ITransport {

    private static final double RAMPUP = 0;
    private static final double RAMPDOWN = 110;

    private ArrayDeque<Cars> cargo = new ArrayDeque<>(8);       //TODO Move all in while  if moving CarTransport


    /**
     * Loads cargo on truck. TODO use composition to be able to use method on ferry.
     */
    @Override
    public void loadCargo(Cars car) {
        if(Double.compare(getRampAngle(),RAMPDOWN) == 0){
            if(Math.abs(Double.compare(this.getX(), car.getX())) <= 10 && Math.abs(Double.compare(this.getY(), car.getY())) <= 10 ) {
                if(cargo.size()<8) {
                    car.setX(this.getX());
                    car.setY(this.getY());
                    car.stopEngine();
                    cargo.push(car);
                }
            }
        }
    }

    @Override
    public void move() {
        super.move();
        moveAll();
    }

    public void moveAll(){
        for(Cars car: cargo){
            car.setX(this.getX());
            car.setY(this.getY());
        }
    }


    /**
     * Loads cargo on truck. TODO use composition to be able to use method on ferry.
     */
    @Override
    public void unloadCargo() {
        if (Double.compare(getRampAngle(),RAMPDOWN) == 0 && cargo.size() != 0){
            cargo.peek().setX(this.getX()+5);
            cargo.peek().setY(this.getY()+5);
            cargo.peek().startEngine();
            cargo.pop();
        }
    }

    public CarTransport() {
        this(2, Color.CYAN, 80, 0, "Mercedes Transporter", 0,0);
    }

    public CarTransport(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double flatbedAngle) {
        super(nrDoors, color, enginePower, currentSpeed, modelName, angle, flatbedAngle);
    }

    public void liftRamp(){     //TODO Combine common method with Scania
        if(Double.compare(getCurrentSpeed(),0) == 0) {
            setRampAngle(RAMPUP);
        }
    }
    public void lowerRamp(){    //TODO Combine common method with Scania
        if(Double.compare(getCurrentSpeed(),0) == 0) {
            setRampAngle(RAMPDOWN);
        }
    }

    @Override
    double speedFactor() {
        return 0;
    }
}
