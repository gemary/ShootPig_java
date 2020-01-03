package GUI.Intro;

import GUI.MainForm;
import GUI.Menu.MenuPanel;
import core.Screen;

import javax.swing.*;
import java.awt.*;

import static core.Screen.MENU;

public class IntroPanel extends JPanel {

    private JPanel rootpanel;

    public JPanel getRootpanel() {
        return rootpanel;
    }

    public IntroPanel() {

        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - duc
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========


        //---- label1 ----
        label1.setText("Shoot Pigs");
        label1.setFont(new Font("Vivaldi", Font.BOLD, 62));
        add(label1);
        label1.setBounds(115, 215, 360, label1.getPreferredSize().height);

        //---- label2 ----
        label2.setIcon(new ImageIcon("ShootPig/Asset/Image/pig.png"));
        add(label2);
        label2.setBounds(new Rectangle(new Point(510, 150), label2.getPreferredSize()));

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
        setLayout(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private JLabel label1;
    private JLabel label2;
}
