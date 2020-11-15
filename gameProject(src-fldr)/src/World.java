import java.util.ArrayList;

public class World {

    public ArrayList Chest = new ArrayList<>();
    public ArrayList Barrel  = new ArrayList<>();
    public ArrayList Person = new ArrayList<>();



    public World()
    {

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

    }

    public String speakTo(person Person)
    {

    }

    public int attack(target IHitable)
    {

    }

    public void transferEquipment(source IInventory, destination IInventory)
    {

    }

    public String peakInside(inventory IInventory)
    {

    }

    public String getPersonInfo(person Person)
    {

    }

    public String getPlayerInfo()
    {

    }

    public String listPlayerInventory()
    {

    }

    public boolean equipEquipment(eqmt Equipment)
    {

    }

    public boolean useEquipment(eqmt Equipment, target Person)
    {

    }
}
