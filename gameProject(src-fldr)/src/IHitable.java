public interface IHitable
{
    public int getMaxHealth();
    public int getCurrentHealth();
    public boolean isHitableDestroyed();
    public int takeDamage(int dmg, int fire, int ice);
    public int heal(int amt);

}
