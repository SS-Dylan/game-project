/*

    Author: Seth Gilstrap

 */

public abstract class Furniture implements IHitable{        //This is abstract.  I think we need a furniture manager to be abstract.

    private String name;
    private int value;
    private String location;
    private int maxHealth;
    private int currentHealth;


    public Furniture()
    {

    }

    public Furniture(String Name, String location, int value)
    {
        name = Name;
        maxHealth = IHitable.maxHealth;
        currentHealth = IHitable.currentHealth;     //SHOULD we make health variables specifically for furniture???
        this.location = location;
        this.value = value;
    }

    public String getLocation()
    {
        return location;
    }

    public int getValue()
    {
        return value;
    }

    public int takeDamage(int dmg, int fire, int ice)
    {
        int totalDamage = dmg + ice + fire;
        return totalDamage;
    }

    public String sellFurniture(Furniture target)          //This should probably have a way to add gold to inventory. This is just a message.
    {
        String sold = "This thing is worthless!";
        if(target.value < 0)
        {
            return sold;
        }

        else
        {
            sold = "You have sold this for: " + value + " gold.";
        }
        return sold;
    }

    public String furnitureAttack(Furniture weapon, Person target)
    {
        //target.takeDamage(int dmg, int fire, int ice);
        
    }
}
