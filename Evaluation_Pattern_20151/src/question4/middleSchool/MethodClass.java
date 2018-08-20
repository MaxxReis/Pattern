package question4.middleSchool;

import question4.interfaces.IMethodClass;
import question4.interfaces.IMethodEvaluation;
import question4.interfaces.IMethodExercise;
import question4.interfaces.IMethodPresentation;

public class MethodClass implements IMethodClass{
    private final IMethodPresentation mPresentation;
    private final IMethodEvaluation mEvaluation;
    private final IMethodExercise mExercise;
    private static MethodClass instance;
    
    protected MethodClass(){
        this.mEvaluation = MethodEvaluation.getInstance();
        this.mExercise = MethodExercise.getInstance();
        this.mPresentation = MethodPresentation.getInstance();
    }
    
    public static MethodClass getInstance(){
        if(instance == null)
            instance = new MethodClass();
        return instance;
    }
    
    @Override
    public IMethodPresentation createPresentation() {
        return this.mPresentation;
    }

    @Override
    public IMethodEvaluation createEvaluation() {
        return this.mEvaluation;
    }

    @Override
    public IMethodExercise createExercise() {
        return this.mExercise;
    }
    
}
