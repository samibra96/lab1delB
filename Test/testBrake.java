import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testBrake {

    @Test
    public void testBrake() {
        System.out.println("test of method brake()");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(10);
        myVolvo.brake(0.75);
        assertEquals(0, myVolvo.getCurrentSpeed(), 9.0625);
    }

    @Test
    public void testBreakMinValue() {
        System.out.println("test of method brake()");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(0);
        myVolvo.brake(0.25);
        assertEquals(0, myVolvo.getCurrentSpeed(), 0);
    }

    @Test
    public void testBreakBadInput() {
        System.out.println("test of method brake()");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.setCurrentSpeed(10);
        myVolvo.brake(-1);
        assertEquals(0, myVolvo.getCurrentSpeed(), 10);
    }

}
