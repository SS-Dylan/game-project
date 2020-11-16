/**
 * Dylan Shaffer
 * CSCI 1260-001
 */
import java.util.Scanner;
import java.util.ArrayList;

 public class GameDriver { //start GameDriver
	public static void main(String[] args) { //start main method
		Scanner sc = new Scanner(System.in);	//All case switch methods implemented by Dylan Shaffer
		System.out.println("What would you like to do?\nManage Equipment\nManage World\nAdd Equipment\nRemove Equipment\nEquipment Info");
		String s = sc.nextLine();
		switch (s) { //start main switch method
			case "Manage Equipment":
				System.out.println("Please enter a valid command:\nclear all\ncount equipment\ncount armor\ncount weapons\nlist all\nlist all details");
				s = sc.nextLine();
				switch (s) {
					case "clear all":
						EquipmentManager.clearAll();
						break;
					case "count equipment":
						EquipmentManager.countEquipment();
						break;
					case "count armor":
						EquipmentManager.countArmor();
						break;
					case "count weapons":
						EquipmentManager.countWeapon();
						break;
					case "list all":
						System.out.print("\033[H\033[2J");  
						System.out.flush();
						EquipmentManager.getEquipmentList();
						break;
					case "list all details":
						System.out.print("\033[H\033[2J");  
						System.out.flush();
						EquipmentManager.getEquipmentListDetails();
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
				switch(s) {
					case "plackart":
						EquipmentManager.addPlackart();
						break;
					case "helmet":
						EquipmentManager.addHelmet();
						break;
					case "spear":
						EquipmentManager.addSpear();
						break;
					case "sword":
						EquipmentManager.addSword();
						break;
					case "longBow":
						EquipmentManager.addLongbow();
						break;
					case "throwingAxe":
						EquipmentManager.addThrowingAxe();
						break;
					default:
						System.out.println("Please use a valid equipment type.");
						break;
				}
				break;
			case "Remove Equipment":
				System.out.println("Enter what item you would like to remove at what index.\n(For example, sword 2)");
				s = sc.nextLine();
				int i = sc.nextInt();
				EquipmentManager.removeEquipment(s, i);
				break;
			case "Equipment Info":
				System.out.println("Enter what item you would like to see info on.\n(For example: sword 2)");
				s = sc.nextLine();
				i = sc.nextInt();
				EquipmentManager.getEquipmentDetails(s, i);
				break;
			case "Manage World":
				System.out.println("What would you like to do?\nAdd Objects\nAdd Entities\nManage");
				s = sc.nextLine();
				switch(s) {
					case "Add Objects":
						System.out.println("Available commands: Make Barrel, Make Chest");
						s = sc.nextLine();
						switch(s) {
							case "Make Barrel":
								World.makeBarrel();
								break;
							case "Make Chest":
								World.makeChest();
								break;
							default:
								System.out.println("Please input a valid command.");
								break;
						}
					case "Add Entities":
						System.out.println("Available commands: Make Human, Make Goblin");
						s = sc.nextLine();
						switch(s) {
							case "Make Human":
								World.makeHuman();
								break;
							case "Make Goblin":
								World.makeGoblin();
								break;
							default:
								System.out.println("Please input a valid command.");
								break;
						}
					case "Manage":
							System.out.println("List of available commands:");
							System.out.println("list people, list barrels, lookAt person, speakTo person, my info, my inventory, ");
							System.out.println("use, attack, transfer");
							break;
				}
			/* Default error message for case switch */
			default:
				System.out.println("Please enter a valid command.");
				break;
        } //end main switch
    } //end main method
} //end GameDriver