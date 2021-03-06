import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testGas {

    @Test
    public void testGas(){
        Saab95 mySaab = new Saab95();
        //mySaab.setCurrentSpeed(10);
        mySaab.setTurboOff();
        mySaab.gas(0.5);
        assertEquals(0.725, mySaab.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testGasOver(){
        Saab95 mySaab = new Saab95();
        //mySaab.setCurrentSpeed(10);
        mySaab.setTurboOn();
        mySaab.gas(1.1);
        assertEquals(0.1, mySaab.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testGasUnder(){
        Saab95 mySaab = new Saab95();
        //mySaab.setCurrentSpeed(10);
        mySaab.setTurboOn();
        mySaab.gas(-0.1);
        assertEquals(0.1, mySaab.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testGas1(){
        Saab95 mySaab = new Saab95();
        //mySaab.setCurrentSpeed(10);
        mySaab.setTurboOn();
        mySaab.gas(1);
        assertEquals(1.725, mySaab.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testGas0(){
        Saab95 mySaab = new Saab95();
        //mySaab.setCurrentSpeed(10);
        mySaab.setTurboOn();
        mySaab.gas(0);
        assertEquals(0.1, mySaab.getCurrentSpeed(), 0.01);
    }


}
