import java.util.Objects;

/**
 * Dylan Colburn
 * CSCI 1260-901
 */


public class RaceManager extends Weapon implements IHitable
{

    /**
     * Paramterized constructor for weapon
     *
     * <hr>
     * Date created: Oct 14, 2020
     *
     * <hr>
     *
     * @param name
     * @param dmg
     * @param ice
     * @param fire
     * @param wp
     */
    public RaceManager(String name, int dmg, int ice, int fire, WeaponHandedness wp) {
        super(name, dmg, ice, fire, wp);
    }

    public RaceManager() {
        super();
    }


    public void alterDamage(Race race)
{
    {
        if(race.equals(Race.HUMAN))
        {
            takeDamage(3,10,4);
        }
        if(race.equals(Race.GOBLIN))
        {
            takeDamage(7,4,4);
        }

        if(race.equals(Race.ORC))
        {
            takeDamage(4,5,10);
        }

        if(race.equals(Race.ELF))
        {
            takeDamage(7,2,2);
        }

        if(race.equals(Race.DWARF))
        {
            takeDamage(5,7,3);
        }

       if(race.equals(Race.MANDOLORIAN))
        {
            takeDamage(1,3,3);
        }
    }

}

public int alterWeaponAttack(Race race)
{
    if(race.equals(Race.HUMAN))
    {
        int normalDamage = getNormalDamage();
        normalDamage += 7;
        return normalDamage;
    }
    if(race.equals(Race.GOBLIN))
    {
        int normalDamage = getNormalDamage();
        normalDamage += 4;
        return normalDamage;
    }

    if(race.equals(Race.ORC))
    {
        int normalDamage = getNormalDamage();
        normalDamage += 2;
        return normalDamage;
    }

    if(race.equals(Race.ELF))
    {
        int normalDamage = getNormalDamage();
        normalDamage += 2;
        return normalDamage;
    }

    if(race.equals(Race.DWARF))
    {
        int normalDamage = getNormalDamage();
        normalDamage += 4;
        return normalDamage;
    }

    if(race.equals(Race.MANDOLORIAN))
    {
        int normalDamage = getNormalDamage();
        normalDamage += 6;
        return normalDamage;
    }
    return 0;
}

public int alterFireAttack(Race race)
{
    if(race.equals(Race.HUMAN))
    {
        int fireDamage = getFireDamage();
        fireDamage += 3;
        return fireDamage;
    }
    if(race.equals(Race.GOBLIN))
    {
        int fireDamage = getFireDamage();
        fireDamage += 3;
        return fireDamage;
    }

    if(race.equals(Race.ORC))
    {
        int fireDamage = getFireDamage();
        fireDamage += 2;
        return fireDamage;
    }

    if(race.equals(Race.ELF))
    {
        int fireDamage = getFireDamage();
        fireDamage += 3;
        return fireDamage;
    }

    if(race.equals(Race.DWARF))
    {
        int fireDamage = getFireDamage();
        fireDamage += 6;
        return fireDamage;
    }

    if(race.equals(Race.MANDOLORIAN))
    {
        int fireDamage = getFireDamage();
        fireDamage += 7;
        return fireDamage;
    }

    return 0;
}

public int alterIceAttack(Race race)
{
    if(race.equals(Race.HUMAN))
    {
        int iceDamage = getIceDamage();
        iceDamage += 3;
        return iceDamage;
    }
    if(race.equals(Race.GOBLIN))
    {
        int iceDamage = getIceDamage();
        iceDamage += 5;
        return iceDamage;
    }

    if(race.equals(Race.ORC))
    {
        int iceDamage = getIceDamage();
        iceDamage += 6;
        return iceDamage;
    }

    if(race.equals(Race.ELF))
    {
        int iceDamage = getIceDamage();
        iceDamage += 5;
        return iceDamage;
    }

    if(race.equals(Race.DWARF))
    {
        int iceDamage = getIceDamage();
        iceDamage += 3;
        return iceDamage;
    }

    else if(race.equals(Race.MANDOLORIAN))
    {
        int iceDamage = getIceDamage();
        iceDamage += 1;
        return iceDamage;
    }
    return 0;
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

    @Override
    public int takeDamage(int dmg, int fire, int ice) {
        return 0;
    }

    @Override
    public int heal(int amt) {
        return 0;
    }
}