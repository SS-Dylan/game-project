//Author:   Seth Gilstrap

public class Goblin extends person
{
    public Goblin()
    {
        super("Goblin");
    }

    public Goblin(String Name)
    {
        super(Name);
    }

    public String insult()
    {
        return "What are you looking at, you lint-licker?";
    }

    public String threat()
    {
        return "Gimme all your gold!!!";
    }

    public String greeting()
    {
        return "Greetings, Goblin-Brother!";
    }
}
