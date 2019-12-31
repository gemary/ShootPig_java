package core.Constain;

import java.awt.*;

public class ConstainGame {
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int S_WIDTH = 700;
    private final int S_HEIGHT = 500;
    private final int  B_WIDTH =screenSize.width;
    private final int B_HEIGHT = screenSize.height;
    private final int MISSILE_SPEED = 5;
    public static class singletonHelper{
            public static final ConstainGame INSTANCE = new ConstainGame();
    }
    public  static ConstainGame getInstance(){
        return singletonHelper.INSTANCE;
    }

    public int getB_HEIGHT() {
        return this.B_HEIGHT;
    }

    public int getB_WIDTH() {
        return this.B_WIDTH;
    }
    public int getMISSILE_SPEED() {
        return this.MISSILE_SPEED;
    }

    public int getS_HEIGHT() {
        return this.S_HEIGHT;
    }

    public int getS_WIDTH() {
        return this.S_WIDTH;
    }
}
