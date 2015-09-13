package za.ca.cput.ngosa.designpatterns.creational.builder;

/**
 * Created by User on 2015/03/08.
 */
public class Charac implements CharacterBuilder {

    private String characterClan;
    private String CharacterShield;
    private String CharacterWeapon;
    private String CharacterPerk;


    @Override
    public void setClan(String clan) {
        characterClan=clan;
    }

    public String getCharacterShield() {
        return CharacterShield;
    }

    public String getCharacterWeapon() {
        return CharacterWeapon;
    }

    public String getCharacterPerk() {
        return CharacterPerk;
    }

    public String getCharacterClan() {
        return characterClan;
    }

    @Override
    public void setShield(String shield) {
        CharacterShield=shield;
    }

    @Override
    public void setWeapon(String weapon) {
        CharacterWeapon=weapon;
    }

    @Override
    public void setPerk(String perk) {
        CharacterPerk=perk;
    }
}
