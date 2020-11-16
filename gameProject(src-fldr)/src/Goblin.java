//Author:   Seth Gilstrap

import java.util.ArrayList;

public class Goblin extends Person
{
    public Goblin()
    {
        super("Goblin");
    }

    public Goblin(String Name)
    {
        super(Name);
    }

    @Override
    public ArrayList<String> getThingsToSay() {
        return null;
    }

    public String insult()
    {
        return "What are you looking at, you lint-licker?";
    }

    public String threat()
    {
        return "Gimme all your gold!!!";
    }

    public String greeting()
    {
        return "Greetings, Goblin-Brother!";
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
