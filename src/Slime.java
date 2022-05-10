import java.awt.*;

// the main character
public class Slime extends Block{
    public String facing = "down";

    public Slime(int blockSize, int x, int y) {
        super(blockSize, x, y);
    }

    // changes the image based on how many hundreds of milliseconds have passed
    public void draw(Graphics g, int pixelSize, int counter, int world) {
        if (!getDirection().equals("")) {
            facing = getDirection();
        }

        Color DARK_GREEN = new Color(39, 153, 39,175);
        Color GREEN = new Color(0,255,51,175);
        Color WHITE = new Color(255,255,255,175);
        Color BLACK = new Color(0,0,0,230);

        int frame = 3;

        if (counter % (4 * frame) < frame) {
            pixelBlock(pixelSize, g, GREEN, 0, 8, 5, 8);
            pixelBlock(pixelSize, g, GREEN, 1, 7, 4, 5);
            pixelBlock(pixelSize, g, GREEN, 2, 6, 3, 4);
            pixelBlock(pixelSize, g, WHITE, 4, 6, 4, 5);
            pixelBlock(pixelSize, g, WHITE, 6, 7, 5, 6);
            pixelBlock(pixelSize, g, DARK_GREEN, 0, 4, 7, 8);
            pixelBlock(pixelSize, g, DARK_GREEN, 0, 1, 6, 7);

            if (facing.equals("down")) {
                pixelBlock(pixelSize, g, BLACK, 3, 4, 5, 6);
                pixelBlock(pixelSize, g, BLACK, 5, 6, 5, 6);
            } else if (facing.equals("right")) {
                pixelBlock(pixelSize, g, BLACK, 5, 6, 5, 6);
            } else if (facing.equals("left")) {
                pixelBlock(pixelSize, g, BLACK, 2, 3, 5, 6);
            }
        } else if (counter % (4 * frame) < 2 * frame || counter % (4 * frame) >= 3 * frame) {
            pixelBlock(pixelSize, g, GREEN, 0, 8, 4, 8);
            pixelBlock(pixelSize, g, GREEN, 1, 7, 3, 4);
            pixelBlock(pixelSize, g, GREEN, 2, 6, 2, 3);
            pixelBlock(pixelSize, g, WHITE, 4, 6, 3, 4);
            pixelBlock(pixelSize, g, WHITE, 6, 7, 4, 5);
            pixelBlock(pixelSize, g, DARK_GREEN, 0, 4, 7, 8);
            pixelBlock(pixelSize, g, DARK_GREEN, 0, 1, 6, 7);

            if (facing.equals("down")) {
                pixelBlock(pixelSize, g, BLACK, 3, 4, 4, 6);
                pixelBlock(pixelSize, g, BLACK, 5, 6, 4, 6);
            } else if (facing.equals("right")) {
                pixelBlock(pixelSize, g, BLACK, 5, 6, 4, 6);
            } else if (facing.equals("left")) {
                pixelBlock(pixelSize, g, BLACK, 2, 3, 4, 6);
            }
        } else {
            pixelBlock(pixelSize, g, GREEN, 0, 8, 3, 8);
            pixelBlock(pixelSize, g, GREEN, 1, 7, 2, 3);
            pixelBlock(pixelSize, g, GREEN, 2, 6, 1, 2);
            pixelBlock(pixelSize, g, WHITE, 4, 6, 2, 3);
            pixelBlock(pixelSize, g, WHITE, 6, 7, 3, 4);
            pixelBlock(pixelSize, g, DARK_GREEN, 0, 4, 7, 8);
            pixelBlock(pixelSize, g, DARK_GREEN, 0, 1, 6, 7);

            if (facing.equals("down")) {
                pixelBlock(pixelSize, g, BLACK, 3, 4, 3, 6);
                pixelBlock(pixelSize, g, BLACK, 5, 6, 3, 6);
            } else if (facing.equals("right")) {
                    pixelBlock(pixelSize, g, BLACK, 5, 6, 3, 6);
            } else if (facing.equals("left")) {
                pixelBlock(pixelSize, g, BLACK, 2, 3, 3, 6);
            }
        }
    }
}