package za.ca.cput.ngosa.designpatterns.structural.Proxy;

/**
 * Created by User on 2015/03/13.
 */
public class ProxyVehicle implements Vehicles {

    private RealVehicle realVehicle;
    private String plate;

    @Override
    public void displayPlate() {
        if(realVehicle==null)
        {
            realVehicle= new RealVehicle(plate);
        }
        realVehicle.displayPlate();
    }
}
