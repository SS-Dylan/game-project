public interface IInventory {

    public void pickup(Equipment equipment);

    public void transferAllEquipmentFrom(IInventory other);

    public int countArmor();

    public int countWeapon();

    public int countConsumables();

    public int countEquipment();

    public String getEquipmentList();

    public void getEquipmentInfo(String list, int index);

    public Equipment getEquipment(int index);

    public void dropEquipment(int index);

    public void dropAllEquipment();

    public void addEquipment(Equipment equipment);

}
