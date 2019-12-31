package core.InitGame;

import core.Constain.ConstainGame;

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

        if (y < ConstainGame.getInstance().getB_WIDTH() && x < ConstainGame.getInstance().getB_HEIGHT() && x >0 && y>0)
        {
            y+=2;
           // x-=2;
        }
        else {
            y= (int) Math.round(Math.random()*ConstainGame.getInstance().getB_HEIGHT()/2) ;
            x=  ConstainGame.getInstance().getB_WIDTH();
        }
    }
}
