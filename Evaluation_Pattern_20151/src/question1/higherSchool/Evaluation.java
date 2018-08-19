package question1.higherSchool;

import question1.interfaces.IEvaluation;

public class Evaluation implements IEvaluation{
    private static Evaluation instance;
    
    private Evaluation(){}
    
    public static Evaluation getInstance(){
        if(instance == null)
            instance = new Evaluation();
        return instance;
    }

    @Override
    public void toAnswer() {
        System.out.println("Asking...");
    }

    @Override
    public void toAsk() {
        System.out.println("making a question...");
    }
    
    
}
