import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testMove {

    @Test
    public void testMoveX(){
    System.out.println("Testing move()");
    Saab95 saabCar = new Saab95();
    //saabCar.setX(5);
    //saabCar.setY(5);
    //saabCar.setAngle(0);
    saabCar.move();
    assertEquals(0.1, saabCar.getX(), 0.01);
    }
    @Test
    public void testMoveY(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95(Math.PI/2);
        //saabCar.setX(5);
        //saabCar.setY(5);
        //saabCar.setAngle(Math.PI/2);
        saabCar.move();
        assertEquals(0.1, saabCar.getY(), 0.01);
    }

    @Test
    public void testMoveXY(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95(Math.PI/4);
        //saabCar.setX(5);
        //saabCar.setY(5);
        //saabCar.setAngle(Math.PI/4);
        saabCar.move();
        assertEquals(0.05,saabCar.getX(),0.01);
        assertEquals(0.05,saabCar.getY(),0.01);
    }

    @Test
    public void testMoveXYNeg(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95(-Math.PI/4);
        //saabCar.setX(5);
        //saabCar.setY(5);
        //saabCar.setAngle(-Math.PI/4);
        saabCar.move();
        assertEquals(0.05,saabCar.getX(),0.01);
        assertEquals(-0.05,saabCar.getY(),0.01);

    }

    @Test
    public void testMoveXYbigVal(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95(10*Math.PI/2);
        //saabCar.setX(5);
        //saabCar.setY(5);
        //saabCar.setAngle(10*Math.PI/2);
        saabCar.move();
        assertEquals(-0.10,saabCar.getX(),0.01);
        assertEquals(0.00,saabCar.getY(),0.01);

    }

}
