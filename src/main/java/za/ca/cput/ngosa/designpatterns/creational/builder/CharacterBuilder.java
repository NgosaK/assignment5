package za.ca.cput.ngosa.designpatterns.creational.builder;

/**
 * Created by User on 2015/03/08.
 */
public interface CharacterBuilder {

    public void setClan(String clan);
    public void setShield(String shield);
    public void setWeapon(String weapon);
    public void setPerk(String perk);

}
