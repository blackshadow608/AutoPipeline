package uiView;

import javax.swing.*;

/**
 * Created by USER on 19.09.15.
 */
public class PipelinePanel extends JPanel {
    private JLabel imageChassis = new JLabel(new ImageIcon("chassie.png"));

    public PipelinePanel(){
        Box steps = Box.createHorizontalBox();
        steps.add(imageChassis);
        add(steps);
    }
}
