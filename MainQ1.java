import java.io.*;

public class MainQ1 {
    public static Tree[] ReadData() {
        Tree[] trees = new Tree[9];
        int index = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Trees.txt"));
            String line;

            while ((line = reader.readLine()) != null && index < 9) {
                String[] parts = line.split(",");

                String name = parts[0];
                int growth = Integer.parseInt(parts[1]);
                int maxHeight = Integer.parseInt(parts[2]);
                int maxWidth = Integer.parseInt(parts[3]);
                String evergreen = parts[4];

                trees[index] = new Tree(name, growth, maxHeight, maxWidth, evergreen);
                index++;
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        return trees;
    }

    public static void main(String[] args) {
        Tree[] loadedTrees = ReadData();
        System.out.println("Trees loaded: " + loadedTrees.length);
    }
}