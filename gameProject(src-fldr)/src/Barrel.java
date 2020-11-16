public class Barrel extends Chest implements IHitable {
    private int maxHealth;
    private int currentHealth;

    public Barrel(){
        super();
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

    @Override
    public void addEquipment(Equipment equipment) {

    }
}
