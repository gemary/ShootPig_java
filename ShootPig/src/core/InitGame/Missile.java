package core.InitGame;

import core.Constain.GameDefine;

public class Missile extends Sprite {

    public Missile(int x, int y) {
        super(x, y);
        initMissile();
    }

    int INIT_PIG_SIZE =15;
    private void initMissile() {
        loadImage("ShootPig/Asset/Image/bullet.png");
        getImageDimensions();

    }
    void move(){
        y -= GameDefine.MISSILE_SPEED;
        if (y <750) {
            INIT_PIG_SIZE=12;
        }
        if (y <650) {
            INIT_PIG_SIZE=10;
        }
        if (y <450) {
            INIT_PIG_SIZE=8;
        }
        if (y <350) {
            INIT_PIG_SIZE=6;
        }
        if (y <200) {
            INIT_PIG_SIZE=4;
        }
        if (y <150) {
            INIT_PIG_SIZE=2;
        }

        width =INIT_PIG_SIZE;
        height=INIT_PIG_SIZE;
        if (y > GameDefine.B_WIDTH){

            setVisible(false);
        }

    }
}
