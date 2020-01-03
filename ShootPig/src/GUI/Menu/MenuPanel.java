/*
 * Created by JFormDesigner on Tue Dec 31 13:48:25 ICT 2019
 */

package GUI.Menu;

import GUI.Player.PlayerPanel;
import core.Constain.GameDefine;
import core.Gson.GsonManager;
import core.InitGame.SwingTimerEx;
import core.Player;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author duc
 */
public class MenuPanel extends JPanel {

    public MenuPanel() {

        initComponents();
    }

    private void btnPlayerActionPerformed(ActionEvent e) {
        PlayerPanel view = new PlayerPanel();
        int option = JOptionPane.showConfirmDialog(this,view.getRootPanel(),"Player",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.YES_OPTION){
            GsonManager gsonManager = new GsonManager();
            Player player = gsonManager.ParseGsonToObject(gsonManager.ReadText(GameDefine.fileName));

            player.setSpaceShip( view.getResourceSelected());
            gsonManager.save(GameDefine.fileName,player);
        }
    }

    private void btnExistActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void itemNewActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void ItemLoadActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void ItemPlayerActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void ItemExistActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnSaveActionPerformed(ActionEvent e) {

    }

    private void btnAboutActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnNewGameActionPerformed(ActionEvent e) {
        EventQueue.invokeLater(()->{
            Player player = new Player();
            SwingTimerEx ex = new SwingTimerEx(player);
            ex.setVisible(true);
        });
    }

    private void btnContinuesActionPerformed(ActionEvent e) {

        EventQueue.invokeLater(()->{
            GsonManager gsonManager = new GsonManager();
            String JsonString = gsonManager.ReadText(GameDefine.fileName);
            Player player =gsonManager.ParseGsonToObject(JsonString);
            SwingTimerEx ex = new SwingTimerEx(player);
            ex.setVisible(true);
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - duc
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        itemNew = new JMenuItem();
        ItemLoad = new JMenuItem();
        ItemPlayer = new JMenuItem();
        ItemExist = new JMenuItem();
        btnSave = new JButton();
        btnAbout = new JButton();
        btnNewGame = new JButton();
        btnContinues = new JButton();
        btnPlayer = new JButton();
        btnExist = new JButton();

        //======== this ========

        setLayout(null);

        //======== menuBar1 ========
        {
            menuBar1.setBorder(new LineBorder(Color.white, 2, true));

            //======== menu1 ========
            {
                menu1.setText("Menu");

                //---- itemNew ----
                itemNew.setText("NEW GAME");
                itemNew.addActionListener(e -> itemNewActionPerformed(e));
                menu1.add(itemNew);
                menu1.addSeparator();

                //---- ItemLoad ----
                ItemLoad.setText("CONTINUES");
                ItemLoad.addActionListener(e -> ItemLoadActionPerformed(e));
                menu1.add(ItemLoad);
                menu1.addSeparator();

                //---- ItemPlayer ----
                ItemPlayer.setText("PLAYER");
                ItemPlayer.addActionListener(e -> ItemPlayerActionPerformed(e));
                menu1.add(ItemPlayer);
                menu1.addSeparator();

                //---- ItemExist ----
                ItemExist.setText("EXIST");
                ItemExist.addActionListener(e -> ItemExistActionPerformed(e));
                menu1.add(ItemExist);
            }
            menuBar1.add(menu1);

            //---- btnSave ----
            btnSave.setText("Save");
            btnSave.setFocusable(false);
            btnSave.setBorderPainted(false);
            btnSave.setContentAreaFilled(false);
            btnSave.addActionListener(e -> btnSaveActionPerformed(e));
            menuBar1.add(btnSave);

            //---- btnAbout ----
            btnAbout.setText("About");
            btnAbout.setFocusable(false);
            btnAbout.setBorderPainted(false);
            btnAbout.setContentAreaFilled(false);
            btnAbout.addActionListener(e -> btnAboutActionPerformed(e));
            menuBar1.add(btnAbout);
        }
        add(menuBar1);
        menuBar1.setBounds(0, 0, 700, menuBar1.getPreferredSize().height);

        //---- btnNewGame ----
        btnNewGame.setText("New Game");
        btnNewGame.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        btnNewGame.setBorder(new LineBorder(Color.white, 3, true));
        btnNewGame.setForeground(Color.white);
        btnNewGame.setBackground(new Color(61, 150, 164));
        btnNewGame.setFocusable(false);
        btnNewGame.addActionListener(e -> btnNewGameActionPerformed(e));
        add(btnNewGame);
        btnNewGame.setBounds(245, 70, 215, 70);

        //---- btnContinues ----
        btnContinues.setText("Continues");
        btnContinues.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        btnContinues.setBorder(new LineBorder(Color.white, 3, true));
        btnContinues.setForeground(Color.white);
        btnContinues.setBackground(new Color(61, 150, 164));
        btnContinues.setFocusable(false);
        btnContinues.addActionListener(e -> btnContinuesActionPerformed(e));
        add(btnContinues);
        btnContinues.setBounds(245, 160, 215, 70);

        //---- btnPlayer ----
        btnPlayer.setText("Player");
        btnPlayer.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        btnPlayer.setBorder(new LineBorder(Color.white, 3, true));
        btnPlayer.setForeground(Color.white);
        btnPlayer.setBackground(new Color(61, 150, 164));
        btnPlayer.setFocusable(false);
        btnPlayer.addActionListener(e -> btnPlayerActionPerformed(e));
        add(btnPlayer);
        btnPlayer.setBounds(245, 255, 215, 70);

        //---- btnExist ----
        btnExist.setText("Exist");
        btnExist.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        btnExist.setBorder(new LineBorder(Color.white, 3, true));
        btnExist.setForeground(Color.white);
        btnExist.setBackground(new Color(61, 150, 164));
        btnExist.setFocusable(false);
        btnExist.addActionListener(e -> btnExistActionPerformed(e));
        add(btnExist);
        btnExist.setBounds(245, 350, 215, 70);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - duc
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem itemNew;
    private JMenuItem ItemLoad;
    private JMenuItem ItemPlayer;
    private JMenuItem ItemExist;
    private JButton btnSave;
    private JButton btnAbout;
    private JButton btnNewGame;
    private JButton btnContinues;
    private JButton btnPlayer;
    private JButton btnExist;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
