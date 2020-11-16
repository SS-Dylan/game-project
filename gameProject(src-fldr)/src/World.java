//Author:   Seth Gilstrap

import java.util.ArrayList;

public class World implements IUsable, IHitable, IInventory{

    public ArrayList Chest = new ArrayList<>();
    public ArrayList Barrel = new ArrayList<>();
    public ArrayList Person = new ArrayList<>();
    public Person player;
<<<<<<< HEAD


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
        Barrel.add(2);
        Barrel.add(1);
        Barrel.add(Barrel);
    }

    public void makeHuman()
    {
<<<<<<< HEAD
        Person.add(1);
=======
        Person.add(Human);
>>>>>>> 657f1139a0abfcff2c72c7c5ea0a4f67c2be575e
    }

    public void makeGoblin()
    {
<<<<<<< HEAD

        Person.add();
=======
        Person.add(Goblin);
>>>>>>> 657f1139a0abfcff2c72c7c5ea0a4f67c2be575e
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
                    details += (i+ ". " + Chest.get(i).getEquipmentList +"\n");
                }
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
