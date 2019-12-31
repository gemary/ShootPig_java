package core.InitGame;

import core.Constain.ConstainGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {

    private final int DELAY = 10;
    private java.util.List<pig> pislist;
    private SpaceShip spaceShip;
    private Image background;
    private boolean INIT_PIG= true;
    private Timer timer;
    private  int x,y;

    public Board(){
        InitBoard();
    }


    private void InitBoard() {
        ImageIcon backg=new ImageIcon("Asset/Image/background.jpg");
        background =backg.getImage();
        initPig();
        spaceShip = new SpaceShip(ConstainGame.getInstance().getB_WIDTH()/2,0);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                spaceShip.mouseMoved(e);
            }
        });
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(ConstainGame.getInstance().getB_WIDTH(),ConstainGame.getInstance().getB_HEIGHT()));
        timer = new Timer(DELAY,this);
        timer.start();
    }

    void initPig(){
        pislist = new ArrayList<>();
        int count =0;
        while (count < 50){
            int x = (int) Math.round(Math.random()* ConstainGame.getInstance().getB_WIDTH());
            int y = (int) Math.round(Math.random() *ConstainGame.getInstance().getB_HEIGHT()/2);
            pislist.add(new pig(x,y));
            count++;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawbackGround(g);
        drawGameOver(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        g.drawImage(spaceShip.getImage(), spaceShip.getX(), spaceShip.getY(), this);
        java.util.List<Missile> missiles = spaceShip.getMissiles();
        for (Missile missile : missiles) {
            g.drawImage(missile.getImage(), missile.getX(), missile.getY(), this);
        }
        for (pig pigs: pislist){
            g.drawImage(pigs.getImage(),pigs.getX(),pigs.getY(),this);
        }


    }
    private void drawbackGround(Graphics g) {

        g.drawImage(background,0,0,ConstainGame.getInstance().getB_WIDTH(),ConstainGame.getInstance().getB_HEIGHT(),this);

    }
    private void drawGameOver(Graphics g) {



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        step();
        updatePig();
        updateMissiles();
        checkCollision();
    }

    private void step() {
        spaceShip.fire();
        repaint();
    }
    void  updatePig(){
        if(pislist.isEmpty()){
            initPig();
        }

        for(int i = 0 ; i < pislist.size();i++){
           pig p = pislist.get(i);
           if (p.visible){
               p.move();
           }
           else
           {
               pislist.remove(i);
           }
        }
    }
    void checkCollision(){
        Rectangle rs = spaceShip.getBounds();
        for(pig pigs :pislist){

            Rectangle rpig =pigs.getBounds();
            if(rs.intersects(rpig)){
                pigs.setVisible(false);
                spaceShip.setVisible(false);
                System.out.println("va cham");
            }
        }
        java.util.List<Missile> ms = spaceShip.getMissiles();

        for (Missile m : ms) {

            Rectangle r1 = m.getBounds();

            for(pig pigs :pislist){
                Rectangle rpig = pigs.getBounds();
                if(r1.intersects(rpig)){
                    pigs.setVisible(false);
                    m.setVisible(false);
                    System.out.println("va cham 2");
                }
            }
        }

    }
    private void updateMissiles() {

        java.util.List<Missile> missiles = spaceShip.getMissiles();

        for (int i = 0; i < missiles.size(); i++) {

            Missile missile = missiles.get(i);

            if (missile.isVisible()) {
                missile.move();
            } else {
                missiles.remove(i);
            }
        }
    }

}

