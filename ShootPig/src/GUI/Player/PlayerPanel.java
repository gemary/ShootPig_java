package GUI.Player;

import com.google.gson.Gson;
import core.Constain.GameDefine;
import core.Gson.GsonManager;
import core.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PlayerPanel {
    private JPanel RootPanel;
    private JLabel lblImage;
    private JLabel lblBestScore;
    private JLabel lblCurrentScore;
    private String ResourceSelected;

    JComboBox  cbListImage;
    public PlayerPanel(){

        Init();

    }
    void Init() {
        RootPanel.setPreferredSize(new Dimension(400,200));
        String FilePath ="ShootPig/Asset/template/";
        Vector<String> listImage = new Vector<>();
        File currentDirectory = new File(FilePath);
        for (String str:currentDirectory.list()){
            listImage.add(str);
        }
        cbListImage = new JComboBox(listImage);
        RootPanel.add(cbListImage,BorderLayout.NORTH);
        cbListImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lblImage.setIcon(new ImageIcon(FilePath+String.valueOf(cbListImage.getSelectedItem())));
                ResourceSelected =FilePath+String.valueOf(cbListImage.getSelectedItem());
            }
        });

        Player player =new GsonManager().ParseGsonToObject(new GsonManager().ReadText(GameDefine.fileName));
        lblBestScore.setText("Best Score:"+player.getBestScore());
        lblCurrentScore.setText("Current Score:"+player.getCurrentScore());


    }

    public String getResourceSelected() {
        return ResourceSelected;
    }

    public JPanel getRootPanel() {
        return RootPanel;
    }
}
