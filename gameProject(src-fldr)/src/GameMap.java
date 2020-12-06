/**
 * Dylan Shaffer
 * CSCI 1260-901
 */
//import java.util.ArrayList;

public class GameMap {
    private String[][] rooms = {
        {" A1 ", " B1 ", " C1 "},
        {" A2 ", " B2 ", " C2 "},
        {" A3 ", " B3 ", " C3 "}
    };

    public void showMap()
    {
        System.out.println(rooms[0][0] + rooms[0][1] + rooms[0][2]);
        System.out.println(rooms[1][0] + rooms[1][1] + rooms[1][2]);
        System.out.println(rooms[2][0] + rooms[2][1] + rooms[2][2]);
    }

    public String currentLocation()
    {
        return "";
    }

    public String getRoomDescription()
    {
        return "";
    }
}
