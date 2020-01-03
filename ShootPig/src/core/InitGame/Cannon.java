package core.InitGame;

import core.Constain.GameDefine;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Cannon extends Sprite{


    private List<Missile> missiles;
    private   double angle;

    public Cannon(int x, int y,String Image) {
        super(x, y);
        initSpaceShip(Image);

    }
    private void initSpaceShip(String image) {
        missiles = new ArrayList<>();
        setImage(image);

        x = GameDefine.B_WIDTH/2;
        y = GameDefine.B_HEIGHT-width*3;
    }
    public List<Missile> getMissiles() {
        return missiles;
    }
    public void fire(MouseEvent e) {
        angle =Math.atan2(e.getY() - y,e.getX() - x);
        missiles.add(new Missile(x, y-height,angle ));
    }
    public void move(MouseEvent e){
        angle =Math.atan2(e.getY() - y,e.getX() - x);
//        double speedX = 2 * Math.cos(angle);
//        double speedY = 2*Math.sin(angle);
//        x = (int) speedX;
//        y= (int) speedY;
    }

    public double getAngle() {
        return angle;
    }
}
