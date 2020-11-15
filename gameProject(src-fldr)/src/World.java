public class World {

    public Arraylist<Chest> chest = new ArrayList<Chest>();
    public ArrayList<Barrel> barrel = new ArrayList<Barrel>();
    public ArrayList<Person> people = new ArrayList<Person>();
    public Person player;

    public World()
    {
        chest = new chest;
        chest = new chest;
        chest = new chest;
        barrel = new barrel;
        barrel = new barrel;
        barrel = new barrel;
        goblin = new person;
        goblin = new person;
        goblin = new person;
        human = new person;
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
