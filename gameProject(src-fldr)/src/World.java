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
        Chest.add(Chest);
    }

    public void makeBarrel()
    {
        Barrel.add(Barrel);
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
            if(chest.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<chest.size())
                {
                    details += (i+ ". " + chest.get(i).getEquipmentList() +"\n");
                }//end while
                i = 0;
            }//end else
        }
    }

    public String listBarrels()
    {
        {
            String details = "";
            int i = 0;
            details += "Barrels:\n";
            if(barrel.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<barrel.size())
                {
                    details += (i+ ". " + barrel.get(i).getEquipmentList() +"\n");
                }//end while
                i = 0;
            }//end else
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
        }
    }

    public String listTargets()
    {
        System.out.println(listPeople() + listBarrels());
    }

    public String speakTo(Person person)
    {
        Person.thingsToSay();
    }

    public int attack(IHitable target)
    {
        int damage = 0;
        if(player.Weapon().isEmpty() == true)
            System.out.println("No weapon equipped!");
        else
        {
            return target.takeDamage();
        }
    }

    public void transferEquipment(IInventory source, IInventory destination)
    {

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
        return IInventory.get(player);
    }

    public boolean equipEquipment(Equipment eqmt)
    {
        inventory.remove(eqmt);
    }

    public boolean useEquipment(Equipment eqmt, Person target)
    {

    }
}
