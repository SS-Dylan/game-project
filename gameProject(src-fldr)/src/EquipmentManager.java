/**
 * ---------------------------------------------------------------------------
 * File name: EquipmentManager.java
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
	Random rand = new Random();
		
		/**
		 * Initializes EquipmentManager object      
		 *
		 * <hr>
		 * Date created: Oct 14, 2020
		 *
		 * <hr>
		 * @param
		 */
		
		EquipmentManager equipmentManager = new EquipmentManager();
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

		public void addEquipment(Equipment e)
		{
			equipment.add(e);
		}
		
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
			Weapon randomWeapon;
			int id = rand.nextInt(4);
			switch(id)
			{
				case 0:
					Sword w = new Sword();
					return w;
				case 1:
					Spear p = new Spear();
					return p;
				case 2:
					LongBow b = new LongBow();
					return b;
				default:
					ThrowingAxe t = new ThrowingAxe();
					return t;
			}
		}
		
		public Armor createRandomArmor()
		{
			int id = rand.nextInt(2);
			switch(id)
			{
				case 0:
					Plackart p = new Plackart();
					return p;
				default:
					Helmet h = new Helmet();
					return h;
			}
		}
		public Consumable createRandomConsumable()
		{
			HealthKit hk = new HealthKit("HealthKit", 50, 50);
			return hk;
		}
}//end EquipmentManager.java