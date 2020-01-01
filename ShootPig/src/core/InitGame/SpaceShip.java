package core.InitGame;

import core.Constain.GameDefine;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite{


    private List<Missile> missiles;

    public SpaceShip(int x, int y) {
        super(x, y);
        initSpaceShip();

    }

    private void initSpaceShip() {
        missiles = new ArrayList<>();
        loadImage("Asset/Image/planes.png");
        getImageDimensions();;
        x =GameDefine.B_WIDTH/2 -width;
        y = GameDefine.B_HEIGHT-height;
    }
    public List<Missile> getMissiles() {
        return missiles;
    }
    public void fire() {
        missiles.add(new Missile( x+ width /2, y- height ));
    }

}
