public class CombatAction {

    public int lightAttack(IHitable target, Weapon weapon)
    {
        return target.takeDamage(weapon.getNormalDamage() / 2, weapon.getFireDamage() / 2, weapon.getIceDamage() / 2);
    }

    public int mediumAttack(IHitable target, Weapon weapon)
    {
        return target.takeDamage(weapon.getNormalDamage(),weapon.getFireDamage(),weapon.getIceDamage());
    }

    public int heavyAttack(IHitable target, Weapon weapon)
    {
        return target.takeDamage(weapon.getNormalDamage()*2,weapon.getFireDamage()*2,weapon.getIceDamage()*2);
    }

    public int criticalAttack(IHitable target, Weapon weapon)
    {
        return target.takeDamage(weapon.getNormalDamage()*5,weapon.getFireDamage()*5,weapon.getIceDamage()*5);
    }

    public int guard(IHitable target, Weapon weapon)
    {
        return target.takeDamage(weapon.getNormalDamage()/5, weapon.getFireDamage()/5, weapon.getIceDamage()/5);
    }

    public boolean useItem(IHitable target, Player player)
    {
        target.heal(15);
        return true;
    }
}