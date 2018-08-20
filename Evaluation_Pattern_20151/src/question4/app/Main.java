package question4.app;

import question4.interfaces.IMethodClass;
import question4.middleSchool.MethodClass;

public class Main {
    public static void run1(IMethodClass app){
        app.createPresentation().toWatch(1);
        app.createPresentation().toAsk(1);
        app.createEvaluation().toAnswer(1);
        app.createEvaluation().toAsk(1);
        app.createExercise().toAnswer(1);
        app.createExercise().toAsk(1);
    }
    
    public static void run2(IMethodClass app){
        app.createPresentation().toWatch(2);
        app.createPresentation().toAsk(2);
        app.createEvaluation().toAnswer(2);
        app.createEvaluation().toAsk(2);
        app.createExercise().toAnswer(2);
        app.createExercise().toAsk(2);
    }

    public static void run3(IMethodClass app){
        app.createPresentation().toWatch(0);
        app.createPresentation().toAsk(3);
        app.createEvaluation().toAnswer(4);
        app.createEvaluation().toAsk(5);
        app.createExercise().toAnswer(3);
        app.createExercise().toAsk(0);
    }

    public static void main(String[] args) {
        run1(MethodClass.getInstance());
        run2(MethodClass.getInstance());
        run3(MethodClass.getInstance());
    }
    
}
