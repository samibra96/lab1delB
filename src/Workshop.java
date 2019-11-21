import java.awt.*;
import java.util.ArrayList;

public class Workshop <T extends Vehicle> {

    //private  T t;
    //private S s;
    private int maxUnits;

    ArrayList<T> workshopUnits = new ArrayList<>(maxUnits);


    public Workshop (int maxUnits){
        this.maxUnits = maxUnits;
    }

    public void putInWorkshop (T t){
        workshopUnits.add(t);
    }

    public void removeFromWorkshop(){
        // TODO
        workshopUnits.get(0).setX(0);               //Hardcoded out position
        workshopUnits.get(0).setY(0);               //Hardcoded out position

        workshopUnits.remove(0);
    }


}
