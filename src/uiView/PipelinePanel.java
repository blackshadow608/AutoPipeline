package uiView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
/**
 * Created by USER on 19.09.15.
 */
public class PipelinePanel extends JPanel {
    private JLabel imageChassis = new JLabel(new ImageIcon("cahssie.png"));
    private JLabel imageSuspension = new JLabel(new ImageIcon("suspension.png"));
    private JLabel imageEngine = new JLabel(new ImageIcon("engine.png"));
    private JLabel imageSalon = new JLabel(new ImageIcon("salon.png"));
    private JLabel imageCar = new JLabel(new ImageIcon("car.png"));
    private JButton startButton = new JButton("Start Line");
    private MovePipeline move = new MovePipeline(this);

    public PipelinePanel(){
        setBackground(Color.WHITE);
        this.add(imageChassis);
        this.add(startButton);
        initListeners();
    }

    public void DoStep(){
        imageChassis.setLocation(imageChassis.getX()-10, imageChassis.getY());
        this.repaint();
    }


    private void initListeners(){
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Timer timer = new Timer();
                timer.schedule(move,100,100);
            }
        });
    }
}
