import java.io.*;
import java.util.Scanner;

public class MainQ4 {
    public static void main(String[] args) {
        Character[] characters = new Character[10];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Characters.txt"));
            for (int i = 0; i < 10; i++) {
                String name = reader.readLine();
                int x = Integer.parseInt(reader.readLine());
                int y = Integer.parseInt(reader.readLine());
                characters[i] = new Character(name, x, y);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        Scanner scanner = new Scanner(System.in);
        int foundIndex = -1;
        while (foundIndex == -1) {
            System.out.print("Enter character name: ");
            String inputName = scanner.nextLine();
            for (int i = 0; i < characters.length; i++) {
                if (characters[i].getName().equalsIgnoreCase(inputName)) {
                    foundIndex = i;
                    break;
                }
            }
        }

        Character selected = characters[foundIndex];
        String direction = "";
        while (!direction.equals("A") && !direction.equals("W") && !direction.equals("S") && !direction.equals("D")) {
            System.out.print("Enter direction (A/W/S/D): ");
            direction = scanner.nextLine().toUpperCase();
        }

        if (direction.equals("A")) {
            selected.changePosition(-1, 0);
        } else if (direction.equals("D")) {
            selected.changePosition(1, 0);
        } else if (direction.equals("W")) {
            selected.changePosition(0, 1);
        } else if (direction.equals("S")) {
            selected.changePosition(0, -1);
        }

        System.out.println(selected.getName() + " has changed coordinates to X = " + selected.getX() + " and Y = " + selected.getY());
    }
}