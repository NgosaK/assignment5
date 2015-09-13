package za.ca.cput.ngosa.designpatterns.structural.Proxy;

/**
 * Created by User on 2015/03/13.
 */
public class RealVehicle implements Vehicles {

   private String plate;

    public RealVehicle(String plate)
    {
        this.plate=plate;
        loadPlate(plate);

    }

    private void loadPlate(String plate)
    {
        System.out.println("loading "+plate);
    }

    @Override
    public void displayPlate() {
        System.out.println("Displaying: "+plate);
    }
}
