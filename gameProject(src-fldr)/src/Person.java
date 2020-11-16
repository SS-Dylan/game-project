import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;

public abstract class Person implements IInventory, IHitable {
    private String name;
    private ArrayList<String> thingsToSay = new ArrayList();
    private Helmet helmet;
    private Plackart plackart;
    private Weapon weapon;
    private EquipmentManager inventory;
    private int maxHealth;
    private int currentHealth;

    public Person(String Name) {

        name= Name;
        maxHealth= Ihitable.maxHealth;
        currentHealth =Ihitable.currentHealth;
    }

    public String saySomething()
    {
        int randomIndex = (int)(Math.random()*thingsToSay.size());
        return thingsToSay.get(randomIndex);
    }

    public boolean equip(Equipment e)
    {
        if (e instanceof Helmet)
        {
            if (helmet == null)
            {
                pickup(e);
            }
            helmet = (Helmet) e;
        }
        else if (e instanceof Plackart)
        {
            if(plackart == null)
            {
                pickup(e);
            }
            plackart = (Plackart) e;
        }
        else if(e instanceof Weapon)
        {
            if (weapon == null)
            {
                pickup(e);
            }
            weapon = (Weapon)e;
        }
        else
        {
            return false;
        }
        return true;
    }
    public int attack(Ihitable target){

        if (weapon == null)
        {
            return 0;
        }
        return weapon.attack(target);
    }

    public String getName()
    {
        return name;
    }

    public String toString(){

        String helmetName;
        String plackartName;
        String weaponName;

        if(helmet != null)
        {
            helmetName = helmet.getName();
        }
        else
        {
            helmetName = "None";
        }
        if (plackart != null)
        {
            plackartName = plackart.getName();
        }
        else
        {
            plackartName = "None";
        }
        if (weapon != null)
        {
            weaponName = weapon.getName();
        }
        else
        {
            weaponName = "None";
        }

        return "Name: " + name + "Current Health: " + currentHealth/maxHealth + "Helmet: " + helmetName + "Plackart: " + plackartName + "Weapon: " + weaponName;
    }

    public abstract ArrayList<String> getThingsToSay();

    public void setThingsToSay(ArrayList<String> list){

    }

    @Override
    public int takeDamage(int dmg, int fire, int ice) {
        if (helmet != null)
        {
            if (helmet.hasIceProtection())
            {
                ice -= 3;
            }

            if (helmet.hasFireProtection())
            {
                fire -= 3;
            }
        }

        if (plackart != null)
        {
            if (plackart.hasIceProtection())
            {
                ice -= 3;
            }

            if (plackart.hasFireProtection())
            {
                fire -= 3;
            }
        }

        if (ice < 0)
            ice = 0;

        if (fire < 0)
            fire = 0;

        int totalDamage = dmg + ice + fire;

        if (helmet != null)
        {
            totalDamage -= helmet.getArmorBonus();
        }

        if (plackart != null)
        {
            totalDamage -= plackart.getArmorBonus();
        }

        if (totalDamage < 0)
            totalDamage = 0;

        return totalDamage;
    }
}
