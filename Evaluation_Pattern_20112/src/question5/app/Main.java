package question5.app;

import question2.factoryMp3.Mp3;
import question5.flexiblefactory.FlexibleFactory;
import question5.flexiblefactory.PlayerDigital;

public class Main {
    public static void run(){
        FlexibleFactory f = FlexibleFactory.getInstance();
        f.addPrototype("Product 1", new PlayerDigital());
        f.findPrototype("Product 1");
        
        PlayerDigital p = (PlayerDigital)f.create("Product 1");
        
        if(f.removePrototype("Product 2"))
            System.out.println("removed");
        else
            System.out.println("Not found");
    }
    
    public static void main(String[] args) {
        run();
    }
}
