public abstract class Furniture implements IHitable{

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

    public int takeDamage(int dmg, int fire, int ice)
    {
        int totalDamage = dmg + ice + fire;
        return totalDamage;
    }

    public String sellFurniture(Furniture target)
    {

    }

    public String furnitureAttack(Furniture weapon, Person target)
    {

    }
}
