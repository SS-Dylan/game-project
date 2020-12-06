/**
 * Dylan Shaffer
 * CSCI 1260-901
 */

public class GameMap {
    private String[][] rooms = {
        {" A1 ", " B1 ", " C1 "},
        {" A2 ", " B2 ", " C2 "},
        {" A3 ", " B3 ", " C3 "}
    }; //Game map layout in a simple 3x3 grid

    Room room = new Room(); //Initialize a room object for getRoomDescription

    public void showMap() { //Print out the 3x3 grid
        System.out.println(rooms[0][0] + rooms[0][1] + rooms[0][2]);
        System.out.println(rooms[1][0] + rooms[1][1] + rooms[1][2]);
        System.out.println(rooms[2][0] + rooms[2][1] + rooms[2][2]);
    }

    public String currentLocation() {
        return ""; //Find the current index and return it somehow
    }

    Public changeRoom() {  //Not fully sure what to do on this one
        return "";
    }

    public String getRoomDescription() {
        return Room.getDescription();
    }
}
