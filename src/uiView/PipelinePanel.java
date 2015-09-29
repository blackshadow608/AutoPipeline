package uiView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.Timer;

/**
 * Created by USER on 19.09.15.
 */
public class PipelinePanel extends JPanel {
    private JLabel imageChassis = new JLabel();
    private Icon chassie = new ImageIcon("cahssie.png");
    private Icon suspension = new ImageIcon("suspension.png");
    private Icon wheels = new ImageIcon("images.png");
    private Icon engine = new ImageIcon("engine.png");
    private Icon transmission = new ImageIcon("transmission.png");
    private Icon salon = new ImageIcon("salon.png");
    private Icon car = new ImageIcon("car.png");
    private JButton startButton = new JButton("Start Line");
    private MovePipeline move = new MovePipeline(this);
    Timer timer = new Timer();
    private int iterations=0;
    private List<Icon> listOfSteps = new ArrayList<Icon>();

    public PipelinePanel(){
        this.setLayout(new BorderLayout());
        imageChassis.setIcon(chassie);
        listOfSteps.add(chassie);
        listOfSteps.add(suspension);
        listOfSteps.add(wheels);
        listOfSteps.add(engine);
        listOfSteps.add(transmission);
        listOfSteps.add(salon);
        listOfSteps.add(car);
        setBackground(Color.WHITE);
        this.add(imageChassis,BorderLayout.EAST);
        this.add(startButton,BorderLayout.WEST);
        initListeners();
    }

    public void DoStep(){
        if(nextStep(iterations)){
            int numberIcon = listOfSteps.indexOf(imageChassis.getIcon());
            if(numberIcon + 1 < listOfSteps.size()){
                numberIcon++;
            }
            imageChassis.setIcon(listOfSteps.get(numberIcon));
        }
        imageChassis.setLocation(imageChassis.getX()-1, imageChassis.getY());
        iterations++;
        this.repaint();
    }

    private boolean nextStep(int pixels){
        if(pixels == 200){
            timer.cancel();
            timer = new Timer();
            move = new MovePipeline(this);
            timer.schedule(move,1000,10);
            this.iterations = 0;
            return true;
        }
        return false;
    }

    private void initListeners(){
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.schedule(move,10,10);
            }
        });
    }
}
