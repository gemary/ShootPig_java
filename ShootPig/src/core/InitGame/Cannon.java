package core.InitGame;

import core.Constain.GameDefine;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Cannon extends Sprite{


    private List<Missile> missiles;
    private   double angle;
    int x2,y2;
    public Cannon(int x, int y,String Image) {
        super(x, y);
        initSpaceShip(Image);

    }
    private void initSpaceShip(String image) {
        missiles = new ArrayList<>();
        setImage(image);
        getImageDimensions();
        x = GameDefine.B_WIDTH/2;
        y = GameDefine.B_HEIGHT-height*3;
    }
    public List<Missile> getMissiles() {
        return missiles;
    }
    public void fire(MouseEvent e) {
        angle =Math.atan2(e.getY() - y,e.getX() - x);
        missiles.add(new Missile(x, y-height,angle ));
    }
    public void move(MouseEvent e){
        x2 =e.getX();
        y2=e.getY();
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public double getAngle() {
        return angle;
    }
}
