import java.awt.*;
import java.util.ArrayList;

public class Workshop <T> {

    private  T t;
    //private S s;
    private int maxUnits;

    ArrayList<T> workshopUnits = new ArrayList<>(maxUnits);


    public Workshop (int maxUnits){
        this.maxUnits = maxUnits;
    }

    public void putInWorkshop (T t){
        workshopUnits.add(t);
    }

    public void removeFromWorkshop(T t){
        // TODO
        workshopUnits.remove(0);
    }


}
