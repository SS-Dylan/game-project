//Author:   Seth Gilstrap

import java.util.ArrayList;

public class World implements IUsable, IHitable, IInventory{

    public ArrayList Chest = new ArrayList<>();
    public ArrayList Barrel = new ArrayList<>();
    public ArrayList Person = new ArrayList<>();
    public Person player;


    public World()
    {
        makeChest();
        makeBarrel();
        makeHuman();
        makeGoblin();
    }

    public void makeChest()
    {
        Chest.add(1);
    }

    public void makeBarrel()
    {
        Barrel.add(1);
    }

    public void makeHuman()
    {
        Person.add(Human);
    }

    public void makeGoblin()
    {
        Person.add(Goblin);
    }

    public String listChests()
    {
        {
            String details = "";
            int i = 0;
            details += "Chests:\n";
            if(Chest.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<Chest.size())
                {
                    details += (i+ ". " + Chest.get(i).getEquipmentList+"\n");
                }
                i = 0;
            }//end else
            return details;
        }
    }

    public String listBarrels()
    {
        {
            String details = "";
            int i = 0;
            details += "Barrels:\n";
            if(Barrel.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<Barrel.size())
                {
                    details += (i+ ". " + Barrel.get(i).getEquipmentList() +"\n");
                }//end while
                i = 0;
            }//end else
            return details;
        }
    }

    public String listPeople()
    {
        {
            String details = "";
            int i = 0;
            details += "People:\n";
            if(Person.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<Person.size())
                {
                    details += (i+ ". " + Person.get(i).getEquipmentList() +"\n");
                }//end while
                i = 0;
            }//end else
            return details;
        }
    }

    public String listTargets()
    {
        return listPeople() + listBarrels();
    }

    public String speakTo(Person person)
    {
        return Person.thingsToSay();
    }

    public int attack(IHitable target)
    {
        int damage = 0;
        if(player.weapon() == null)
            System.out.println("No weapon equipped!");
        else
        {
            damage = target.takeDamage();
        }
        return damage;
    }

    public void transferEquipment(IInventory source, IInventory destination)
    {
        destination.add(source);
        source.remove
    }

    public String peakInside(IInventory inventory)
    {
        return IInventory.getEquipmentList();
    }

    public String getPersonInfo(Person person)
    {
        return person.getName();
    }

    public String getPlayerInfo()
    {
        return player.getName();
    }

    public String listPlayerInventory()
    {
        return player.inventory();
    }

    public boolean equipEquipment(Equipment eqmt)
    {
        boolean equipped = true;
        player.inventory().remove(eqmt);
        player.weapon().add(eqmt);
        return equipped;
    }

    public boolean useEquipment(Equipment eqmt, Person target)
    {
        boolean used = true;
        eqmt.use(target);
        return used;
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
    public int takeDamage(int dmg, int fire, int ice) {
        return 0;
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

    @Override
    public boolean use(Person person) {
        return false;
    }
}
