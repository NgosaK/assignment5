package za.ca.cput.ngosa.designpatterns.structural.Adapter; /**
 * Created by User on 2015/03/09.
 */
import java.util.*;

public class VTOLAircraft implements Military {

    private Random rand= new Random();

    @Override
    public void fireMissle() {
        int dam= rand.nextInt(10)+3;
        System.out.printf("VTOLAircraft has done: %d damage" + dam);
    }

    @Override
    public void fireSMG() {
        int dam= rand.nextInt(50)+10;
        System.out.printf("SMG has done: %d damage"+dam);
    }

    @Override
    public void dropClusterBombs() {
        int dam= rand.nextInt(100)+60;
        System.out.printf("Cluster bombs has done: %d damage"+dam);
    }

    @Override
    public void launchFatMan() {
        int dam= rand.nextInt(1000)+500;
        System.out.printf("Fatman has done: %d damage"+dam);
    }
}
