package core.InitGame;

import core.Constain.GameDefine;

public class pig extends Sprite {
    public pig(int x, int y,int Speed) {
        super(x, y);
        InitPit(Speed);
    }
    int SPEED ;
    int Point =0;
    int INIT_PIG_SIZE =5;
    void  InitPit(int Speed){
        this.SPEED = Speed;
        loadImage("ShootPig/Asset/Image/pig1.png");
        getImageDimensions();
    }

    public int getPoint() {
        return Point;
    }

    void  move(){
        if (y >100) { INIT_PIG_SIZE=10;Point =10; }
        if (y >150) { INIT_PIG_SIZE=12;Point =9; }
        if (y >200) { INIT_PIG_SIZE=14;Point =8; }
        if (y >250) { INIT_PIG_SIZE=16;Point =7; }
        if (y >300) { INIT_PIG_SIZE=18;Point =6; }
        if (y >350) { INIT_PIG_SIZE=20;Point =5; }
        if (y >440) { INIT_PIG_SIZE=22;Point =4; }
        if (y >540) { INIT_PIG_SIZE=24;Point =3; }
        if (y >600) { INIT_PIG_SIZE=26;Point =2; }
        if (y >650) { INIT_PIG_SIZE=28;Point =1; }
        width =INIT_PIG_SIZE;
        height=INIT_PIG_SIZE;
        if (y <  GameDefine.B_HEIGHT && y>0)
        {
            y+=SPEED;
        }

        if (  y >= GameDefine.B_HEIGHT -80){
            getImageDimensions();

            y-=SPEED;
            x+= GameDefine.B_WIDTH -x > x ? 1: -1;

        }


    }
}
