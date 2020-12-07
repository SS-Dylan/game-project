/**
 * Dylan Shaffer
 * CSCI 1260-901
 */

public class GameMap {
    private String[][] rooms = {
        {" A1 ", " B1 ", " C1 ", " D1 ", " E1 "},
        {" A2 ", " B2 ", " C2 ", " D2 ", " E2 "},
        {" A3 ", " B3 ", " C3 ", " D3 ", " E3 "},
        {" A4 ", " B4 ", " C4 ", " D4 ", " E4 "},
        {" A5 ", " B5 ", " C5 ", " D5 ", " E5 "}
    }; //Game map layout in a simple 5x5 grid

    Room room = new Room(); //Initialize a room object for getRoomDescription

    public void showMap() { //Print out the 5x5 grid
        System.out.println(rooms[0][0] + rooms[0][1] + rooms[0][2] + rooms[0][3] + rooms[0][4]);
        System.out.println(rooms[1][0] + rooms[1][1] + rooms[1][2] + rooms[1][3] + rooms[1][4]);
        System.out.println(rooms[2][0] + rooms[2][1] + rooms[2][2] + rooms[2][3] + rooms[2][4]);
        System.out.println(rooms[3][0] + rooms[3][1] + rooms[3][2] + rooms[3][3] + rooms[3][4]);
        System.out.println(rooms[4][0] + rooms[4][1] + rooms[4][2] + rooms[4][3] + rooms[4][4]);
    }

    public String currentLocation() {
        return ""; //Find the current index and return it somehow
    }

    public Room changeRoom() {  //Not fully sure what to do on this one     //FIX THIS
        room = new Room();
        return room;
    }

    public String getRoomDescription() {
        String description = "Fuck this.";          //FIX THIS
      //  Room.getDescription() = description;
        return description;
    }
}
