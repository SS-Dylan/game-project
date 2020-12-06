/**
 * Dylan Colburn
 * CSCI 1260-901
 */

public abstract class Player extends Person implements IHitable{

    private String playerName;
    private int age;
    private Race playerRace;
    private int playerLevel;
    private int currentExp;
    private Person playerPerson;

    public Player(String Name) {
        super(Name);
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

    public int getCurrentExp()
    {
        return currentExp;
    }



}
