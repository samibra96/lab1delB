import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class SaabTestDecSpeed {


    @Test
    public void saabTestDspeedTurboOn(){
        System.out.println("Testing method decrementSpeed in Saab95 class");
        Saab95 mySaab = new Saab95();
        mySaab.setCurrentSpeed(10);
        mySaab.setTurboOn();
        mySaab.decrementSpeed(1);
        assertEquals(0, mySaab.getCurrentSpeed(), 8.375);
    }
    @Test
    public void saabTestDspeedTurboOff(){
        System.out.println("Testing method decrementSpeed in Saab95 class");
        Saab95 mySaab = new Saab95();
        mySaab.setCurrentSpeed(10);
        mySaab.setTurboOff();
        mySaab.decrementSpeed(1);
        assertEquals(0, mySaab.getCurrentSpeed(),8.75);
    }

    @Test
    public void saabTestDSpeedMinValue(){
        System.out.println("Testing method decrementSpeed in Saab95 class");
        Saab95 mySaab = new Saab95();
        mySaab.setCurrentSpeed(0);
        mySaab.setTurboOn();
        mySaab.decrementSpeed(1);
        assertEquals(0,mySaab.getCurrentSpeed(),0);
    }


}
