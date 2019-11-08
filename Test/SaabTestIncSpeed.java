import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class SaabTestIncSpeed {
    @Test
    public void saabTestIncSpeedTurboON(){
        System.out.println("Testing method decrementSpeed in Saab95 class");
        Saab95 mySaab = new Saab95();
        mySaab.setCurrentSpeed(10);
        mySaab.setTurboOn();
        mySaab.incrementSpeed(0.5);
        assertEquals(0, Double.compare(mySaab.getCurrentSpeed(), 10.8125));
    }

    @Test
    public void saabTestIncSpeedTurboOff(){
        System.out.println("Testing method decrementSpeed in Saab95 class");
        Saab95 mySaab = new Saab95();
        mySaab.setCurrentSpeed(10);
        mySaab.setTurboOff();
        mySaab.incrementSpeed(0.5);
        assertEquals(0, Double.compare(mySaab.getCurrentSpeed(), 10.625));
    }
    @Test
    public void testMaxInc (){
        System.out.println("Testing method decrementSpeed in Saab95 class");
        Saab95 mySaab = new Saab95();
        mySaab.setCurrentSpeed(125);
        mySaab.setTurboOn();
        mySaab.incrementSpeed(1);
        assertEquals(0, Double.compare(mySaab.getCurrentSpeed(), 125));
    }


}
