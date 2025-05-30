public class Character {
    private String name;
    private int xCoordinate;
    private int yCoordinate;

    public Character(String name, int xCoordinate, int yCoordinate) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return xCoordinate;
    }

    public int getY() {
        return yCoordinate;
    }

    public void changePosition(int xChange, int yChange) {
        xCoordinate += xChange;
        yCoordinate += yChange;
    }
}