/*

    Author: Seth Gilstrap

 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {

    private String description;
    private String size;
    private int lightLevel;
    private Array[] roomFurniture = new Array[];
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
        String light = "This room is too dark to see.";
        if(lightLevel == 1)
        {
            return light;
        }
        else if(lightLevel == 2)
        {
            light = "This room is rather dim.";
            return light;
        }

        else if (lightLevel > 2)
        {
            light = "This room is well lit.";
            return light;
        }
        return light;
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
        String furniture = "There is no furniture in this room.";
        if(lightLevel > 1)
        {
            for(int i = 0; i <= roomFurniture.length; i++)
            {
                furniture = roomFurniture.index(i);
                return furniture;
            }
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
