public interface IHitable
{
    int maxHealth = 50;
    int currentHealth= 40;
    int getMaxHealth();
    int getCurrentHealth();
    boolean isHitableDestroyed();
    int takeDamage(int dmg, int fire, int ice);
    int heal(int amt);
}
