/*
 * Created by JFormDesigner on Tue Dec 31 13:59:23 ICT 2019
 */

package GUI;

import GUI.Intro.IntroPanel;
import GUI.Menu.MenuPanel;
import core.Constain.GameDefine;

import java.awt.*;
import javax.swing.*;

import static core.Screen.*;

/**
 * @author duc
 */
public class MainForm extends JFrame {

    Container contentPane = getContentPane();
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ChangeScreen(new MenuPanel(), String.valueOf(MENU));
        }
    });

    public MainForm() {

        setTitle(String.valueOf(INTRO));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new IntroPanel());
        setPreferredSize(new Dimension(GameDefine.SCREEN_WIDTH,GameDefine.SCREEN_HEIGHT));
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
        thread.start();

    }
   public void ChangeScreen(JPanel screen,String Name){
        setLayout(null);
        setTitle(Name);
        setContentPane(screen);
        revalidate();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - duc

        //======== this ========
        contentPane.setLayout(null);
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
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - duc
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
