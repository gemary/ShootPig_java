package core.InitGame;

import core.Constain.GameDefine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {

    private final int DELAY = 10;
    private java.util.List<pig> pislist;
    private SpaceShip spaceShip;
    private Image background;
    private boolean IN_GAME = true;
    private Timer timer;
    private  int x,y;

    public Board(){
        InitBoard();
    }


    private void InitBoard() {
        ImageIcon backg=new ImageIcon("Asset/Image/background.jpg");
        background =backg.getImage();
        initPig();
        spaceShip = new SpaceShip(GameDefine.B_WIDTH/2,0);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                spaceShip.fire();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(GameDefine.B_WIDTH,GameDefine.B_HEIGHT));
        timer = new Timer(DELAY,this);
        timer.start();
    }

    void initPig(){
        pislist = new ArrayList<>();
        int count =0;
        while (count < 10){
            int x = (int) Math.round(Math.random()*GameDefine.B_WIDTH);
            int y = (int) Math.round(Math.random() *GameDefine.B_HEIGHT/2);
            pislist.add(new pig(x,y));
            count++;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawbackGround(g);
        if (IN_GAME){
            doDrawing(g);
            drawGun(g);
        }
        else {
            drawGameOver(g);
        }


        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        java.util.List<Missile> missiles = spaceShip.getMissiles();
        for (Missile missile : missiles) {
            g.drawImage(missile.getImage(), missile.getX(), missile.getY(), this);
        }
        for (pig pigs: pislist){
            g.drawImage(pigs.getImage(),pigs.getX(),pigs.getY(),this);
        }


    }
    private  void drawGun(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
       // g2d.rotate(Math.toRadians(80));
        g.drawImage(spaceShip.getImage(), spaceShip.getX(), spaceShip.getY(), this);

    }
    private void drawbackGround(Graphics g) {

        g.drawImage(background,0,0, GameDefine.B_WIDTH,GameDefine.B_HEIGHT,this);

    }
    private void drawGameOver(Graphics g) {



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        updatePig();
        updateMissiles();
        checkCollision();
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
                IN_GAME = false;
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

