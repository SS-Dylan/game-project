/**
 * Dylan Shaffer
 * CSCI 1260-901
 */

public class LevelManager{

    public void levelUp() { //Not fully sure on this one
        if (getExp() == 100) { //Add a level up method to player?
            Player.getPlayerLevel++;
        } else if (getExp() <= 100) {
            playerLevel = getPlayerLevel;
        }
    }

    public void earnExp() {

    }

    public int getExp() {
        return Player.getCurrentExp();
    }

    public void increaseWeaponDamage(int level) {

    }

    public void increaseFireDamage(int level) {

    }

    public void increaseIceDamage(int level) {

    }

    public boolean checkLevelUp() { //Changed to true/false to decide if okay level up

        if(Player.getPlayerLevel() >= 100) {
            return true;
        } else {
            return false;
        }
    }
}