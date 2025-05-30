public class Character {
    private String name;
    private int xPosition;
    private int yPosition;

    public Character(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setXPosition(int value) {
        xPosition += value;
        if (xPosition > 10000) {
            xPosition = 10000;
        }
        if (xPosition < 0) {
            xPosition = 0;
        }
    }

    public void setYPosition(int value) {
        yPosition += value;
        if (yPosition > 10000) {
            yPosition = 10000;
        }
        if (yPosition < 0) {
            yPosition = 0;
        }
    }

    public void move(String direction) {
        if (direction.equals("up")) {
            setYPosition(10);
        } else if (direction.equals("down")) {
            setYPosition(-10);
        } else if (direction.equals("left")) {
            setXPosition(-10);
        } else if (direction.equals("right")) {
            setXPosition(10);
        }
    }
}