package question1.higherSchool;

import question1.interfaces.IPresentation;

public class Presentation implements IPresentation{
    private static Presentation instance;
    
    private Presentation(){}
    
    public static Presentation getInstance(){
        if(instance == null)
            return new Presentation();
        return instance;
    }

    @Override
    public void toWatch() {
        System.out.println("Watching class...");
    }

    @Override
    public void toAsk() {
        System.out.println("Making a question...");
    }
    
}
