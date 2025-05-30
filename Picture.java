public class Picture {
    private String description;
    private int width;
    private int height;
    private String frameColour;

    public Picture(String description, int width, int height, String frameColour) {
        this.description = description;
        this.width = width;
        this.height = height;
        this.frameColour = frameColour;
    }

    public String getDescription() {
        return description;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return frameColour;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
}