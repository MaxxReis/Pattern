package question1.higherSchool;

import question1.interfaces.IEvaluation;
import question1.interfaces.IExercise;
import question1.interfaces.IFactoryClass;
import question1.interfaces.IPresentation;

public class FactoryClass implements IFactoryClass{
    private final IPresentation presentation;
    private final IEvaluation evaluatoin;
    private final IExercise exercise;
    public static FactoryClass instance;
    
    protected FactoryClass(){
        this.presentation = Presentation.getInstance();
        this.evaluatoin = Evaluation.getInstance();
        this.exercise = Exercise.getInstance();
    }
    
    public static FactoryClass getInstance(){
        if(instance == null)
            instance = new FactoryClass();
        return instance;
    }
    
    @Override
    public IPresentation createPresentation() {
        return this.presentation;
    }

    @Override
    public IEvaluation createEvaluation() {
        return this.evaluatoin;
    }

    @Override
    public IExercise createExercise() {
        return this.exercise;
    }
}
