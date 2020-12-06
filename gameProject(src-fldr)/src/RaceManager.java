import java.util.Objects;

/**
 * Dylan Colburn
 * CSCI 1260-901
 */


public class RaceManager extends Weapon
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

    public void alterWeaponDamage(Race race)
{


}

public void alterFireDamage(Race race)
{


}

public void alterIceDamage(Race race)
{
    {
        if(race.equals(Race.HUMAN))
        {
             setIceDamage(4);
        }
        if(race.equals(Race.GOBLIN))
        {
            setIceDamage(7);
        }

        if(race.equals(Race.ORC))
        {
            setIceDamage(5);
        }

        if(race.equals(Race.ELF))
        {
            setIceDamage(2);
        }

        if(race.equals(Race.DWARF))
        {
            setIceDamage(6);
        }

       else if(race.equals(Race.MANDOLORIAN))
        {
            setIceDamage(0);
        }
    }

}

public void alterWeaponAttack(Race race)
{


}

public void alterFireAttack(Race race)
{


}

public void alterIceAttack(Race race)
{
    if(race.equals(Race.GOBLIN))
    {
    Race.GOBLIN = setIceAttack();

    }
}
public void alterToHit(Race race)
{


}

public void alterEvasion(Race race)
{


}



}
   /* public void adjustDurability(int adjustment)
    {
        if(adjustment <= 1 && adjustment >= -1)
        {
            if((durability + adjustment) > 1)
                durability = 1;
            if((durability + adjustment) < 0)
                durability = 0;
            else
                durability += adjustment;
        }//end if
    }*/