package pipeLineModel;

import autoModel.Auto;

/**
 * Created by USER on 06.09.15.
 */
public class WheelsStep implements PipelineStep {
    @Override
    public Auto doStep(Auto auto) {
        auto.setHasWheels(true);
        return auto;
    }
}
