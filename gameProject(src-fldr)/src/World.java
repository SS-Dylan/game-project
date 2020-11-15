<<<<<<< HEAD
=======
//Author:   Seth Gilstrap

>>>>>>> 2a852b61294ac4d29313f456e81dabc3b5e2ccc8
import java.util.ArrayList;

public class World {

    public ArrayList Chest = new ArrayList<>();
    public ArrayList Barrel  = new ArrayList<>();
    public ArrayList Person = new ArrayList<>();



    public World()
    {
<<<<<<< HEAD

=======
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
>>>>>>> 2a852b61294ac4d29313f456e81dabc3b5e2ccc8
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

        Person.add(Person);
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
            if(Chest.isEmpty() == true)
                details += "<<empty>>\n";
            else
            {
                while(i<Chest.size())
                {
                    details += (i+ ". " + Chest.get(i).getEquipmentList() +"\n");
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
