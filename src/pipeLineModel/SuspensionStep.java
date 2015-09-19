package pipeLineModel;

import autoModel.Auto;

/**
 * Created by USER on 06.09.15.
 */
public class SuspensionStep implements PipelineStep {
    @Override
    public Auto doStep(Auto auto){
        auto.setHasSuspension(true);
        return auto;
    }
}
