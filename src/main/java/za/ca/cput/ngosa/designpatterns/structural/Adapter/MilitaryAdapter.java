package za.ca.cput.ngosa.designpatterns.structural.Adapter;

/**
 * Created by User on 2015/03/09.
 */
public class MilitaryAdapter  implements  Military{

    Soldier soldier;
    public MilitaryAdapter(Soldier rookie)
    {
        soldier=rookie;

    }

    @Override
    public void fireMissle() {
        soldier.run();
    }

    @Override
    public void fireSMG() {

        soldier.radioIn();
    }

    @Override
    public void dropClusterBombs() {
        soldier.throwGrenade();
    }

    @Override
    public void launchFatMan() {
        soldier.firePistol();
    }
}
