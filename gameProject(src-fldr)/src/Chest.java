public class Chest implements IInventory, IUsable
{
    EquipmentManager inventory;

    public Chest(){
        inventory.addEquipment(new Helmet());
        inventory.addEquipment(new Sword());
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


    public String getEquipmentInfo(int index) {
        return null;
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


    public void dropAllEquipments() {

    }

    @Override
    public void addEquipment(Equipment equipment) {

    }

    @Override
    public boolean use(Person person) {
        person.transferAllEquipmentFrom(this);
        return true;
    }
}
