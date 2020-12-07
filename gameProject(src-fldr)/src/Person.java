import java.util.ArrayList;

public class Person implements IInventory, IHitable {
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
        maxHealth= IHitable.maxHealth;
        currentHealth =IHitable.currentHealth;
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
    public int attack(IHitable target){

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

    public Weapon getWeapon()
    {
        return weapon;
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

    @Override
    public int heal(int amt) {
        return 0;
    }

    @Override
    public int getMaxHealth() {
        return 0;
    }

    public int getCurrentHealth()
    {
        return currentHealth;
    }

    @Override
    public boolean isHitableDestroyed() {
        return false;
    }

    @Override
    public void pickup(Equipment equipment) {

    }

    @Override
    public void transferAllEquipmentFrom(IInventory other) {

    }

    @Override
    public int countArmor() {
        return 0;
    }

    @Override
    public int countWeapon() {
        return 0;
    }

    @Override
    public int countConsumables() {
        return 0;
    }

    @Override
    public int countEquipment() {
        return 0;
    }

    @Override
    public String getEquipmentList() {
        return null;
    }

    @Override
    public void getEquipmentInfo(String list, int index) {

    }

    @Override
    public Equipment getEquipment(int index) {
        return null;
    }

    @Override
    public void dropEquipment(int index) {

    }

    @Override
    public void dropAllEquipment() {

    }

    @Override
    public void addEquipment(Equipment equipment) {

    }
}
