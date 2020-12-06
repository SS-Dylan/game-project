/*

    Author: Seth Gilstrap

 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room implements IHitable{

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

    public boolean areThereTraps()
    {
        boolean traps = false;
        if(traps == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String trap()
    {
        String tripped = "You sprang a trap!";
        takeDamage(4, 0, 0);
        return tripped;
    }

    public Array[] getPeople()
    {
        return enemy;
    }

    public Array[] getFurniture()            //???
    {
        return roomFurniture;

       /* String furniture = "There is no furniture in this room.";
        if(lightLevel > 1)
        {
            for(int i = 0; i <= roomFurniture.length; i++)
            {
               // System.out.println(roomFurniture[1]); //This won't work, we need a return statement.
                furniture = roomFurniture[i];
                return furniture +;
            }
        } */

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
