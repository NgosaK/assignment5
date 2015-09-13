package za.ca.cput.ngosa.designpatterns.creational.builder;

/**
 * Created by User on 2015/03/08.
 */
public interface CharacterMaker {

    public void makeCharacterClan();
    public void makeCharacterShield();
    public void makeCharacterWeapon();
    public void makeCharacterPerk();
    public Charac getCharacter();

}
