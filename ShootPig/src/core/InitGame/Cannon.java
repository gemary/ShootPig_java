package core.InitGame;

import core.Constain.GameDefine;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Cannon extends Sprite{


    private List<Missile> missiles;

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
    public void fire() {
        missiles.add(new Missile( x, y-height ));
    }
    public void move(MouseEvent e){
      x=  e.getX();
    }
}
