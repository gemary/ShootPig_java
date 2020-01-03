package core.InitGame;

import javax.swing.*;
import java.awt.*;

public class Sprite {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        visible = true;
    }
    protected void loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
    protected void getImageDimensions() {
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    public void setImage(String image) {
        ImageIcon ii = new ImageIcon(image);
        width = ii.getImage().getWidth(null);
        height = ii.getImage().getHeight(null);
        this.image = ii.getImage();
    }

    public Image getImage() {
        return this.image;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
