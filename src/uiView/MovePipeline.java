package uiView;

import java.util.TimerTask;

/**
 * Created by USER on 26.09.15.
 */
public class MovePipeline extends TimerTask {

    private PipelinePanel panel;

    public MovePipeline(PipelinePanel panel){
        this.panel=panel;
    }
    @Override
    public void run() {
        panel.DoStep();
    }
}
