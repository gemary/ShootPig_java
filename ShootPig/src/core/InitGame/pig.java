package core.InitGame;

import core.Constain.GameDefine;

public class pig extends Sprite {
    public pig(int x, int y) {
        super(x, y);
        InitPit();
    }
    void  InitPit(){
        loadImage("Asset/Image/pig.png");
        getImageDimensions();
    }
    void  move(){

        if (y <  GameDefine.B_HEIGHT && y>0)
        {
            y+=1;

        }
        if (y == GameDefine.B_HEIGHT){

            x+= GameDefine.B_WIDTH -x > x ? 1: -1;

        }


    }
}
