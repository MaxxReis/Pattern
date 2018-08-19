package question1.app;

import question1.higherSchool.FactoryClass;
import question1.interfaces.IFactoryClass;

public class Main {
    public static void doClass(IFactoryClass app){
        app.createPresentation().toWatch();
        app.createPresentation().toAsk();
        app.createEvaluation().toAnswer();
        app.createEvaluation().toAsk();
        app.createExercise().toAnswer();
        app.createExercise().toAsk();
    }
    
    public static void main(String[] args) {
        doClass(FactoryClass.getInstance());
    }
}
