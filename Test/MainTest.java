import org.junit.Test;
import java.lang.System.*;
import java.util.ArrayList;
import java.util.List;


public class MainTest {


    @Test
    public void run(){
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        saab.setTurboOn();
        saab.gas(1);
        for(int i = 0; i < 8; i++) {
            volvo.turnRight();
            volvo.gas(1);
        }
        System.out.println(volvo.getAngle());
        for(int i = 0; i < 10; i++) {
            volvo.move();
            saab.move();
            printCar(saab);
            printCar(volvo);
        }

        CarTransport carTransport = new CarTransport();
        Scania scania = new Scania();
        carTransport.loadCargo(saab);
        //carTransport.loadCargo(scania);

        /**
         * Just som Erik tests, don't mind!
         */
        Workshop<Cars> workshop = new Workshop<>(5);
        workshop.putInWorkshop(volvo);
        System.out.println(workshop.workshopUnits.toString());

        Workshop<Volvo240> volvo240Workshop = new Workshop<>(3);
        //volvo240Workshop.putInWorkshop(saab);
        volvo240Workshop.putInWorkshop(volvo);

        //volvo240Workshop.removeFromWorkshop(volvo);
        volvo.move();
    }

    private void printCar(Cars car){
        System.out.println("Car is a " + car.getModelName() + " X: " + car.getX() + " Y: " + car.getY());
    }



}

