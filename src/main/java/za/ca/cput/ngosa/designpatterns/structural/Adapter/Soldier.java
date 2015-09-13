package za.ca.cput.ngosa.designpatterns.structural.Adapter; /**
 * Created by User on 2015/03/09.
 */
import java.util.*;

public class Soldier {

    private Random randomGenerator= new Random();
    public void run(){
        int movement= randomGenerator.nextInt(10)+1;

        System.out.printf("Soldier has run %d miles"+movement);

    }

    public void radioIn()
    {
        System.out.println("Soldier calls in air strike");
    }

    public void firePistol()
    {
        int damage= randomGenerator.nextInt(20)+5;

        System.out.printf("Pistol does %d damage"+damage);
    }

    public void throwGrenade()
    {
        int damage= randomGenerator.nextInt(30)+5;

        System.out.printf("grenade does %d damage"+damage);
    }
}


