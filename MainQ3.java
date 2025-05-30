public class MainQ3 {
    public static void main(String[] args) {
        Character Jack = new Character("Jack", 50, 50);
        Jack.move("right");
        Jack.move("up");
        System.out.println("Jack is at X = " + Jack.getXPosition() + ", Y = " + Jack.getYPosition());
    }
}