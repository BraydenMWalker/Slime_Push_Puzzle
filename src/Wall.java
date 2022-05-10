import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Wall extends Block{
    public Wall(int blockSize, int x, int y) {
        super(blockSize, x, y);
    }

    public void draw(Graphics g, int pixelSize, int counter, int world) {
        int rand = (int) (Math.random() * 100);

        if (world == 1) {
            Color DEEP_BLUE = new Color(93, 115, 154);
            Color GRAY_BLUE = new Color(137, 167, 186);
            Color VERY_LIGHT_BLUE = new Color(199, 216, 232);

            pixelBlock(pixelSize, g, DEEP_BLUE, 0, 1, 0, 8);
            pixelBlock(pixelSize, g, DEEP_BLUE, 0, 8, 7, 8);
            pixelBlock(pixelSize, g, GRAY_BLUE, 1, 7, 1, 7);
            pixelBlock(pixelSize, g, DEEP_BLUE, 2, 3, 2, 3);
            pixelBlock(pixelSize, g, DEEP_BLUE, 5, 6, 5, 6);
            pixelBlock(pixelSize, g, DEEP_BLUE, 2, 3, 5, 6);
            pixelBlock(pixelSize, g, DEEP_BLUE, 5, 6, 2, 3);
            pixelBlock(pixelSize, g, VERY_LIGHT_BLUE, 1, 8, 0, 1);
            pixelBlock(pixelSize, g, VERY_LIGHT_BLUE, 7, 8, 0, 7);
        } else {
            Color BRICK = new Color(64, 64, 64);
            Color MORTAR = new Color(85, 85, 85);
            Color DEPTH = new Color(40, 40, 40);
            Color GROSS_GREEN = new Color(70, 87, 10, 243);

            pixelBlock(pixelSize, g, BRICK, 0, 8, 0, 8);
            pixelBlock(pixelSize, g, DEPTH, 6, 7, 5, 8);
            pixelBlock(pixelSize, g, DEPTH, 3, 4, 0, 4);
            pixelBlock(pixelSize, g, DEPTH, 0, 8, 3, 4);
            pixelBlock(pixelSize, g, DEPTH, 0, 8, 7, 8);
            pixelBlock(pixelSize, g, MORTAR, 0, 8, 0, 1);
            pixelBlock(pixelSize, g, MORTAR, 0, 8, 4, 5);
            pixelBlock(pixelSize, g, MORTAR, 2, 3, 0, 4);
            pixelBlock(pixelSize, g, MORTAR, 5, 6, 5, 8);

            if (rand < 12) {
                pixelBlock(pixelSize, g, GROSS_GREEN, 4, 7, 2, 3);
                pixelBlock(pixelSize, g, GROSS_GREEN, 4, 6, 3, 4);
                pixelBlock(pixelSize, g, GROSS_GREEN, 5, 6, 4, 5);
            }
            if (rand > 8 && rand < 20) {
                pixelBlock(pixelSize, g, GROSS_GREEN, 1, 3, 4, 5);
                pixelBlock(pixelSize, g, GROSS_GREEN, 1, 4, 5, 6);
                pixelBlock(pixelSize, g, GROSS_GREEN, 3, 4, 6, 7);
            }
        }
    }
}