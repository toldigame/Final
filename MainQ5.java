import java.util.Scanner;

public class MainQ5 {
    public static Balloon defend(Balloon b) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter strength of opponent: ");
        int strength = scanner.nextInt();

        b.changeHealth(-strength);
        System.out.println("Defence item: " + b.getDefenceItem());

        if (b.checkHealth()) {
            System.out.println("The balloon has no health remaining.");
        } else {
            System.out.println("The balloon still has health.");
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter defence item: ");
        String item = scanner.nextLine();
        System.out.print("Enter balloon colour: ");
        String colour = scanner.nextLine();

        Balloon Balloon1 = new Balloon(item, colour);
        defend(Balloon1);
    }
}