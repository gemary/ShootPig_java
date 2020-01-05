package core.InitGame;

import core.Constain.GameDefine;
import core.Gson.GsonManager;
import core.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {

    private final int DELAY = 10;
    private java.util.List<pig> pislist;
    private Cannon spaceShip;
    private Image background;
    private boolean IN_GAME = true;
    private Timer timer;
    private double CurrentPoint =0;
    private double BestPoint;
    private Player player;
    private boolean key= true;
    public Board(Player player){
        this.player= player;
        InitBoard();
    }

    private void InitBoard( ) {
        BestPoint =player.getBestScore();
        ImageIcon backg =new ImageIcon("ShootPig/Asset/Image/background.png");
        background =backg.getImage();
        initPig(5);
        spaceShip = new Cannon(GameDefine.B_WIDTH/2,0,player.getSpaceShip());
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                spaceShip.fire(e);
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
                spaceShip.move(e);
            }
        });
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(GameDefine.B_WIDTH,GameDefine.B_HEIGHT));
        timer = new Timer(DELAY,this);
        timer.start();
    }

    void initPig(int number){
        pislist = new ArrayList<>();
        int count =0;
        while (count < number){
            int x = (int) Math.round(Math.random() *GameDefine.B_WIDTH);
            int y = 1;
            pislist.add(new pig(x,y, (int) Math.round(Math.random() *( 3-1) )+1));
            count++;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawbackGround(g);
        if (IN_GAME){
            drawPigAndBullets(g);
            drawGun(g);
            drawPoint(g);
        }
        else {
            drawGameOver(g);
        }
        Toolkit.getDefaultToolkit().sync();
    }
    private void drawPoint(Graphics g){
        g.setFont(  new Font("Arial", Font.BOLD, 28));
        g.setColor(Color.RED);
        g.drawString("Best Score: "+BestPoint,10,30);
        g.drawString("Current Score :"+CurrentPoint,10,60);

    }
    private void drawPigAndBullets(Graphics g) {

        java.util.List<Missile> missiles = spaceShip.getMissiles();
        for (Missile missile : missiles) {

            g.drawImage(missile.getImage(), missile.getX(), missile.getY(),missile.width,missile.height, this);

        }
        for (pig pigs: pislist){

            g.drawImage(pigs.getImage(),pigs.getX(),pigs.getY(),pigs.width,pigs.height,this);


        }
        
    }
    private  void drawGun(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawLine( GameDefine.B_WIDTH/2, GameDefine.B_HEIGHT-spaceShip.width*3,spaceShip.getX2(),spaceShip.getY2());
        g2d.drawImage(spaceShip.getImage(), spaceShip.getX(),spaceShip.getY(), this);


    }
    private void drawbackGround(Graphics g) {
        g.setFont(  new Font("Arial", Font.BOLD, 32));
        g.setColor(Color.RED);
        g.drawString("Best Score: "+BestPoint,10,10);
        g.drawString("Current Score :"+CurrentPoint,10,60);
        g.drawImage(background,0,0, GameDefine.B_WIDTH,GameDefine.B_HEIGHT,this);
    }
    private void drawGameOver(Graphics g) {
        g.setColor(Color.RED);
        g.setFont( new Font("Arial", Font.BOLD, 62));
        g.drawString("Game Over !",GameDefine.B_WIDTH/3,GameDefine.B_HEIGHT/2);
        GsonManager gsonManager = new GsonManager();
        if (CurrentPoint > BestPoint){
            BestPoint = CurrentPoint;
        }
        gsonManager.save(GameDefine.fileName,new Player(BestPoint,CurrentPoint));
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        updatePig();
        updateMissiles();
        checkCollision();
        repaint();
    }


    void  updatePig(){
        if(pislist.isEmpty()){
            key =true;
            initPig((int) Math.round(Math.random() * (10-5) +5));
        }
        if ( CurrentPoint > 50 && key){
            key =false;

            initPig((int) Math.round(Math.random() * (20-10) +10));
        }
        if ( CurrentPoint > 100 && key){
            key =false;
            initPig((int) Math.round(Math.random() *  (40-20) +20));
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
                    CurrentPoint+=pigs.Point;
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

