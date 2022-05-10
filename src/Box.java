import java.awt.*;

public class Box extends Block{
    Color RANDOM_CLEAR1 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), 200);
    Color RANDOM_CLEAR2 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), 200);
    Color RANDOM_CLEAR3 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), 200);
    Color RANDOM_CLEAR4 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), 200);
    Color RANDOM1 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    Color RANDOM2 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    Color RANDOM3 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    Color RANDOM4 = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

    int height = (int) (Math.random() * 4) + 2;
    int rand3 = (int) (Math.random() * 3);

    int position1 = (int) (Math.random() * 2);
    int position2 = (int) (Math.random() * 2);
    int position3 = (int) (Math.random() * 2);
    int position4 = (int) (Math.random() * 2);

    public Box(int blockSize, int x, int y) {
        super(blockSize, x, y);
    }

    public void draw(Graphics g, int pixelSize, int counter, int world) {
        if (world == 1) {
            Color GLASS = new Color(87, 109, 109, 100);
            Color DARK_BROWN = new Color(68, 35, 16);

            switch (rand3) {
                case 0:
                    pixelBlock(pixelSize, g, RANDOM_CLEAR1, 2, 6, height, 7);
                    pixelBlock(pixelSize, g, GLASS, 0, 7, 0, 1);
                    pixelBlock(pixelSize, g, GLASS, 1, 7, 1, 8);
                    pixelBlock(pixelSize, g, Color.BLACK, 4, 6, 5, 6);
                    pixelBlock(pixelSize, g, Color.BLACK, 4, 6, 3, 4);

                    break;
                case 1:
                    if (position1 < 1) {
                        pixelBlock(pixelSize, g, GLASS, 5, 6, 1, 3);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR1, 5, 6, 3, 4);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR1, 5, 6, 5, 7);
                    }
                    if (position2 < 1) {
                        pixelBlock(pixelSize, g, GLASS, 4, 5, 1, 3);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR2, 4, 5, 3, 4);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR2, 4, 5, 5, 7);
                    }
                    if (position3 < 1) {
                        pixelBlock(pixelSize, g, GLASS, 3, 4, 1, 3);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR3, 3, 4, 3, 4);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR3, 3, 4, 5, 7);
                    }
                    if (position4 < 1) {
                        pixelBlock(pixelSize, g, GLASS, 2, 3, 1, 3);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR4, 2, 3, 3, 4);
                        pixelBlock(pixelSize, g, RANDOM_CLEAR4, 2, 3, 5, 7);
                    }
                    pixelBlock(pixelSize, g, DARK_BROWN, 0, 8, 7, 8);
                    pixelBlock(pixelSize, g, DARK_BROWN, 1, 2, 5, 7);
                    pixelBlock(pixelSize, g, DARK_BROWN, 6, 7, 5, 7);
                    pixelBlock(pixelSize, g, DARK_BROWN, 0, 8, 4, 5);

                    break;
                case 2:
                    pixelBlock(pixelSize, g, RANDOM1, 0, 8, 6, 8);
                    pixelBlock(pixelSize, g, RANDOM2, 0, 7, 5, 6);
                    pixelBlock(pixelSize, g, RANDOM3, 1, 8, 4, 5);
                    pixelBlock(pixelSize, g, RANDOM4, 1, 6, 3, 4);
                    pixelBlock(pixelSize, g, Color.BLACK, 2, 3, 6, 8);

                    break;
            }

        } else {
            Color TOXIC1 = new Color(116, 141, 28);
            Color TOXIC2 = new Color(175, 213, 42);
            Color RUST = new Color(78, 35, 17);
            Color SHADE = new Color(56, 24, 12);
            Color RIM = new Color(56, 27, 20);
            Color SHADE_RIM = new Color(45, 22, 16);

            pixelBlock(pixelSize, g, RIM, 3, 8, 0, 1);
            pixelBlock(pixelSize, g, RIM, 3, 8, 2, 3);
            pixelBlock(pixelSize, g, RIM, 3, 8, 5, 6);
            pixelBlock(pixelSize, g, RIM, 3, 8, 7, 8);
            pixelBlock(pixelSize, g, SHADE_RIM, 0, 3, 0, 1);
            pixelBlock(pixelSize, g, SHADE_RIM, 0, 3, 2, 3);
            pixelBlock(pixelSize, g, SHADE_RIM, 0, 3, 5, 6);
            pixelBlock(pixelSize, g, SHADE_RIM, 0, 3, 7, 8);
            pixelBlock(pixelSize, g, RUST, 3, 8, 1, 2);
            pixelBlock(pixelSize, g, RUST, 3, 8, 3, 5);
            pixelBlock(pixelSize, g, RUST, 3, 8, 6, 7);
            pixelBlock(pixelSize, g, SHADE, 0, 3, 1, 2);
            pixelBlock(pixelSize, g, SHADE, 0, 3, 3, 5);
            pixelBlock(pixelSize, g, SHADE, 0, 3, 6, 7);
            pixelBlock(pixelSize, g, TOXIC1, 2, 3, 0, 1);
            pixelBlock(pixelSize, g, TOXIC1, 3, 4, 0, 4);
            pixelBlock(pixelSize, g, TOXIC1, 4, 5, 0, 2);
            pixelBlock(pixelSize, g, TOXIC2, 5, 6, 0, 3);
            pixelBlock(pixelSize, g, TOXIC2, 4, 5, 2, 4);
            pixelBlock(pixelSize, g, TOXIC2, 4, 5, 5, 6);

        }
    }
}