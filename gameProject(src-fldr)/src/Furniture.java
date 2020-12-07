/*

    Author: Seth Gilstrap

 */

public abstract class Furniture implements IHitable{        //This is abstract.  I think we need a furniture manager to be abstract.

    private String name;
    private int value;
    private String location;
    private int maxHealth;
    private int currentHealth;
    private boolean sold;


    public Furniture()
    {

    }

    public Furniture(String Name, String location, int value)
    {
        name = Name;
        maxHealth = IHitable.maxHealth;
        currentHealth = IHitable.currentHealth;
        this.location = location;
        this.value = value;
        this.sold = false;
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

    public int sellFurniture(Furniture target)
    {
        if(sold == false)
        {
            this.sold = true;
            return value;
        }
        else
        {
            return 0;
        }
    }

    public String furnitureAttack(Furniture weapon, Person target)
    {
        String furnAttack = "The " + weapon + " has attacked " + target + "!";
        target.takeDamage(5, 0, 0);
        return furnAttack;
    }
}
