package za.ca.cput.ngosa.designpatterns.creational.factorymethod;

/**
 * Created by User on 2015/03/08.
 */
public class Human implements Species {
    @Override
    public String getPowerLevel() {
        return "3382";
    }

    @Override
    public String getName() {
        return "Yamcha";
    }
}
