package pipeLineModel;

import autoModel.Auto;

/**
 * Created by USER on 06.09.15.
 */
public class TransmissionStep implements PipelineStep {
    @Override
    public Auto doStep(Auto auto) {
        auto.setHasTransmission(true);
        return auto;
    }
}
