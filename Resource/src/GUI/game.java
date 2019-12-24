/*
 * Created by JFormDesigner on Mon Dec 23 22:27:41 ICT 2019
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author duc
 */
public class game extends JFrame {
    public game() {
        initComponents();


    }

    private void rootPanelMouseMoved(MouseEvent e) {

        lblpig.setLocation(e.getX(),e.getY());
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - duc
        rootPanel = new JPanel();
        lblpig = new JLabel();
        lblbackground = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== rootPanel ========
        {
            rootPanel.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    rootPanelMouseMoved(e);
                }
            });
            rootPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,rootPanel. getBorder( )) ); rootPanel. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            rootPanel.setLayout(null);

            //---- lblpig ----
            lblpig.setIcon(new ImageIcon("C:\\Users\\Tokku\\Desktop\\ShootPig_java\\Resource\\Image\\pig1.png"));
            rootPanel.add(lblpig);
            lblpig.setBounds(new Rectangle(new Point(415, 195), lblpig.getPreferredSize()));

            //---- lblbackground ----
            lblbackground.setIcon(new ImageIcon("C:\\Users\\Tokku\\Desktop\\ShootPig_java\\Resource\\Image\\background.jpg"));
            rootPanel.add(lblbackground);
            lblbackground.setBounds(0, -15, 695, 585);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < rootPanel.getComponentCount(); i++) {
                    Rectangle bounds = rootPanel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = rootPanel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                rootPanel.setMinimumSize(preferredSize);
                rootPanel.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(rootPanel);
        rootPanel.setBounds(0, 0, 695, 635);

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
    private JPanel rootPanel;
    private JLabel lblpig;
    private JLabel lblbackground;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
