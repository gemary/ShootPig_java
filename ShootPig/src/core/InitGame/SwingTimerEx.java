package core.InitGame;

import javax.swing.*;
import java.awt.*;

public class SwingTimerEx extends JFrame {
    public SwingTimerEx(){
        initUI();
    }

    private void initUI() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle(" Screen");
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        // write your code here
        EventQueue.invokeLater(()->{
            SwingTimerEx ex = new SwingTimerEx();
            ex.setVisible(true);
        });
    }
}
