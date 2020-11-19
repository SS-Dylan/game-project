//Author:   Seth Gilstrap

import java.util.*;

public class World implements IUsable, IHitable, IInventory{

   /* public ArrayList Chest = new ArrayList<>();
    public ArrayList Barrel = new ArrayList<>();
    public ArrayList Person = new ArrayList<>(); */
    public ArrayList<Chest> chests = new ArrayList<>();
    public ArrayList<Barrel> barrels = new ArrayList<>();
    public ArrayList<Person> people = new ArrayList<>();
    public Person player;


    public World()
    {
        makeChest();
        makeChest();
        makeChest();
        makeBarrel();
        makeBarrel();
        makeBarrel();
        makeGoblin();
        makeGoblin();
        makeGoblin();
        makeHuman();
    }

    public void makeChest()
    {
        chests.add(new Chest());
    }

    public void makeBarrel()
    {
        barrels.add(new Barrel());
    }

    public void makeHuman()
    {
        people.add(new Human());
    }

    public void makeGoblin()
    {
        people.add(new Goblin());
    }

    public String listChests()
    {
        {
            String details = "";
            int i = 0;
            details += "Chests:\n";
            if(chests.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<chests.size())
                {
                    details += (i+ ". " + chests.get(i).getEquipmentList() +"\n");
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
            if(barrels.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<barrels.size())
                {
                    details += (i+ ". " + barrels.get(i).getEquipmentList() +"\n");
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
            if(people.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<people.size())
                {
                    details += (i+ ". " + people.get(i).getEquipmentList() +"\n");
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
        if(person instanceof Human)
        {
            return ((Human) person).excited();
        }

        else if(person instanceof Goblin)
        {
            return ((Goblin) person).greeting();
        }

        else
        {
            return "That ain't a person, bro.";
        }
    }

    public int attack(IHitable target)
    {
        int damage = 0;
        if(player.getWeapon() == null)
            System.out.println("No weapon equipped!");
        else
        {
            damage = player.attack(target);
        }
        return damage;
    }

    public void transferEquipment(IInventory source, IInventory destination)
    {
        destination.transferAllEquipmentFrom(source);
        //IInventory.destination().add(source);
        //source.remove(source)
    }

    public String peakInside(IInventory inventory)
    {
        return player.getEquipmentList();
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
        return player.getEquipmentList();
    }

    public boolean equipEquipment(Equipment eqmt)
    {
        boolean equipped = true;
        player.equip(eqmt);
        return equipped;
    }

    public boolean useEquipment(Equipment eqmt, Person target)
    {
        boolean used = true;
        if(eqmt instanceof Armor)
        {
            Armor.use(eqmt);
        }
        else if(eqmt instanceof Weapon)
        {
            player.geE().use(target);
        }
        //player.getEquipment(eqmt).use(target); getEquipment calls for an index, not a String
        //eqmt.use(target); No use method for the Equipment class. Maybe we need to make one? Not on UML.
        //.use(target) The parameter of the use method should be target, but how does eqmt relate?
        //IUsable.use(target);
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
