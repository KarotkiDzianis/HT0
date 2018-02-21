import java.util.ArrayList;

public class Building {
    private String name;
     ArrayList<Room> rooms = new ArrayList<Room>();
    public Building (String name) {
        this.name=name;
    }

    public void addRoom(String name, double area, int windows) {
    }

    public Room getRoom (String name) {
        for (Room room : rooms)
            if (room.equals(name)) {
                return room;
            } else System.out.println("This room isn't ");
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void describe(){
        for (Room room: rooms) {
            System.out.println(room.toString());

        }
    }




}
