public class MainQ6 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car01", 120, 10);
        car.increaseSpeed();
        car.increaseSpeed();
        System.out.println("Speed: " + car.getCurrentSpeed());
        System.out.println("Position: " + car.getHorizontalPosition());
    }
}