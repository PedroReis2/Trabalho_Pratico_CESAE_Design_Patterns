package Models;

public class Room {
    private String roomNum;
    private int typeId;

    public Room(String roomNum, int typeId) {
        this.roomNum = roomNum;
        this.typeId = typeId;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public int getTypeId() {
        return typeId;
    }
}
