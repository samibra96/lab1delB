import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testTurnLeft {
    @Test
    public void testTurnLeft(){
        System.out.println("Testing method turnLeft");
        Volvo240 volvoCar = new Volvo240();
        volvoCar.setAngle(0);
        volvoCar.setX(0);
        volvoCar.setY(0);
        volvoCar.turnLeft();
        assertEquals(0, volvoCar.getAngle(), 0.1);
    }
}
