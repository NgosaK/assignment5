package za.ca.cput.ngosa.designpatterns.creational.builder;

import za.ca.cput.ngosa.designpatterns.creational.builder.Charac;

/**
 * Created by User on 2015/03/08.
 */
public class CharacterDirector {

    private CharacterMaker characterMaker;

    public CharacterDirector(CharacterMaker characterMaker)
    {
        this.characterMaker= characterMaker;
    }


    public Charac getCharacter()
    {
        return  this.characterMaker.getCharacter();
    }

    public void makeCharacter()
    {
          this.characterMaker.makeCharacterClan();
          this.characterMaker.makeCharacterPerk();
          this.characterMaker.makeCharacterShield();
          this.characterMaker.makeCharacterWeapon();

    }
}
