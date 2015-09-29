package uiView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by USER on 19.09.15.
 */
public class PipelineView {
    private  JFrame mainFrame = new JFrame();
    Box box = Box.createVerticalBox();

    public PipelineView(){
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.add(box);
        box.setPreferredSize(new Dimension(1970,500));
        addLine();
        addLine();
        mainFrame.pack();
    }

    public void addLine(){
        PipelinePanel panel = new PipelinePanel();
//        panel.setPreferredSize(new Dimension(1500,300));
        box.add(panel);
    }


}
