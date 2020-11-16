import java.util.*;

public abstract class Person
{
    private String name;
    private ArrayList<String> thingsToSay = new ArrayList();
    private Helmet helmet;
    private Plackart plackart;
    private EquipmentManager inventory;
    private int maxHealth;
    private int currentHealth;

    public Person(String Name) {

        name= Name;
        maxHealth= 50;
    }

    public String saySomething()
    {
        int randomIndex = (int)(Math.random()*thingsToSay.size());
        return thingsToSay.get(randomIndex);
    }

    public boolean equip(Equipment e){
        return true;
    }

    public int attack()
    {

    }

    /*public String getName(){
    return"";
    }*/

    public String toString(){

        return "";
    }

    public ArrayList<String> getThingsToSay()
    {

    }

    public void setThingsToSay(ArrayList<String> list){

    }
}

