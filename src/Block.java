import java.awt.*;

// a block of 8 "pixels"
public class Block {
    private final int blockSize;
    private int x;
    private int y;
    private String direction;

    public boolean moved;

    public Block(int blockSize, int x, int y) {
        this.blockSize = blockSize;
        this.x = blockSize * x;
        this.y = blockSize * y;
        this.direction = "";
    }

    // draws it
    public void draw(Graphics g, int pixelSize, int counter, int world) {
        pixelBlock(pixelSize, g, Color.BLACK, 0, 8, 0, 8);
    }

    // helper method to draw
    public void pixelBlock(int pixelSize, Graphics g, Color color, int x1, int x2, int y1, int y2) {
        for (int i = x + x1; i < x + x2; i++) {
            for (int j = y + y1; j < y + y2; j++) {
                g.setColor(color);
                g.fillRect(i * pixelSize, j * pixelSize, pixelSize, pixelSize);
            }
        }
    }

    public void setX(int x) {
        this.x = x * blockSize;
    }

    public void setY(int y) {
        this.y = y * blockSize;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getX() {
        return x / blockSize;
    }

    public int getY() {
        return y / blockSize;
    }

    public String getDirection() {
        return direction;
    }

    public int getBlockSize() {
        return blockSize;
    }
}
