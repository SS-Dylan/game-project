/*    name: EquipmentManager.java
		* Project name: 1260Game
		* ---------------------------------------------------------------------------
		* Creator's name and email: Dylan Zelasko
		* Course:  CSCI 1260
		* Creation Date: Oct 14, 2020
		* Contributors: Dylan Shaffer, Seth Gilstrap, Torrey Warren, Dylan Colburn
		* ---------------------------------------------------------------------------
		*/

import java.util.ArrayList;
import java.util.Random;
/**
 * Manager class for equipment and related classes.
 * Allows user to customize and manipulate virtual equipment.
 *
 * <hr>
 * Date created: Oct 14, 2020
 * <hr>
 * @author Dylan Zelasko
 */
public class EquipmentManager
{
	private ArrayList<Equipment> equipment = new ArrayList<Equipment>();
	private Random rand = new Random();

	/**
	 * Initializes EquipmentManager object
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param args
	 */
	//end EquipmentManager

	/**
	 * Transmuter that clears out every arraylist of the object
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public void clearAll()
	{
		equipment.clear();
	}//end clearAll

	/**
	 * Returns all contained elements of the arraylists
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public int countEquipment()
	{
		return equipment.size ( );
	}//end countEquipment

	/**
	 * returns contained elements of plackarts and helmets arraylists
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public int countArmor()
	{
		int count = 0;
		for(int i = 0; i < equipment.size(); i++)
			if(equipment.get(i).getName().contains ("Helmet") ||
					equipment.get(i).getName().contains ("Plackart"))
				count++;
		return count;
	}//end countArmor

	/**
	 * contains all elements of spears, swords, longbows, and throwingaxes arraylists
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public int countWeapon()
	{
		int count = 0;
		for(int i = 0; i < equipment.size(); i++)
			if(equipment.get(i).getName().contains ("Sword") ||
					equipment.get(i).getName().contains ("Spear") ||
					equipment.get(i).getName().contains ("LongBow") ||
					equipment.get(i).getName().contains ("ThrowingAxe"))
				count++;
		return count;
	}//end countWeapon

	/**
	 * removes a specific element from a specified arraylist
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public void removeEquipment( int index)
	{
		equipment.remove (index);
	}//end removeEquipment


	public void addEquipment(Equipment e)
	{
		equipment.add (e);
	}




	/**
	 * prints the toString of a specific element of a specified arraylist
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public void getEquipmentDetails(int index)
	{
		System.out.println(equipment.get(index).toString());
	}//end getEquipmentDetails

	/**
	 * Returns a string containing all the details of all the contained elements
	 * in the object's arraylists
	 *
	 * <hr>
	 * Date created: Oct 14, 2020
	 *
	 * <hr>
	 * @param
	 */
	public String getEquipmentListDetails()
	{
		String details = "";
		int i = 0;
		details += "Equipment:\n";
		if(equipment.isEmpty() == true)
			details += "<<empty>>\n";
		else
		{
			while(i<equipment.size())
			{
				details += (i+ ". " + equipment.get(i).toString() +"\n");
			}
			i = 0;
		}//end else

		return details;
	}//end getEquipmentListDetails
	public Weapon createRandomWeapon()
	{
		int id = rand.nextInt(4);
		Sword w = new Sword();
		Spear p = new Spear();
		LongBow b = new LongBow();
		ThrowingAxe t = new ThrowingAxe();
		if(id ==0)
		{
			return w;
		}
		if(id ==1)
		{
			return p;
		}
		if(id==2)
		{
			return b;
		}
		else
			return t;
	}

	public Armor createRandomArmor()
	{
		int id = rand.nextInt(2);
		Plackart p = new Plackart();
		Helmet h = new Helmet();
		if(id ==0)
		{
			return p;
		}
		else
			return h;

	}
	public Consumable createRandomConsumable()
	{
		HealthKit hk = new HealthKit("Basic", 100, 3);
		return hk;
	}

	public void getEquipmentList ( )
	{
		String s = "";
		for(int i = 0; i < equipment.size(); i++)
		{
			s += i + ". " + equipment.get (i).getName() +"\n";
		}
		System.out.println(s);

	}
}//end EquipmentManager.java