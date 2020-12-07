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

import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

public class GameDriver
{	/*
	(String[] args)
	{ //start main method
		String s = "";
		while(s != "exit")
		{
			EquipmentManager driverManager = new EquipmentManager();
			Scanner sc = new Scanner(System.in);	//All case switch methods implemented by Dylan Shaffer
			System.out.println("What would you like to do?\nManage Equipment\nAdd Equipment\nRemove Equipment\nEquipment Info\nMake\nList\nTransfer\nEquip\nUse\nInventory\n");
			s = sc.nextLine();

				case "Sell Equipment":
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
*/
	public static void main (String [ ] args)
	{
		SwingUtilities.invokeLater
				(
						new Runnable()
						{
							@Override
							public void run()
							{
								new GameGUI();
							}
						}
				);
	}
}