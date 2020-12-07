import java.util.ArrayList;

/**
 * Dylan Colburn
 * CSCI 1260-901
 */

public class Player extends Person implements IHitable{

    private String playerName;
    private int age;
    private Race playerRace;
    private int playerLevel;
    private int currentExp;
    private Person playerPerson;
    private int money;

    public Player(String Name) {
        super(Name);
    }

    public Player()
    {
        super("Finn");
        playerName = "Finn";
        age = 14;
        playerRace = Race.HUMAN;
        playerLevel = 1;
        currentExp = 0;
        playerPerson = new Person("Finn");
        money = 0;
    }

    public ArrayList<String> getThingsToSay() {
        return null;
    }


    public String getPlayerName()
    {

        return playerName;
    }

    public int getPlayerAge()
    {
        return age;
    }

    public Race getPlayerRace()
    {
        return playerRace;
    }

    public int getPlayerLevel()
    {
        return playerLevel;
    }

    public void setPlayerLevel(int level)
    {
        this.playerLevel = level;
    }

    public int getCurrentExp()
    {
        return currentExp;
    }

    public void setCurrentExp(int exp)
    {
        if (exp >= 0)
        {
            this.currentExp = exp;
        }
        else
        {
            exp =  0;
        }
    }

    public int getMoney()
    {
        return money;
    }

    public int addMoney(int amt)
    {
        money = money + amt;
        return money;
    }

    @Override
    public int getMaxHealth() {
        return 0;
    }

    @Override
    public boolean isHitableDestroyed() {
        return false;
    }

    @Override
    public int heal(int amt) {
        return 0;
    }

    @Override
    public void pickup(Equipment equipment) {

    }

    @Override
    public void transferAllEquipmentFrom(IInventory other) {

    }

    @Override
    public int countArmor() {
        return 0;
    }

    @Override
    public int countWeapon() {
        return 0;
    }

    @Override
    public int countConsumables() {
        return 0;
    }

    @Override
    public int countEquipment() {
        return 0;
    }

    @Override
    public String getEquipmentList() {
        return null;
    }

    @Override
    public void getEquipmentInfo(String list, int index) {

    }

    @Override
    public Equipment getEquipment(int index) {
        return null;
    }

    @Override
    public void dropEquipment(int index) {

    }

    @Override
    public void dropAllEquipment() {

    }

    @Override
    public void addEquipment(Equipment equipment) {

    }
}
