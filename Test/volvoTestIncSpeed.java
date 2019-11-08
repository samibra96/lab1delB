import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class volvoTestIncSpeed {

    @Test
    public void testVolvoIncSpeed(){
        System.out.println("Test incrementSpeed in volvo");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(10);
        myVolvo.incrementSpeed(0.5);
        assertEquals(0, Double.compare(myVolvo.getCurrentSpeed(), 10.625));
    }

    @Test
    public void testVolvoMaxSpeed(){
        System.out.println("Test if incrementSpeed in volvo respect max speed.");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(myVolvo.getEnginePower());
        myVolvo.incrementSpeed(0.5);
        assertEquals(0, Double.compare(myVolvo.getCurrentSpeed(), myVolvo.getEnginePower()));
    }
}
