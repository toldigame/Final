public class Vehicle {
    private String id;
    private int maxSpeed;
    private int currentSpeed;
    private int increaseAmount;
    private int horizontalPosition;

    public Vehicle(String id, int maxSpeed, int increaseAmount) {
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.increaseAmount = increaseAmount;
        this.currentSpeed = 0;
        this.horizontalPosition = 0;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getIncreaseAmount() {
        return increaseAmount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getHorizontalPosition() {
        return horizontalPosition;
    }

    public void setCurrentSpeed(int speed) {
        currentSpeed = speed;
    }

    public void setHorizontalPosition(int position) {
        horizontalPosition = position;
    }

    public void increaseSpeed() {
        currentSpeed += increaseAmount;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
        horizontalPosition += currentSpeed;
    }
}