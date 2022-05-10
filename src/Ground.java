import java.awt.*;

public class Ground extends Floor {
    public Ground(int blockSize, int x, int y) {
        super(blockSize, x, y);
    }

    public void draw(Graphics g, int pixelSize, int counter, int world) {
        if (world == 1) {
            for (int i = 0; i < 80; i++) {
                int color = 235 + 5 * (i % 6 * i % 5);
                pixelBlock(pixelSize, g, new Color(color, color, color), i / 10, i / 10 + 1, i % 8, i % 8 + 1);
            }
        } else if (world == 2) {
            Color GRATE = new Color(40, 40, 40);
            Color WATER = new Color(77, 88, 44);

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == 0) {
                        pixelBlock(pixelSize, g, GRATE, 0, 8, i, i + 1);
                    } else {
                        if (j % 2 == 0) {
                            pixelBlock(pixelSize, g, GRATE, j, j + 1, i, i + 1);
                        } else {
                            pixelBlock(pixelSize, g, WATER, j, j + 1, i, i + 1);
                        }
                    }
                }
            }
        }
    }
}