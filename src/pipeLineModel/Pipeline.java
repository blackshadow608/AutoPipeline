package pipeLineModel;

import autoModel.Auto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 06.09.15.
 */
public class Pipeline {

    List<PipelineStep> Steps = new ArrayList<PipelineStep>();

    public void addPipelineStep(PipelineStep step){
        Steps.add(step);
    }

    public void startPipeline(){
        Auto auto = new Auto();
        for(PipelineStep currentStep : Steps){
            currentStep.doStep(auto);
        }
    }

    public Auto nextStep(){
        Auto auto = new Auto();
        Auto outputAuto = auto;
        for(PipelineStep currentStep : Steps){
            outputAuto = currentStep.doStep(outputAuto);
        }
        return auto;
    }
}
