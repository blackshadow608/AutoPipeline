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
    private List<JLabel> listLabels = new ArrayList<JLabel>();

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
        listLabels.add(imageChassis);
        setBackground(Color.WHITE);
        this.add(imageChassis,BorderLayout.EAST);
        this.add(startButton,BorderLayout.WEST);
        initListeners();
    }

    public void moveLabels(){
        for (JLabel currLabel: listLabels){
            currLabel.setLocation(currLabel.getX()-1, currLabel.getY());
        }
    }

    private void setNextIcon(){
        if(nextStep(iterations)){
            for(JLabel iconLabel: listLabels){
                int numberIcon = listOfSteps.indexOf(iconLabel.getIcon());
                if(numberIcon + 1 < listOfSteps.size()){
                    numberIcon++;
                }
                iconLabel.setIcon(listOfSteps.get(numberIcon));
            }
            JLabel label = new JLabel(chassie);
            this.add(label,BorderLayout.EAST);
            listLabels.add(label);
            this.revalidate();
//            label.repaint();
        }

    }

    public void DoStep(){
        setNextIcon();
        moveLabels();
        iterations++;
        this.repaint();
    }

    private boolean nextStep(int pixels){
        if(pixels == 300){
            timer.cancel();
            timer = new Timer();
            move = new MovePipeline(this);
            timer.schedule(move,1000,10);
            this.iterations = 0;
            return true;
        }
        return false;
    }

    public void stopLine(){
        timer.cancel();
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
