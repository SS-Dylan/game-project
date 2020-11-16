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
                    details += (i+ ". " + Chest.get(i).getEquipmentList +"\n");
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
        if(player.Weapon().isEmpty() == true)
            System.out.println("No weapon equipped!");
        else
        {
            damage = target.takeDamage();
        }
        return damage;
    }

    public void transferEquipment(IInventory source, IInventory destination)
    {
        IInventory.
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
        player.inventory(remove(eqmt));
    }

    public boolean useEquipment(Equipment eqmt, Person target)
    {
        eqmt.use(target);
    }
}
