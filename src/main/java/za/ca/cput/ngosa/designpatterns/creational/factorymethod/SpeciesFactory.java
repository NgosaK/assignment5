package za.ca.cput.ngosa.designpatterns.creational.factorymethod;

/**
 * Created by User on 2015/03/08.
 */
public class SpeciesFactory {

    public Species makeSpecie(String newSpecie)
    {
        Species newSpe= null;
        if (newSpecie=="S")
        {
            newSpe= new Saiyan();
            return newSpe;
        }

        else if(newSpecie=="N")
        {
            newSpe= new Namekian();
            return newSpe;
        }

        else if(newSpecie=="H")
        {
            newSpe= new Human();
            return newSpe;
        }
        else
            return null;
    }
}
