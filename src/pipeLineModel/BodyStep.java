package pipeLineModel;

import autoModel.Auto;

/**
 * Created by USER on 06.09.15.
 */
public class BodyStep implements PipelineStep {
    @Override
    public Auto doStep(Auto auto) {
        auto.setHasBody(true);
        return auto;
    }
}
