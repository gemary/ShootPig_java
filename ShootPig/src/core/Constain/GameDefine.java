package core.Constain;

import java.awt.*;

public interface GameDefine {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int SIZE_INTIT = 0;
    String fileName ="Resource/save.json";
    int SCREEN_WIDTH = 700;
    int SCREEN_HEIGHT = 500;
    int  B_WIDTH =screenSize.width;
    int B_HEIGHT = screenSize.height;
    int MISSILE_SPEED = 15;
}
