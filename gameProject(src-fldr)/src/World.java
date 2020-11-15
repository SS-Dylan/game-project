//Author:   Seth Gilstrap

import java.util.ArrayList;

public class World {

    public Arraylist<Chest> chest = new ArrayList<Chest>();
    public ArrayList<Barrel> barrel = new ArrayList<Barrel>();
    public ArrayList<Person> people = new ArrayList<Person>();
    public Person player;

    public World()
    {
        chest0 = new chest;
        chest1 = new chest;
        chest2 = new chest;
        barrel0 = new barrel;
        barrel1 = new barrel;
        barrel2 = new barrel;
        goblin0 = new person;
        goblin1 = new person;
        goblin2 = new person;
        human0 = new person;
    }

    public void makeChest()
    {

        Chest.add();
    }

    public void makeBarrel()
    {
        new barrel;
        Barrel.add();
    }

    public void makeHuman()
    {

        Person.add(human);
    }

    public void makeGoblin()
    {

        Person.add(goblin);
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

    }

    public boolean equipEquipment(Equipment eqmt)
    {

    }

    public boolean useEquipment(Equipment eqmt, Person target)
    {

    }
}
