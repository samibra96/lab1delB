import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class volvoTestDecSpeed {

    @Test
    public void testVolvoDecSpeed(){
        System.out.println("Testing method decrementSpeed in Volvo240");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(50);
        myVolvo.decrementSpeed(1);
        assertEquals(0,myVolvo.getCurrentSpeed(),48.75);
    }

    @Test
    public void testVolvoDecSpeedMin(){
        System.out.println("Testing method decrementSpeed in Volvo240");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(0);
        myVolvo.decrementSpeed(1);
        assertEquals(0,myVolvo.getCurrentSpeed(), 0);
    }
}
