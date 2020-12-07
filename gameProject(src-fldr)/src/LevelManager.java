/**
 * Dylan Shaffer
 * CSCI 1260-901
 */

public class LevelManager{

    public  Player player = new Player();

    public void levelUp() { //Not fully sure on this one
        if (player.getCurrentExp() == 100) { //Add a level up method to player?
            int playerLevel = player.getPlayerLevel();
            playerLevel++;
            player.setPlayerLevel(playerLevel);
        } else if (player.getCurrentExp() <= 100) {
            ;
        }
    }

    public void earnExp(Player player, int earnedExp)
    {
        player.setCurrentExp(player.getCurrentExp() + earnedExp);
    }

    public int getExp(Player player)
    {
        return player.getCurrentExp();
    }

        public void increaseWeaponDamage(Player player, Weapon weapon)
        {
            weapon.setNormalDamage(weapon.getNormalDamage() + (player.getPlayerLevel() * 1/4));
        }

        public void increaseFireDamage(Player player, Weapon weapon)
        {
            weapon.setFireDamage(weapon.getFireDamage() + (player.getPlayerLevel() * 1/2));
        }

        public void increaseIceDamage(Player player, Weapon weapon)
        {
            weapon.setIceDamage(weapon.getIceDamage() + (player.getPlayerLevel() * 1/2));
        }

        public boolean checkLevelUp(Player player) { //Changed to true/false to decide if okay level up

        if(player.getPlayerLevel() >= 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    }