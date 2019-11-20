import org.junit.Test;
import java.lang.System.*;



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


    }

    private void printCar(Cars car){
        System.out.println("Car is a " + car.getModelName() + " X: " + car.getX() + " Y: " + car.getY());
    }



}

