package za.ca.cput.ngosa.designpatterns.creational.builder;

import za.ca.cput.ngosa.designpatterns.creational.builder.Charac;
import za.ca.cput.ngosa.designpatterns.creational.builder.CharacterMaker;

/**
 * Created by User on 2015/03/08.
 */
public class GenericCharacter implements CharacterMaker {

    private Charac character1;

    public GenericCharacter()
    {
        this.character1= new Charac();
    }
    @Override
    public void makeCharacterClan() {
        character1.setClan("Pyromancer");
    }

    @Override
    public void makeCharacterShield() {
        character1.setShield("balder");
    }

    @Override
    public void makeCharacterWeapon() {
        character1.setWeapon("zweihander");
    }

    @Override
    public void makeCharacterPerk() {
        character1.setPerk("binoculars");
    }

    @Override
    public Charac getCharacter() {
        return this.character1;
    }
}
