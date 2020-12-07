/**
 * Dylan Shaffer CSCI 1260-901
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMapInitializer {
    private static void roomGenerator(String fileEnd)
    {
        String fileName = "Creation Files/Rooms";
        Random rand = new Random();
        int i = 0;
        int randomLine = rand.nextInt(10);
        File readFile = new File(fileName);
        ArrayList<String> addedList = new ArrayList<String>();
        Scanner inputFile = new Scanner(readFile);
        while(randomLine >= i)//reads the file line by line
        {
                String currentLine = inputFile.nextLine();
                String[] segments = currentLine.split("/|");
                //code for getting values from specific lines
                i++;
        }
        i = 0;
        inputFile.close();
    }
}