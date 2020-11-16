public class HealthKit extends Consumable
{
    HealthKit(String Name, int Price, double Durability)
    {
        super(Name, Price, Durability);
    }

    @Override
    public boolean use(Person person) {
        int healValue = person.heal(5);
        if (healValue > 0)
        {
            return true;
        }
        else
        return false;
    }
}
