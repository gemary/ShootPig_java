package core.InitGame;

import core.Constain.GameDefine;

public class Missile extends Sprite {

    public Missile(int x, int y) {
        super(x, y);
        initMissile();
    }

    private void initMissile() {
        loadImage("Asset/Image/laze.png");
        getImageDimensions();
    }
    void move(){
        y -= GameDefine.MISSILE_SPEED;
        if (y > GameDefine.B_WIDTH){
            setVisible(false);
        }
    }
}
