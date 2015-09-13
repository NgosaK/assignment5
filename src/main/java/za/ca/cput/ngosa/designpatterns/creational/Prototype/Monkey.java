package za.ca.cput.ngosa.designpatterns.creational.Prototype;

import za.ca.cput.ngosa.designpatterns.creational.Prototype.Animal;

/**
 * Created by User on 2015/03/09.
 */
public class Monkey implements Animal {

    public Monkey()
    {
        System.out.println("Moneky was created");
    }

    @Override
    public Animal createCopy() {

        System.out.println("Moneky is being created");

        Monkey mon1= null;

        try {
            mon1= (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mon1;
    }
}
