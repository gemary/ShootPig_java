package core.InitGame;

import core.Constain.ConstainGame;

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
        y -= ConstainGame.getInstance().getMISSILE_SPEED();
        if (y > ConstainGame.getInstance().getB_WIDTH()){
            setVisible(false);
        }
    }
}
