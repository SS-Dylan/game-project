/**
 * Dylan Shaffer
 * CSCI 1260-901
 */
public abstract class CombatManager extends Enemy implements IHitable {

    public CombatManager(String Name) {
        super(Name);
    }

    public Race getEnemyRace() {
        return getPlayerRace();
    }

    public boolean enemyKilled() {
        if(Enemy.getCurrentHealth <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean surrender()
    {
        boolean finish = false;
        if(finish = true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String flavorText() { //?????
        return "What the hell is flavor text?";
    }
}