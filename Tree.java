public class Tree {
    private String treeName;
    private int heightGrowth;
    private int maxHeight;
    private int maxWidth;
    private String evergreen;

    public Tree(String treeName, int heightGrowth, int maxHeight, int maxWidth, String evergreen) {
        this.treeName = treeName;
        this.heightGrowth = heightGrowth;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.evergreen = evergreen;
    }

    public String getTreeName() {
        return treeName;
    }

    public int getGrowth() {
        return heightGrowth;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public String getEvergreen() {
        return evergreen;
    }
}