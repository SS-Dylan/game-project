/**
 * ---------------------------------------------------------------------------
 * File name: WorldDriver.java
 * Project name: 1260Game
 * ---------------------------------------------------------------------------
 * Creator's name and email: Dylan Shaffer, Dylan Zelasko
 * Course:  CSCI 1260
 * Creation Date: Nov 15, 2020
 * ---------------------------------------------------------------------------
 */

import java.util.Scanner;
import java.util.ArrayList;

public class GameDriver
{

	public static void main(String[] args)
	{ //start main method
		String s = "";
		while(s != "exit")
		{
			EquipmentManager driverManager = new EquipmentManager();
			Scanner sc = new Scanner(System.in);	//All case switch methods implemented by Dylan Shaffer
			System.out.println("What would you like to do?\nManage Equipment\nAdd Equipment\nRemove Equipment\nEquipment Info\nMake\nList\nTransfer\nEquip\nUse\nInventory\n");
			s = sc.nextLine();
			switch (s)
			{
				case "Manage Equipment":
					System.out.println("Please enter a valid command:\nclear all\ncount equipment\ncount armor\ncount weapons\nlist all\nlist all details");
					s = sc.nextLine();
					switch (s)
					{
						case "clear all":
							driverManager.clearAll();
							break;
						case "count equipment":
							driverManager.countEquipment();
							break;
						case "count armor":
							driverManager.countArmor();
							break;
						case "count weapons":
							driverManager.countWeapon();
							break;
						case "list all":
							System.out.print("\033[H\033[2J");
							System.out.flush();
							driverManager.getEquipmentList();
							break;
						case "list all details":
							System.out.print("\033[H\033[2J");
							System.out.flush();
							driverManager.getEquipmentListDetails();
							break;
						default:
							System.out.println("Please enter a valid command.");
							break;
					}
					break;
				case "Add Equipment":
					System.out.println("Please state what you would like to add\n");
					System.out.println("Types of valid equipement:\nplackart\nhelmet\nspear\nsword\nlongBow\nthrowingAxe");
					s = sc.nextLine();
					switch(s)
					{
						case "plackart":
							Plackart p = new Plackart();
							driverManager.addEquipment(p);
							System.out.println("Plackart Added");
							break;
						case "helmet":
							Helmet h = new Helmet();
							driverManager.addEquipment(h);
							System.out.println("Helmet Added");
							break;
						case "spear":
							Spear sp = new Spear();
							driverManager.addEquipment(sp);
							System.out.println("Spear Added");
							break;
						case "sword":
							Sword swo = new Sword();
							driverManager.addEquipment(swo);
							System.out.println("Sword Added");
							break;
						case "longBow":
							LongBow lb = new LongBow();
							driverManager.addEquipment(lb);
							System.out.println("LongBow Added");
							break;
						case "throwingAxe":
							ThrowingAxe ta = new ThrowingAxe();
							driverManager.addEquipment(ta);
							System.out.println("ThrowingAxe Added");
							break;
						default:
							System.out.println("Please use a valid equipment type.");
							break;
					}
					break;
				case "Remove Equipment":
					System.out.println("Enter what item you would like to remove at what index.\n(For example 2)");
					int i = sc.nextInt();
					driverManager.removeEquipment(i);
					break;
				case "Equipment Info":
					System.out.println("Enter what item you would like to see info on.\n(For example:  12)");
					i = sc.nextInt();
					driverManager.getEquipmentDetails(i);
					break;
				default:
					break;
			}
			if(s.contains ("make"))
			{
				if(s.contains("human"))
				{
					//creates a default villager
					System.out.println("Villager Made\n");
				}
				else if(s.contains ("barrel"))
				{
					//creates a default barrel
					System.out.println("Barrel Made\n");
				}
				else if(s.contains ("goblin"))
				{
					//creates default goblin and respective methods
					System.out.println("Goblin Made\n");
				}
				else
				{
					System.out.print ("Sorry, invalid entity for make method");
				}
			}
			if(s.contains ("Use"))
			{
				System.out.println ("Use what?");
				s = sc.nextLine ( );
				if(s.contains ("weapon"))
				{
					System.out.println("Target?");
					s = sc.nextLine ( );
					//uses equipped weapon on specified target unless weapon or target unspecified/invalid
				}
				if(s.contains ("inventory"))
				{
					String ss = s.substring (4, s.length());
					System.out.println("Target?");
					s = sc.nextLine ( );
					//method for using whatever inventory value stored in ss on target
				}
			}
			if(s.contains ("list"))
			{
				String ss = s.substring(5, s.length());
				//code for listing value stored in ss
			}
			if(s.contains ("transfer"))
			{
				System.out.println ("Source?");
				String sor = sc.nextLine ( );
				System.out.println("Target?");
				String tar = sc.nextLine ( );
				// code for copying item to target then deleting from source
			}
			if(s.contains ("equip"))
			{
				String ss = s.substring (6, s.length());
				//code for equipping argument in ss
			}

		}
	}
}