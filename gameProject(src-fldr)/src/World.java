//Author:   Seth Gilstrap

import java.util.ArrayList;

public class World implements IUsable, IHitable, IInventory{

    public ArrayList Chest = new ArrayList<>();
    public ArrayList Barrel = new ArrayList<>();
    public ArrayList Person = new ArrayList<>();
    public person player;


    public World()
    {
<<<<<<< HEAD
    makeChest();
    makeBarrel();
    makeHuman();
    makeGoblin();
=======

>>>>>>> f5980222f40a8273b816212f481458a561c40110
    }

    public void makeChest()
    {
<<<<<<< HEAD
        Chest.add(1);
=======
        Chest chest1 = new Chest();
        Chest.add(chest1);
>>>>>>> f5980222f40a8273b816212f481458a561c40110
    }

    public void makeBarrel()
    {
        Barrel.add(2);
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
<<<<<<< HEAD

                    details += (i+ ". " + Chest.get(i).getEquipmentList +"\n");
                    details += (i+ ". " + chest.get(i).getEquipmentList() +"\n");

=======
                    details += (i+ ". " + Chest.get(i).getEquipmentList() +"\n");
>>>>>>> f5980222f40a8273b816212f481458a561c40110
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
        }
    }

    public String listTargets()
    {
        System.out.println(listPeople() + listBarrels());
    }

    public String speakTo(Person person)
    {
        person.thingsToSay();
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
