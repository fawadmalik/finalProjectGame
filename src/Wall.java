import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Wall {
    int x;
    int y;
    int width;
    int height;
    int startX;

    Rectangle hitBox;
    public Wall(int x, int y, int width, int height) {
        this.x = x;
        startX = x;
        this.y = y;
        this.width = width;
        this.height = height;
        hitBox = new Rectangle(x, y, width, height);
    }
    public void draw(Graphics2D gtd) {
        gtd.setColor(Color.BLACK);
        gtd.drawRect(x, y, width, height);
        gtd.setColor(new Color(102,51,0));
        gtd.fillRect(x+1, y+1, width-2, height-2);
        gtd.setColor(Color.GREEN);
        gtd.fillRect(x+1, y+1, width, height-40);
    }
    public int set(int cameraX) {
        x = startX + cameraX;
        hitBox.x = x;
        return x;
    }
}