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
{

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