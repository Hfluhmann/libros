// generate location object that contains floor, hallway, shelf and position

public class Location {
    private String floor;
    private String hallway;
    private String shelf;
    private Position position;

    public Location(String floor, String hallway, String shelf, Position position) {
        this.floor = floor;
        this.hallway = hallway;
        this.shelf = shelf;
        this.position = position;
    }

    public Location() {
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getHallway() {
        return hallway;
    }

    public void setHallway(String hallway) {
        this.hallway = hallway;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}