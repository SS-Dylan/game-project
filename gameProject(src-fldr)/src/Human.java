/**
 * ---------------------------------------------------------------------------
 * File name: Human.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Colburn
 * Course:  CSCI 1260
 * Creation Date: Nov. 15, 2020
 * ---------------------------------------------------------------------------
 */

public class Human extends Person
{
    public Human()
    {
        super("Villager");

    }
    public Human(String name)
    {
        super(name);
    }


    public String question()
    {
       return "Hmmmmm???";
    }

    public String excited()
    {

        return "LETS GOOO!";
    }

    public String King()
    {

        return "I am the king son.";
    }
}
