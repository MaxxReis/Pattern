package question2.app;

import question2.computer.Computer;
import question2.interfaces.ITransmition;

public class Main {
    private ITransmition transmition;
    
    public static void createTransmition(ITransmition transmition){
        System.out.println(transmition.getPlay().playVideo());
        System.out.println("Check: " + transmition.getStreaming().receiver());
        System.out.println(transmition.getPost().postMessage("Comment!!"));
        System.out.println("Transmition Live...");
    }
    
    public static void main(String[] args) {
        createTransmition(Computer.getInstance());
    }
}
