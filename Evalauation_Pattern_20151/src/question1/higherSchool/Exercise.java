package question1.higherSchool;

import question1.interfaces.IExercise;

public class Exercise implements IExercise{
    private static Exercise instance;
    
    private Exercise(){}
    
    public static Exercise getInstance(){
        if(instance == null)
            instance = new Exercise();
        return instance;
    }
    
    @Override
    public void toAnswer() {
        System.out.println("Asking...");
    }

    @Override
    public void toAsk() {
        System.out.println("Making a quesiton...");
    }
    
}
