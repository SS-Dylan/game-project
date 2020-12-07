import java.util.ArrayList;

/**
 * ---------------------------------------------------------------------------
 * File name: Human.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Colburn
 * Course:  CSCI 1260
 * Creation Date: Nov. 15, 2020
 * ---------------------------------------------------------------------------
 */

public class Human extends Person
{
    public Human()
    {
        super("Villager");

    }
    public Human(String name)
    {
        super(name);
    }

    public ArrayList<String> getThingsToSay() {
        return null;
    }


    public String question()
    {
       return "Hmmmmm???";
    }

    public String excited()
    {

        return "LETS GOOO!";
    }

    public String King()
    {

        return "I am the king son.";
    }

    @Override
    public int getMaxHealth() {
        return 0;
    }

    @Override
    public int getCurrentHealth() {
        return 0;
    }

    @Override
    public boolean isHitableDestroyed() {
        return false;
    }

    @Override
    public int heal(int amt) {
        return 0;
    }

    @Override
    public void pickup(Equipment equipment) {

    }

    @Override
    public void transferAllEquipmentFrom(IInventory other) {

    }

    @Override
    public int countArmor() {
        return 0;
    }

    @Override
    public int countWeapon() {
        return 0;
    }

    @Override
    public int countConsumables() {
        return 0;
    }

    @Override
    public int countEquipment() {
        return 0;
    }

    @Override
    public String getEquipmentList() {
        return null;
    }

    @Override
    public void getEquipmentInfo(String list, int index) {

    }

    @Override
    public Equipment getEquipment(int index) {
        return null;
    }

    @Override
    public void dropEquipment(int index) {

    }

    @Override
    public void dropAllEquipment() {

    }

    @Override
    public void addEquipment(Equipment equipment) {

    }
}
