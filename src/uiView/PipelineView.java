package uiView;

import javax.swing.*;
import java.awt.*;

/**
 * Created by USER on 19.09.15.
 */
public class PipelineView {
    private  JFrame mainFrame = new JFrame();
    private PipelinePanel panel = new PipelinePanel();

    public PipelineView(){
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.getContentPane().setBackground(Color.WHITE);
        mainFrame.pack();
//        addLines(panel);
    }

    public void addLines(PipelinePanel panel){
        mainFrame.add(panel);
    }

}
