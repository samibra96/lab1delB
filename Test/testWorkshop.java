import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testWorkshop {
    Workshop<Cars> carsWorkshop;
    Workshop<Volvo240> volvo240Workshop;
    Workshop<Saab95> saab95Workshop;
    Workshop<Truck> truckWorkshop;
    Workshop<CarTransport> carTransportWorkshop;
    Workshop<Vehicle> vehicleWorkshop;

    @Before
    public void initObjects() {
        carsWorkshop = new Workshop<>(2);
        saab95Workshop = new Workshop<>(2);
        truckWorkshop = new Workshop<>(2);
        carTransportWorkshop = new Workshop<>(2);
        vehicleWorkshop = new Workshop<>(2);
    }

    @Test
    public void carsWorkshop(){
         Saab95 mySaab = new Saab95();
         Volvo240 myVolvo = new Volvo240();
         Scania myScania = new Scania();
         Saab95 mySndSaab = new Saab95();
         carsWorkshop.putInWorkshop(mySaab);
         carsWorkshop.putInWorkshop(myVolvo);
         //carsWorkshop.putInWorkshop(myScania);
         carsWorkshop.putInWorkshop(mySndSaab);
         carsWorkshop.removeFromWorkshop();
         carsWorkshop.removeFromWorkshop();
         carsWorkshop.removeFromWorkshop();
         //carsWorkshop.removeFromWorkshop();
         //carsWorkshop.removeFromWorkshop();
    }

    @Test
    public void testBrandWorkshop(){
        Scania myScania = new Scania();
        Saab95 mySaab = new Saab95();
        Volvo240 myVolvo = new Volvo240();
        volvo240Workshop = new Workshop<>(2);
        volvo240Workshop.putInWorkshop(myVolvo);
        //volvo240Workshop.putInWorkshop(mySaab);
        //volvo240Workshop.putInWorkshop(myScania);
        //Saab95 sndSaab = volvo240Workshop.removeFromWorkshop();
        Volvo240 sndVolvo = volvo240Workshop.removeFromWorkshop();
        assert(sndVolvo!= null);
    }





}
