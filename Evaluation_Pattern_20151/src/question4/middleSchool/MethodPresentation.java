package question4.middleSchool;

import question4.interfaces.IMethodPresentation;

public class MethodPresentation implements IMethodPresentation{
    private static MethodPresentation instance;
    
    private MethodPresentation(){}
    
    public static MethodPresentation getInstance(){
        if(instance == null)
            instance = new MethodPresentation();
        return instance;
    }

    @Override
    public void toWatch(int option) {
        if(option == 1)
            System.out.println("watching on the internet...");
        else if(option == 2)
            System.out.println("watching on the television...");
        else
            System.out.println("Failed to watch...");
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
