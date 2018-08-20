package question4.middleSchool;

import question4.interfaces.IMethodExercise;

public class MethodExercise implements IMethodExercise{
    private static MethodExercise instance;
    
    private MethodExercise(){}
    
    public static MethodExercise getInstance(){
        if(instance == null)
            instance = new MethodExercise();
        return instance;
    }

    @Override
    public void toAnswer(int option) {
        if(option == 1)
            System.out.println("Answer send by email...");
        else if(option == 2)
            System.out.println("Answer send by mail...");
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
