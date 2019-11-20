import java.awt.*;

public class CarTransport extends Truck {




    public CarTransport(int nrDoors, Color color, double enginePower, double currentSpeed, String modelName, double angle, double flatbedAngle) {
        super(nrDoors, color, enginePower, currentSpeed, modelName, angle, flatbedAngle);
    }

    @Override
    double speedFactor() {
        return 0;
    }
}
