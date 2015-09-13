package za.ca.cput.ngosa.designpatterns.creational.abstractfactory;

import za.ca.cput.ngosa.designpatterns.creational.abstractfactory.Car;

/**
 * Created by User on 2015/03/08.
 */
public class M3 implements Car {
    @Override
    public String getTopSpeed() {
        return "160";
    }
}
