import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testMove {

    @Test
    public void testMoveX(){
    System.out.println("Testing move()");
    Saab95 saabCar = new Saab95();
    saabCar.setX(5);
    saabCar.setY(5);
    saabCar.setAngle(0);
    saabCar.move();
    assertEquals(0, saabCar.getX(), 5.1);
    }
    @Test
    public void testMoveY(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95();
        saabCar.setX(5);
        saabCar.setY(5);
        saabCar.setAngle(Math.PI/2);
        saabCar.move();
        assertEquals(0, saabCar.getY(), 5.1);
    }

    @Test
    public void testMoveXY(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95();
        saabCar.setX(5);
        saabCar.setY(5);
        saabCar.setAngle(Math.PI/4);
        saabCar.move();
        assertEquals(0,saabCar.getX(),5.05);
        assertEquals(0,saabCar.getY(),5.05);
    }

    @Test
    public void testMoveXYNeg(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95();
        saabCar.setX(5);
        saabCar.setY(5);
        saabCar.setAngle(-Math.PI/4);
        saabCar.move();
        assertEquals(0,saabCar.getX(),5.05);
        assertEquals(0,saabCar.getY(),4.95);

    }

    @Test
    public void testMoveXYbigVal(){
        System.out.println("Testing move()");
        Saab95 saabCar = new Saab95();
        saabCar.setX(5);
        saabCar.setY(5);
        saabCar.setAngle(10*Math.PI/2);
        saabCar.move();
        assertEquals(0,saabCar.getX(),4.90);
        assertEquals(0,saabCar.getY(),5.00);

    }

}
