import java.awt.*;

public class Scania extends Truck implements ITransport{


    private double trimFactor = 1.1;
    public Scania() {
        this(2, Color.YELLOW, 80, 0, "Scania 2-Series", 0, 0);
    }

    public Scania(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double flatBedAngle) {
        super(2, Color.YELLOW, 80, 0, "Scania 2-Series", angle,flatBedAngle);
    }

    @Override
    double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void liftFlatbed() {
        if(Double.compare(getCurrentSpeed(),0) == 0) {
            setFlatbedAngle(Math.min(getFlatbedAngle() + 0.1, 70));
        }
    }

    @Override
    public void lowerFlatbed() {
        setFlatbedAngle(Math.max(getFlatbedAngle()-0.1 , 0));
    }

    @Override
    public void loadCargo() {

    }

    @Override
    public void unloadCargo() {

    }
}
