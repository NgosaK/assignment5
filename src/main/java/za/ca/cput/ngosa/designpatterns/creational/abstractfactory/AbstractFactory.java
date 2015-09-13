package za.ca.cput.ngosa.designpatterns.creational.abstractfactory;

/**
 * Created by User on 2015/03/08.
 */
public class AbstractFactory {
    public  VehicleFactory getVehicleType(String type)
    {
        if(type.equalsIgnoreCase("Hybrid"))
        {
            return new HybridFactory();
        }
        else
            return new SedanFactory();
    }


}
