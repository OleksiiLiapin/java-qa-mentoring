//Link to task https://www.codewars.com/kata/55b75fcf67e558d3750000a3

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] walls) {
        this.width = walls[0];
        this.length = walls[1];
        this.height = walls[2];
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea()  {
        return (2 * height * width) + (2 * length * height) + (2 * width * length);
    }
    //2× h × W + 2× L × h + 2× w × L.

    public int getWidth() {

        return width;
    }

    public int getLength() {

        return length;
    }

    public int getHeight() {
        return height;
    }


}
