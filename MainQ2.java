import java.io.*;
import java.util.Scanner;

public class MainQ2 {
    static Picture[] pictures = new Picture[100];

    public static int ReadData() {
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Pictures.txt"));
            String line;

            while ((line = reader.readLine()) != null && count < 100) {
                String description = line;
                int width = Integer.parseInt(reader.readLine());
                int height = Integer.parseInt(reader.readLine());
                String colour = reader.readLine();

                pictures[count] = new Picture(description, width, height, colour);
                count++;
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        return count;
    }

    public static void main(String[] args) {
        int total = ReadData();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter frame colour: ");
        String userColour = scanner.nextLine().toLowerCase();

        System.out.print("Enter max width: ");
        int maxWidth = scanner.nextInt();

        System.out.print("Enter max height: ");
        int maxHeight = scanner.nextInt();

        for (int i = 0; i < total; i++) {
            Picture p = pictures[i];
            if (p.getColour().toLowerCase().equals(userColour) &&
                p.getWidth() <= maxWidth &&
                p.getHeight() <= maxHeight) {

                System.out.println(p.getDescription() + ", " + p.getWidth() + ", " + p.getHeight());
            }
        }
    }
}