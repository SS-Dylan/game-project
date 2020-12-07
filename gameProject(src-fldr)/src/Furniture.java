/*

    Author: Seth Gilstrap

 */

public class Furniture implements IHitable{        //This is abstract.  I think we need a furniture manager to be abstract.

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

    @Override
    public int getMaxHealth() {
        return 0;
    }

    @Override
    public int getCurrentHealth() {
        return 0;
    }

    @Override
    public boolean isHitableDestroyed() {
        return false;
    }

    public int takeDamage(int dmg, int fire, int ice)
    {
        int totalDamage = dmg + ice + fire;
        return totalDamage;
    }

    @Override
    public int heal(int amt) {
        return 0;
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
