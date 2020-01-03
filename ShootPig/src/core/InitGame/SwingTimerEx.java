package core.InitGame;

import core.Player;

import javax.swing.*;
import java.awt.*;

public class SwingTimerEx extends JFrame {
    public SwingTimerEx( Player player){
        initUI(player);
    }

    private void initUI( Player player) {

        add(new Board(player));
        setResizable(false);
        pack();
        setTitle(" Screen");
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {

    }
}
