/**
 * Dylan Shaffer
 * CSCI 1260-901
 */

public class LevelManager{

    public  Player player = new Player();

    public void levelUp() { //Not fully sure on this one
        if (getExp() == 100) { //Add a level up method to player?
            int playerLevel = player.getPlayerLevel();
            playerLevel++;
            player.setPlayerLevel(playerLevel);
        } else if (getExp() <= 100) {
            ;
        }
    }

    public void earnExp() {

    }

    public int getExp() {
        return player.getCurrentExp();
    }

    public void increaseWeaponDamage(int level) {

    }

    public void increaseFireDamage(int level) {

    }

    public void increaseIceDamage(int level) {

    }

    public boolean checkLevelUp() { //Changed to true/false to decide if okay level up

        if(player.getPlayerLevel() >= 100) {
            return true;
        } else {
            return false;
        }
    }
}