package core.InitGame;

import core.Constain.ConstainGame;

import javax.swing.*;
import java.awt.*;
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
    }
    public List<Missile> getMissiles() {
        return missiles;
    }
    public void fire() {
        missiles.add(new Missile( x+ width /2, y- height ));
    }

    public void mouseMoved(MouseEvent e) {
        if (e.getX() < ConstainGame.getInstance().getB_WIDTH() - 100 && e.getY() < ConstainGame.getInstance().getB_HEIGHT()-100 ){
            x =e.getX();
            y=e.getY();
        }


    }
}
