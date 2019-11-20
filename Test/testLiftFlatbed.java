import org.junit.Test;

import static org.junit.Assert.*;

public class testLiftFlatbed {
    @Test
    public void testLiftFlatbed(){
        Scania myScania = new Scania();
        myScania.setFlatbedAngle(10);
        myScania.setCurrentSpeed(0);
        myScania.liftFlatbed();
        assertEquals(10.1, myScania.getFlatbedAngle(), 0.01);
    }

    @Test
    public void testLiftFlatbedNotMove(){
        Scania myScania = new Scania();
        myScania.setFlatbedAngle(0);
        myScania.setCurrentSpeed(0);
        double x = myScania.getX();
        myScania.liftFlatbed();
        myScania.setCurrentSpeed(1);
        myScania.move();
        assertEquals(x, myScania.getX(), 0.001);
    }

    @Test
    public void testLiftFlatbedMove(){
        Scania myScania = new Scania();
        myScania.setFlatbedAngle(0.1);
        myScania.setCurrentSpeed(1);
        myScania.setAngle(0);
        double x = myScania.getX();
        myScania.lowerFlatbed();
        myScania.move();
        assertEquals(x+1, myScania.getX(), 0.001);
    }




}
