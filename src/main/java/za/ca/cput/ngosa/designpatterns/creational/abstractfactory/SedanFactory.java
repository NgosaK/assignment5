package za.ca.cput.ngosa.designpatterns.creational.abstractfactory;

import za.ca.cput.ngosa.designpatterns.creational.abstractfactory.Car;
import za.ca.cput.ngosa.designpatterns.creational.abstractfactory.ISF;
import za.ca.cput.ngosa.designpatterns.creational.abstractfactory.M3;

/**
 * Created by User on 2015/03/08.
 */
public class SedanFactory implements  VehicleFactory {
    @Override
    public Car getCarName(String categ) {
        if("M3".equals(categ))
        {
            return new M3();
        }
        else
            return new ISF();
    }
}
