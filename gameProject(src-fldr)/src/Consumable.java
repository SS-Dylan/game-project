import java.time.Duration;

public abstract class Consumable extends Equipment implements IUsable
{
    Consumable(String Name, int Price, double Durability)
    {
        super(Name, Price, Durability);
    }
    public void destroy()
    {
        setDurability(0);
    }
}
