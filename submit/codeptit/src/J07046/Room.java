package J07046;

public class Room {
    private String roomId;
    public Room(String roomId) {
        this.roomId = roomId;
    }
    public String getRoomId() {
        return roomId;
    }
    @Override
    public String toString() {
        return roomId;
    }
    
}
