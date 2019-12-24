/*
 * Created by JFormDesigner on Sun Dec 22 14:19:22 ICT 2019
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

import Constain.ConstainOfGame;
import net.miginfocom.swing.*;

/**
 * @author duc
 */
public class MainMenuForm extends JFrame {
    public MainMenuForm() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(450,600));
        pack();

    }

    private void MenuExistActionPerformed(ActionEvent e) {

        
        System.exit(0);
    }

    private void btnstartActionPerformed(ActionEvent e) {
        // TODO add your code here
        game gameFrame = new game();
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setPreferredSize(new Dimension(ConstainOfGame.WIDTH,ConstainOfGame.HEIGHT));
        Toolkit tk= getToolkit();
        Cursor transparent = tk.createCustomCursor(tk.getImage(""), new Point(), "trans");
//        gameFrame.setCursor(gameFrame.getToolkit().createCustomCursor(
//                new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),
//                "null"));
        gameFrame.setCursor(transparent);

        gameFrame.pack();
        gameFrame.setVisible(true);
        setVisible(false);
    }

    private void btnloadActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btntemplateActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnExistActionPerformed(ActionEvent e) {
        System.exit(0);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - duc
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        MenuExist = new JMenuItem();
        btnstart = new JButton();
        btnload = new JButton();
        btnExist = new JButton();
        btntemplate = new JButton();
        background = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon("C:\\Users\\Tokku\\Desktop\\ShootPig_java\\Resource\\Image\\pig.png").getImage());
        setTitle("Shoot Pig");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {
            menuBar1.setBackground(new Color(153, 255, 255));

            //======== menu1 ========
            {
                menu1.setText("Menu");

                //---- menuItem1 ----
                menuItem1.setText("NEW");
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("SAVE");
                menu1.add(menuItem2);

                //---- MenuExist ----
                MenuExist.setText("EXIST");
                MenuExist.addActionListener(e -> MenuExistActionPerformed(e));
                menu1.add(MenuExist);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);

        //---- btnstart ----
        btnstart.setText("Start");
        btnstart.setBorder(null);
        btnstart.setForeground(Color.white);
        btnstart.setBackground(new Color(0, 153, 204));
        btnstart.setFocusable(false);
        btnstart.addActionListener(e -> btnstartActionPerformed(e));
        contentPane.add(btnstart);
        btnstart.setBounds(165, 85, 110, 73);

        //---- btnload ----
        btnload.setText("Load");
        btnload.setBorder(null);
        btnload.setForeground(Color.white);
        btnload.setBackground(new Color(0, 153, 204));
        btnload.setFocusable(false);
        btnload.addActionListener(e -> btnloadActionPerformed(e));
        contentPane.add(btnload);
        btnload.setBounds(165, 180, 110, 73);

        //---- btnExist ----
        btnExist.setText("Exist");
        btnExist.setBorder(null);
        btnExist.setForeground(Color.white);
        btnExist.setBackground(new Color(0, 153, 204));
        btnExist.setFocusable(false);
        btnExist.addActionListener(e -> btnExistActionPerformed(e));
        contentPane.add(btnExist);
        btnExist.setBounds(165, 375, 110, 73);

        //---- btntemplate ----
        btntemplate.setText("Skiin");
        btntemplate.setBorder(null);
        btntemplate.setForeground(Color.white);
        btntemplate.setBackground(new Color(0, 153, 204));
        btntemplate.setFocusable(false);
        btntemplate.addActionListener(e -> btntemplateActionPerformed(e));
        contentPane.add(btntemplate);
        btntemplate.setBounds(165, 280, 110, 73);

        //---- background ----
        background.setIcon(new ImageIcon("C:\\Users\\Tokku\\Desktop\\ShootPig_java\\Resource\\Image\\background.jpg"));
        contentPane.add(background);
        background.setBounds(new Rectangle(new Point(-200, 0), background.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - duc
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem MenuExist;
    private JButton btnstart;
    private JButton btnload;
    private JButton btnExist;
    private JButton btntemplate;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String [] args){
        MainMenuForm mainMenuForm = new MainMenuForm();
        mainMenuForm.setVisible(true);
    }
}
