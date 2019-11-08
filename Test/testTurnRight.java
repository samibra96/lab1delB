import java.lang.System.*;
import org.junit.*;
import static org.junit.Assert.* ;

public class testTurnRight {

    @Test
    public void testTurnRight(){
        System.out.println("Testing method turnLeft");
        Volvo240 volvoCar = new Volvo240(1.0);
        volvoCar.setAngle(0);
        volvoCar.setX(0);
        volvoCar.setY(0);
        volvoCar.turnRight();
        assertTrue(Double.compare(volvoCar.getAngle(), 0.1) == 0);
    }
}
