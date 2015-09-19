package pipeLineModel;

import autoModel.Auto;

/**
 * Created by USER on 06.09.15.
 */
public class EngineStep implements PipelineStep {
    @Override
    public Auto doStep(Auto auto) {
        auto.setHasEngine(true);
        return auto;
    }
}
