import org.junit.*;
import static org.junit.Assert.* ;

public class testCarTransport {

    CarTransport myTransporter;

    @Before
    public void initCarTransporter(){
        myTransporter = new CarTransport();
    }

    @Test
    public void testMoveCarTransporter(){
        myTransporter.move();
        assertEquals(0.1,myTransporter.getX(),0.0001);
    }


    @Test
    public void testMoveCarTransportRampDown(){
        myTransporter.stopEngine();
        myTransporter.lowerRamp();
        myTransporter.startEngine();
        myTransporter.move();
        assertEquals(0,myTransporter.getX(),0.01);
        assertEquals(0, myTransporter.getY(),0.01);
    }

    @Test
    public void testMoveWithCargo(){
        Volvo240 myVolvo = new Volvo240();
        myTransporter.stopEngine();
        myTransporter.lowerRamp();
        myTransporter.loadCargo(myVolvo);
        myTransporter.liftRamp();
        myTransporter.startEngine();
        myTransporter.move();
        assertEquals(0.1, myTransporter.getX(),0.001);
        //assertEquals(0.1, myVolvo.getX(), 0.001);
        myVolvo.move();
        assertEquals(0.1, myVolvo.getX(), 0.001);
    }

    @Test
    public void unLoadCargo(){
        Volvo240 volvo = new Volvo240();
        myTransporter.stopEngine();
        myTransporter.lowerRamp();
        myTransporter.loadCargo(volvo);
        myTransporter.liftRamp();
        myTransporter.lowerRamp();
        myTransporter.unloadCargo();
        volvo.move();
        assertEquals(myTransporter.getX()+5+0.1,volvo.getX(),0.001);
        assertEquals(myTransporter.getY()+5, volvo.getY(), 0.001);



    }

}
