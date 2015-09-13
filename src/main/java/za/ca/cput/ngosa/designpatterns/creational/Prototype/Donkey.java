package za.ca.cput.ngosa.designpatterns.creational.Prototype;

/**
 * Created by User on 2015/03/09.
 */
public class Donkey implements Animal {

    public Donkey()
    {
        System.out.println("Donkey was created");
    }

    @Override
    public Animal createCopy() {

        System.out.println("Donkey is being created");

        Donkey don1= null;

        try {
            don1= (Donkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return don1;
    }

    }

