/*

    Author: Seth Gilstrap

 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {

    private String description;
    private String size;
    private int lightLevel;
    private Array[] roomFurniture;
    private Array[] enemy;

    public Room()
    {

    }

    public String getRoomSize()
    {
        return size;
    }

    public String lightLevel()
    {

    }

    public int getLightLevel()
    {
        return lightLevel;
    }

    public String trap()
    {

    }

    public String getPeople()
    {

    }

    public String getFurniture()            //??? 
    {
        for(int i = 0; i <= roomFurniture.length; i++)
        {
            if (roomFurniture.equals())
        }
    }

    public String getTraps()
    {
        return trap();
    }

    public String getDescription()
    {
        return description;
    }

}
