package question4.middleSchool;

import question4.interfaces.IMethodEvaluation;

public class MethodEvaluation implements IMethodEvaluation{
    private static MethodEvaluation instance;
    
    private MethodEvaluation(){}
    
    public static MethodEvaluation getInstance(){
        if(instance == null)
            instance = new MethodEvaluation();
        return instance;
    }

    @Override
    public void toAnswer(int option) {
        if(option == 1)
            System.out.println("Digital answer...");
        else if(option == 2)
            System.out.println("Oral answer...");
        else
            System.out.println("Failed to answer...");
    }

    @Override
    public void toAsk(int option) {
        if(option == 1)
            System.out.println("Ask send by email...");
        else if(option == 2)
            System.out.println("Ask send by mail...");
        else
            System.out.println("Failed to Ask...");
    }
    
    
}
