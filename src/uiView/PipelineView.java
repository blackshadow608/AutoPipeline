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
    private PipelinePanel panel = new PipelinePanel();
    private PipelinePanel panel2= new PipelinePanel();
    Box box = Box.createVerticalBox();

    public PipelineView(){
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.add(box);
        addLines(panel);
        addLines(panel2);
        mainFrame.pack();
    }

    public void addLines(PipelinePanel panel){
        box.add(panel);
    }

}
