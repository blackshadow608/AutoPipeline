package pipeLineModel;

import autoModel.Auto;

/**
 * Created by USER on 06.09.15.
 */
public interface PipelineStep {
    public Auto doStep(Auto auto);
}
