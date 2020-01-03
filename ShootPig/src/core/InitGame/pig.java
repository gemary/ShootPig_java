package core.InitGame;

import core.Constain.GameDefine;

public class pig extends Sprite {
    public pig(int x, int y) {
        super(x, y);
        InitPit();
    }
    int Point =0;
    int INIT_PIG_SIZE =5;
    void  InitPit(){
        loadImage("ShootPig/Asset/Image/pig1.png");
        getImageDimensions();
    }

    public int getPoint() {
        return Point;
    }

    void  move(){
        switch (y){
            case 100: INIT_PIG_SIZE =6 ; Point =10; break;
            case 150: INIT_PIG_SIZE =8;  Point =9; break;
            case 200: INIT_PIG_SIZE =10;  Point =8;break;
            case 250: INIT_PIG_SIZE =12;  Point =7;break;
            case 300: INIT_PIG_SIZE =14; Point =6;break;
            case 350: INIT_PIG_SIZE =16;Point =5; break;
            case 440: INIT_PIG_SIZE=18; Point =4;break;
            case 540: INIT_PIG_SIZE=20; Point =3;break;
            case 600: INIT_PIG_SIZE=25;Point =2; break;
            case 650: INIT_PIG_SIZE=30;Point =1; break;
        }
        width =INIT_PIG_SIZE;
        height=INIT_PIG_SIZE;
        if (y <  GameDefine.B_HEIGHT && y>0)
        {
            y+=1;
        }

        if (y == GameDefine.B_HEIGHT -80){
            y-=1;
            x+= GameDefine.B_WIDTH -x > x ? 1: -1;

        }


    }
}
