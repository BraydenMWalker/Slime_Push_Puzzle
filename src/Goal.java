import java.awt.*;

public class Goal extends Floor {
    public Goal(int blockSize, int x, int y) {
        super(blockSize, x, y);
    }

    public void draw(Graphics g, int pixelSize, int counter, int world) {
        if (world == 1) {
            pixelBlock(pixelSize, g, Color.BLACK, 1, 8, 2, 7);
            pixelBlock(pixelSize, g, Color.BLACK, 2, 7, 1, 8);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 0, 1, 1, 6);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 1, 6, 0, 1);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 6, 7, 1, 6);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 1, 6, 6, 7);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 1, 2, 1, 2);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 5, 6, 1, 2);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 5, 6, 5, 6);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 1, 2, 5, 6);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 2, 3, 1, 6);
            pixelBlock(pixelSize, g, Color.LIGHT_GRAY, 4, 5, 1, 6);
        } else {
            for (int i = 0; i < 8; i++) {
                for (int j = 1; j < 7; j++) {
                    Color LADDER = new Color(i * 20 + 50, i * 20 + 50, i * 20 + 50);
                    if (i % 2 == 0) {
                        pixelBlock(pixelSize, g, LADDER, 1, 7, i, i + 1);
                    } else {
                        if (j == 1 || j == 6) {
                            pixelBlock(pixelSize, g, LADDER, j, j + 1, i, i + 1);
                        }
                    }
                }
            }
        }
    }
}