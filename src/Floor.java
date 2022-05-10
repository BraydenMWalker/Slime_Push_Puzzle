import java.awt.*;

public class Floor extends Block {
    public Floor(int blockSize, int x, int y) {
        super(blockSize, x, y);
    }

    public void draw(Graphics g, int pixelSize, int counter, int world) {
        pixelBlock(pixelSize, g, Color.BLACK, 0, 8, 0, 8);
    }
}