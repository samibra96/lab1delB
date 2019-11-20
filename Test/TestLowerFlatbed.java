import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLowerFlatbed {
    @Test
    public void testLowerFlatbed(){
        Scania myScania = new Scania();
        myScania.setFlatbedAngle(10);
        myScania.lowerFlatbed();
        assertEquals(myScania.getFlatbedAngle(), 9.9, 0.01);
    }

    @Test
    public void testLowerFlatbedMove(){
        Scania myScania = new Scania();
        myScania.setFlatbedAngle(10);
        myScania.setCurrentSpeed(1);
        double x = myScania.getX();
        double y = myScania.getY();
        myScania.move();
        assertEquals(myScania.getX(), x, 0);
        assertEquals(myScania.getY(), y, 0);
    }

}
