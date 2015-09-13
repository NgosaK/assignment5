package za.ca.cput.ngosa.designpatterns.creational.singleton;

/**
 * Created by User on 2015/03/08.
 */
public class Singleton {

    private static Singleton initial= null;

    private Singleton()
    {

    }


    public static Singleton newInstance()
    {
        if(initial== null)
        {
            initial= new Singleton();
        }
        return initial;
    }
}


