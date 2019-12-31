/*
 * Created by JFormDesigner on Mon Dec 30 20:52:11 ICT 2019
 */

package GUI.Player;

import java.awt.*;
import javax.swing.*;

/**
 * @author duc
 */
public class PlayerPanel extends JPanel {
    public PlayerPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - duc
        lblPlayerName = new JLabel();


        //---- lblPlayerName ----
        lblPlayerName.setText("PlayerName");
        lblPlayerName.setFont(new Font("Vladimir Script", Font.BOLD, 30));
        lblPlayerName.setForeground(new Color(0, 120, 96));
        add(lblPlayerName);
        lblPlayerName.setBounds(35, 45, 160, 35);

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
    private JLabel lblPlayerName;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
