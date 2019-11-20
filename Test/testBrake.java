import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testBrake {

    @Test
    public void testBrake() {
        System.out.println("test of method brake()");
        Volvo240 myVolvo = new Volvo240();
        //myVolvo.setCurrentSpeed(10);
        myVolvo.brake(0.75);
        assertEquals(0, myVolvo.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testBreakMinValue() {
        System.out.println("test of method brake()");
        Volvo240 myVolvo = new Volvo240();
        myVolvo.gas(1); //currentSpeed 1.35
        myVolvo.brake(0.25); //0,3125
        assertEquals(1.0375, myVolvo.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testBreakBadInput() {
        System.out.println("test of method brake()");
        Volvo240 myVolvo = new Volvo240();
        //myVolvo.setCurrentSpeed(10);
        myVolvo.brake(-1);
        assertEquals(0.1, myVolvo.getCurrentSpeed(), 0.01);
    }

}
